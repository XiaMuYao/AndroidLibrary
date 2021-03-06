package com.android.commonlibrary.util;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Title:定时器<只能启动一个定时器>
 * description:
 * autor:pei
 * created on 2019/10/17
 */
public class TimerManager {

    private static final long DELAY_TIME=1000;//默认间隔时间

    private Timer mTimer;
    private long mDelayTime=DELAY_TIME;

    private TimerManager(){}

    private static class Holder {
        private static TimerManager instance = new TimerManager();
    }

    public static TimerManager getInstance() {
        return Holder.instance;
    }

    /**启动定时器循环调用**/
    public void startRecycle(Context context,OnTimerListener onTimerListener){
        LogUtil.i("=====定时器循环启动开启======");
        mTimer=getTimer();
        //启动定时器
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(context!=null) {
                    ((AppCompatActivity) context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            onTimerListener.schedule();
                        }
                    });
                }else{
                    onTimerListener.schedule();
                }
            }
        }, 0, mDelayTime);
    }

    /**启动定时器延时调用**/
    public void startDelay(Context context,OnTimerListener onTimerListener){
        LogUtil.i("=====定时器延时启动开启======");
        mTimer=getTimer();
        //启动定时器
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(context!=null) {
                    ((AppCompatActivity) context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            onTimerListener.schedule();
                            //取消定时器
                            TimerManager.this.cancel();
                        }
                    });
                }else{
                    onTimerListener.schedule();
                    //取消定时器
                    TimerManager.this.cancel();
                }
            }
        }, mDelayTime);
    }

    /**停止定时器**/
    public void cancel() {
        if(mTimer!=null){
            mTimer.cancel();
            mTimer=null;
            LogUtil.i("=====定时器取消======");
        }
    }

    /**设置时间间隔**/
    public TimerManager setDelayTime(long delayTime) {
        mDelayTime = delayTime;
        return TimerManager.this;
    }

    private Timer getTimer(){
        if(mTimer==null){
            mTimer=new Timer();
        }else{
            mTimer.cancel();
            mTimer=null;
            mTimer=new Timer();
        }
        return mTimer;
    }


    public interface OnTimerListener{
        void  schedule();
    }

}

//===============调用实例===============
//
//        //定时器循环
//        TimerManager.getInstance()
//                .setDelayTime(1000)//设置时间间隔，默认1000(即1秒)
//                //context设置为null时可执行非ui的逻辑，context不为null时可更新ui
//                .startRecycle(MainActivity.this,new TimerManager.OnTimerListener() {
//                    @Override
//                    public void schedule() {
//                        //循环执行逻辑
//                        //......
//                    }
//                });
//
//        //定时器延时
//        TimerManager.getInstance()
//                .setDelayTime(1000)//设置时间间隔，默认1000(即1秒)
//                //context设置为null时可执行非ui的逻辑，context不为null时可更新ui
//                .startDelay(MainActivity.this,new TimerManager.OnTimerListener() {
//                    @Override
//                    public void schedule() {
//                        //延时执行逻辑
//                        //......
//                    }
//                });
//
//        //取消定时器
//        TimerManager.getInstance().cancel();

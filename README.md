
[![](https://jitpack.io/v/ShaoqiangPei/AndroidLibrary.svg)](https://jitpack.io/#ShaoqiangPei/AndroidLibrary)

### 库引用说明
在自己项目的project对应的build.gradle里面添加如下代码：
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
在你项目的app_module对应的build.gradle里面引用此库,如下：
```
  dependencies {
	        implementation 'com.github.ShaoqiangPei:AndroidLibrary:Tag'
	}
```
1.1.0以下版本(以1.0.0版为例),则在app_module对应的build.gradle里面具体引用如下：
```
  dependencies {
	        implementation 'com.github.ShaoqiangPei:AndroidLibrary:v1.0.0'
	}
```
1.1.0及以上版本(以1.1.0版为例),则在app_module对应的build.gradle里面具体引用如下：
```
  dependencies {
	        implementation 'com.github.ShaoqiangPei:AndroidLibrary:1.1.0'
	}
```
在你的项目中自定义一个Application继承于ComContext,类似如下：
```
public class AppContext extends ComContext {

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
```
在你项目的mainfast.xml中声明自己的application，类似如下：
```
 <application
        android:name=".AppContext"//声明自己的Application
	//以下省略
        //......
        >
    //此处省略
    //......

  </application>
```
### 使用说明索引
#### 一. 启动页工具类  
[LaunchUtil](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/LaunchUtil%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md
)
#### 二. 用户权限申请  
[PermissionHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/PermissionHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md
)
#### 三. Util工具  
[SpUtil](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/SpUtil%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md)                  ————— SharedPreferences存储类  
AppUtil ————— app设备信息相关类  
[Badgetor](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/Badgetor%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 未读消息小圆点工具类  
[Clipboard](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/ClipboardHelper使用说明.md) ————— 剪切板监听帮助类  
CollectionUtil ————— 集合处理工具  
[CompareSortor](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/CompareSortor%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md)————— List集合排列工具类  
DateUtil ————— 日期相关工具处理类  
DoubleClickUtil ————— 防双击，防抖功能类  
FileUtil ————— 文件工具类  
[FlashHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/FlashHelper使用说明.md) ————— 控件闪烁帮助类  
FlyAnimtor ————— 物品飞入购物车效果工具类(贝塞尔曲线)  
FormatUtil ————— 数字给格式化工具类  
GroupUtil ————— 分组工具类  
GsonUtil ————— gson解析工具类  
KeyboardUtil ————— 软键盘控制工具类  
LogUtil ————— log打印工具类  
MainfastUtil ————— mainfast信息获取工具类  
MD5Util ————— MD5工具类  
NetUtil ————— 网络工具类  
[NotificationHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/NotificationHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 通知栏工具类
RegularUtil ————— 正则表达式工具类  
ScreenUtil ————— 屏幕工具类  
SDCardUtil ————— 内存卡工具类  
ShotShareUtil ————— 截屏分享工具类  
[SoftKeyBoardHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/SoftKeyBoardHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 监听软键盘 显示/隐藏 工具类  
SpannableStringUtil ————— 设置文本工具类  
StatusBarUtil ————— 状态类工具类  
StringUtil ————— 字符串处理工具类  
[TimeFlag](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/TimeFlag%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md
) ————— 时间节点器(主要用于统计某个 方法/代码块 执行耗时)   
[TimerManager](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/TimerManager使用说明.md) ————— 定时器工具类(只能建立一个定时器)  
[RxTimer](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/RxTimer%E5%AE%9A%E6%97%B6%E5%99%A8%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 定时器工具类(可建立多个定时器)  
ToastUtil ————— 吐司工具类  
UriUtil ————— uri转换工具类  
VibratorUtil ————— 手机震动工具类  
ViewUtil ————— 控件相关工具类  
[VersionHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/VersionHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— app版本判断工具类  
WakeUpUtil ————— 屏幕唤醒工具类  
#### 四. 可序列化基类
[BaseEntity](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/BaseEntity%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 数据实体基类  
[ResponseData](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/androidlibrary/commonlibrary/src/main/java/com/android/commonlibrary/entity/ResponseData.java) ————— 网络通讯返回数据最外层数据结构体(备用)  
[RxData](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/androidlibrary/commonlibrary/src/main/java/com/android/commonlibrary/entity/RxData.java) ————— RxBus消息传递数据实体  
[UIData](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/androidlibrary/commonlibrary/src/main/java/com/android/commonlibrary/entity/UIData.java) ————— 用于业务逻辑线程更新主线程数据传值的数据实体  
#### 五. 缓存
[Cache](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/Cache%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— app内存缓存  
[SimpleCache](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/SimpleCache%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 文件式缓存 
#### 六. Activity 辅助类
[AppActivityManager](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppActivityManager%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md
) ————— App中Activity管理类  
[AppHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md
) ————— Activity基类帮助类  
[IntentHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/IntentHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md
) ————— Activity跳转帮助类(包含activity间的各种跳转和传值)  
#### 七. Fragment 辅助类  
[AppFragmentManager](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppFragmentManager%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— Fragment跳转,移除管理类(采用非回退栈管理方式)  
[FragmentStackManager](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/FragmentStackManager%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— Fragment跳转,移除管理类(采用回退栈管理方式) 
#### 八. Activity & Fragment
[AppActivity](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppActivity%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md
)————— Activity基类  
[AppFragActivity](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppFragActivity%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 集成Fragment时需要用到的activity,主要用来处理Fragment和activity的返回键功能  
[AppFragment](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppFragment%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— Fragment基类,包含Fragment跳转activity方法，fragment向fragment传值方法和Fragmnet向activity回传值的方法  
#### 九. mvp-frame(MVP架构)
[PreActivity](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/mvp-frame%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— MVP架构Activity基类  
[PreFragActivity](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/mvp-frame%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— MVP架构Activity基类(Activity中含Fragment加载时使用)  
[PreFragment](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/mvp-frame%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— MVP架构Fragment基类  
[PrePresenter](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/mvp-frame%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— T-MVPPresenter基类  
[PreView](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/mvp-frame%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— MVP-View基类  
[UIPresenter](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/UIPresenter%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 更新主线程ui帮助类  
#### 十. Dialog  
[LoadingDialog](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/LoadingDialog%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 网络通讯加载dialog(针对通讯的loading)  
[DefaultDialogFragment](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/DefaultDialogFragment%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md
) ————— 创建(系统)默认dialog  
[AppDialogFragment](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppDialogFragment使用说明.md) ————— 自定义dialog的父类  
[SyDialogFragment](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/SyDialogFragment使用说明.md) ————— 通用dialog  
[SyDialogHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/SyDialogHelper使用说明.md) ————— SyDialogFragment帮助类，用以快速显示通用dialog  
#### 11. PopupWindow 
[AppPopupWindow](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppPopupWindow使用说明.md) ————— PopupWindow基类  
#### 12. RecyclerView & Adapter  
[DefaultAdapter](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/androidlibrary/commonlibrary/src/main/java/com/android/commonlibrary/adapter/item_adapter/DefaultAdapter.java) ————— 原生RecyclerView的adapter使用示例(仅做参考)  
[AdapterHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AdapterHelper使用说明.md) ————— 适配器帮助类  
[ComAdapter](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/ComAdapter使用说明.md) ————— RecyclerView通用适配器基类  
[GroupAdapter](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/GroupAdapter使用说明.md) ————— RecyclerView分组适配器基类  
#### 13. BroadcastReceiver 
[AppInstallReceiver](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppInstallReceiver使用说明.md) ————— 监听app安装完成，替换完成和卸载完成的广播  
[AppReceiver](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppReceiver使用说明.md) ————— 全局广播使用工具类(注册的广播剧本全局性，可接收其他app的广播消息)  
[AppLocalReceiver](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/AppLocalReceiver使用说明.md) ————— 本广播使用工具类(具备安全性，适合本app内部消息通讯)  
[NetworkReceiver](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/NetworkReceiver使用说明.md) ————— 监听网络实时链接状态广播工具类  
#### 14. Service
[ServiceHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/ServiceHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 服务帮助类父类(主要为本地服务和远程服务的帮助类提供公共方法)  
[LocalServiceHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/LocalServiceHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— "非绑定式"服务帮助类  
[RemoteService](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/RemoteService%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— "绑定式"服务基类，供自建的“绑定式”服务继承  
[RemoteServiceHelper](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/RemoteServiceHelper%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— "绑定式"服务帮助类   
####  15. 消息事务总线
[RxBus](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/RxBus%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— RxBus基于 RxJava2.x实现事务总线  

#### X. widget
[MaskButton](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/MaskButton使用说明.md) ————— 带点击效果的button  
[SearchConfig](
https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/SearchConfig使用说明.md) ————— SearchView使用帮助类  
[ClearEditText](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/ClearEditText%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 带删除按钮的输入框(左侧可设置小图标)  
[ImageTextView](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/ImageTextView%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 带图标的TextView(可在TextView的上面，或者下面，或者左面，或者右边设置图标，还能设置图标尺寸)  
[TitleBar](https://github.com/ShaoqiangPei/AndroidLibrary/blob/master/read/TitleBar%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E.md) ————— 自定义标题栏  





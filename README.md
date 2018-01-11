# Android入门Demo合集
该项目包含了 第三阶段和第四阶段的大部分Demo，全部都能调试运行。
作为一个iOS开发者，学习Android，按说是轻车熟路，但开始还是一头雾水，主要前期环境配置很费周折，也不太理解AndroidUI编程机制，开始想直接学习公司项目的Android版，但不如按着学习路线一步步来的快，毕竟项目已经高度集成，看到的都是冰山一角，不能理解其本质。

很多demo也都是百度来的，附有地址。

Android学习路线
第一阶段：Java面向对象编程

1.Java基本数据类型与表达式，分支循环。

2.String和StringBuffer的使用、正则表达式。

3.面向对象的抽象，封装，继承，多态，类与对象，对象初始化和回收；构造函数、this关键字、方法和方法的参数传递过程、static关键字、内部类，Java的垃极回收机制，Javadoc介绍。

4.对象实例化过程、方法的覆盖、final关键字、抽象类、接口、继承的优点和缺点剖析；对象的多态性：子类和父类之间的转换、抽象类和接口在多态中的应用、多态带来的好处。

5.Java异常处理，异常的机制原理。

6.常用的设计模式：Singleton、Template、Strategy模式。

7.JavaAPI介绍：种基本数据类型包装类，System和Runtime类，Date和DateFomat类等。

8.Java集合介绍：Collection、Set、List、ArrayList、Vector、LinkedList、Hashset、TreeSet、Map、HashMap、TreeMap、Iterator、Enumeration等常用集合类API。

9.Java I/O输入输出流：File和FileRandomAccess类，字节流InputStream和OutputStream，字符流Reader和Writer，以及相应实现类，IO性能分析，字节和字符的转化流，包装流的概念，以及常用包装类，计算机编码。

10.Java高级特性：反射、代理和泛型。

11.多线程原理：如何在程序中创建多线程(Thread、Runnable)，线程安全问题，线程的同步，线程之间的通讯、死锁。

12.Socket网络编程。

第二阶段：Java Web开发

1.Java解析XML文件DOM4J。
2.MySql数据库的应用、多表连接查询的应用。
3.Jsp和Servlet应用。
4.Http协议解析。
5.Tomcat服务器的应用配置。
6.WebService服务配置应用。

第三阶段：android UI编程

1、Android开发环境搭建：Android介绍，Android开发环境搭建，第一个Android应用程序，Android应用程序目录结构。
2、Android初级控件的使用：

TextView控件的使用
Button控件的使用方法
EditText控件的使用方法
ImageView的使用方法
RadioButton的使用方法
Checkbox的使用方法
Menu的使用方法

3、Android高级控件的使用：

Autocompletion的使用方法
ListView的使用方法
GridView的使用方法
Adapter的使用方法
Spinner的使用方法 https://www.cnblogs.com/mercuryli/p/4926177.html
Gallary的使用方法 已经弃用 http://blog.csdn.net/hellogv/article/details/5961525
ScrollView的使用方法 http://download.csdn.net/download/plokmju88/5827505

4、对话框与菜单的使用：
https://www.cnblogs.com/gzdaijie/p/5222191.html
Dialog的基本概念
AlertDialog的使用方法
DatePickerDialog的使用方法
Menu的使用方法
自定义Menu的实现方法

5、控件的布局方法：
https://www.cnblogs.com/ludashi/p/4883915.html
线性布局的使用方法
相对布局的使用方法
表格布局的使用方法

6、多Acitivity管理：

AndroidManifest.xml文件的作用 ---相当于iOS的info.plist http://blog.csdn.net/clpliji/article/details/7469466
Intent的使用方法  http://blog.csdn.net/xiao__gui/article/details/11392987
使用Intent传递数据的方法  https://www.cnblogs.com/zhouhb/p/4170142.html
启动Activity的方法
IntentFilter的使用方法
Activity Group的使用方法 --相当于iOS的UITabbarController，已经被废弃，被Fragment替代
https://www.cnblogs.com/answer1991/archive/2012/05/08/2489844.html
Fragment的使用方法
http://blog.csdn.net/xiangzhihong8/article/details/38370237

7、自定义控件实现方法：

自定义ListView的实现方法  https://www.cnblogs.com/ludashi/p/5064579.html
可折叠ListView的使用方法
自定义Adapter的实现方法
自定义View的实现方法
动态控件布局的上实现方法


第四阶段：android网络编程与数据存储

1、基于Android平台的HTTP通讯：http://www.jianshu.com/p/3141d4e46240

Http协议回顾
Apache Commons 工具包介绍
使用Get方法向服务器提交数据的方法
解析服务器响应数据的方法
使用POST方法向服务器提交数据的实现方法
向服务器提交非文本数据的实现方法
使用Http协议实现多线程下载
使用Http协议实现断点续传

RxJava+Retrofit+OkHttp实现网络请求 http://blog.csdn.net/column/details/13297.html
一篇文章带你走通 OkHttp+Retrofit+Rxjava http://blog.csdn.net/u013647382/article/details/55682548

2、Android数据存储技术：
http://blog.csdn.net/codeeer/article/details/30237597/

SQLite3数据库简介
SQL语句回顾
SQLite3编程接口介绍
SQLite3事务管理
SQLite3游标使用方法
SQLite3性能分析
访问SDCard的方法
访问SharedPreferences的方法

3、ContentProvider使用方法：ContentProvider实现共享数据、URI的解析与UriMatcher、ContentUris的使用、使用ContentResolver操作ContentProvider、ContentProvider的监听Android当中的异步操作：Handler的使用方法；异步任务的基本概念；AsyncTask的使用方法。


第五阶段：android手机硬件管理

1、地图及定位技术：GPS简介；LocationManager的使用方法；在Google Map上添加标记的方法；查询某地附近建筑的方法；使用Google Map实现点对点导航。
2、传感器使用方法：方向、加速度(重力)、光线、磁场、距离、温度等传感器的使用。
3、近场通信技术：NFC技术简介；NFC技术是用场景介绍；NFC技术实现方法。
4、媒体管理技术：MediaPlayer的使用方法。
5、触摸屏技术：手势识别；多点触摸技术。

第六阶段：Android图形编程技术

1、图形处理基础：2D图形编程基础；
2、点、线、面等基本图形元素绘制方法；
3、Android动画框架简介；
4、位移动画的实现方法；
5、淡入淡出动画的实现方法；
6、旋转动画的实现方法；
7、Matrix的使用方法。

第七阶段：Android游戏开发

1、Android游戏开发：Android游戏开发概述；
2、SurfaceView的使用方法；
3、物理小球技术；
4、碰撞检测技术；
5、图片、文字和背景音乐等资源的使用方法；
6、游戏引擎基础概念；
7、Cocoa2d-Android引擎使用方法；
8、OpenGL ES使用方法。

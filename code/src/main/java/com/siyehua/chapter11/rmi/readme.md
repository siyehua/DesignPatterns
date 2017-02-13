#Java RMI
RMI提供了客户辅助对象和服务辅助对象,为客户辅助对象创建和服务对象相同的方法.RMI的好处在于你不必亲自写任何网络或
I/O代码.客户程序调用远程方法(即真正的服务所在)就和在运行在客户自己本地的JVM上对对象进行正常方法调用一样.

RMI的步骤分为两步,一是只做远程服务,二是客户端获取Stub对象,完成交互.下面就这两个方面详细说明.

##制作远程服务
####制作远程接口.
远程接口定义出可以让客户远程调用的方法,客户将作为服务的类类型.Sub和实际的服务都实现此接口.
[代码](/code/src/main/java/com/siyehua/chapter11/rmi/MyRemote.java)

####制作远程实现.
这是实际工作的类,为远程接口中定义的远程方法提供了真正的实现.这就是客户真正想要调用方法的的对象(例如,我们的GumballMachine).
[代码](/code/src/main/java/com/siyehua/chapter11/rmi/MyRemoteImpl.java)

####利用rmic删除该的stub和skeleton.
这就是客户和服务的辅助类.通过rmic工具生成,自己无需编写.(注意高版本的jdk已经不再需要skeleton骨架辅助了)

 * 首先使用cmd控制台,cd进入到MyRemoteImpl目录,使用"javac *.java"命令 编译MyRemote与MyRemoteImpl.(因为MyRemoteImpl继承了MyRemote,所以这两个类要同时编译)
 * 使用"cd.."回退上一级命令,一直退到整个module目录位置,例如,MyRemoteImpl的位置是:F:\WorkSpace_Sudio\DesignPatterns\code\src\main\java\com\siyehua\chapter11\rmi\MyRemoteImpl.java,MyRemoteImpl的包名是:com.siyehua.chapter11.rmi,则cmd应该处于F:\WorkSpace_Sudio\DesignPatterns\code\src\main\java位置
 * 此时,输入命令"rmic com.siyehua.chapter11.rmi.MyRemoteImpl"编译,生成MyRemoteImpl_Stub.class文件

####启动RMI registy(rmiregistry)
rmiregistry相当于一个中转传输服务,用来接受远程服务对象将代理注册到这里,而对于客户端,就是一个可方法的地址,可以从中查询到代理的位置.

 * 使用命令提示符cd命令,定位到当前module的位置,与上面步骤中的一致:F:\WorkSpace_Sudio\DesignPatterns\code\src\main\java
 * 输入命令"rmiregistry"即可启动服务(注意服务器必须要能找到MyRemote这个远程服务接口,所以目录必须对,否则后面的远程服务无法注册到这个中转服务)

####开始远程服务
前面说了,必须让中转对象开始运行,否则无法将服务注册到RMIregistry.注册完成,远程服务就完成了.

```java
try {
    MyRemote service = new MyRemoteImpl();
    Naming.rebind("RemoteHello", service);
} catch (Exception e) {
    e.printStackTrace();
}
```
运行,即将RemoteHello这个服务对象注册到了中转服务上,客户端根据RemoteHello这个key,就可以找到它了.

##客户端获取Stub
客户端必须获取Stub对象(我们的代理,即MyRemote类的对象)以调用其中的方法.所以我们需要RMI Registry的帮忙.客户从Registry
中寻找(lookup)代理.注意(客户端这边也必须持有MyRemote类,因为MyRemote是客户端和服务端共同约定的接口)

```java
try {
    MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
    String s = service.sayHello();
    System.out.print(s);
} catch (Exception e) {
    e.printStackTrace();
}
```

##注意
对于RMI的常见错误
1. MyRemoteImpl.java必须编译成MyRemoteImpl.class,RMI才能生成对应的_Stub.class
2. 编译的时候仅编译MyRemoteImpl.java一个文件,因为其继承了MyRemote,也必须同时编译
3. 生成MyRemoteImpl_Stub.class错误,注意当前的cd路径,必须是module根目录
4. 启动rmiregistry错误,路径必须是module根目录
5. 忘了让变量和返回值的类型成为可序列化的类型.
6. 忘了给客户端提供Stub类

##类图
![Class Graph](/code/src/main/java/com/siyehua/chapter11/chapter11_001.jpg)

![Class Graph](/code/src/main/java/com/siyehua/chapter11/chapter11_002.jpg)




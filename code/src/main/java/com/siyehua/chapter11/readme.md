# 代理模式
代理模式为另一个对象提供一个替身或占位符,以便控制对这个对象的访问.把代理理解为"中介",最合适不过.

使用代理模式创建代表对象,让代表对象控制某对象的访问,被代理的对象可以是远程的对象,创建开销打的对象或需要安全控制的对象.
本章篇幅较长,重点讲解了三个代理模式:远程代理,虚拟代理,动态代理.

模式|描述
---|---
装饰者|包装另外一个对象,并提供额外的行为
适配器|包装另一个对象,并控提供不同的接口.
代理|包装另外一个对象,并控制对它的访问.
外观|包装许多对象以简化他们的接口.

## 类图
![Image](/code/src/main/java/com/siyehua/chapter11/chapter11_003.jpg)


## 远程代理
远程代理可以作为另一个JVM上对象的本地代表.调用代理的方法,会被代理利用网络转发到远程执行,并且结果会通过网络返回给代理,再由代理将结果转给客户.
这个"中介"就好像猎头一样,通过猎头,求职者和公司可以对话.

![Image](/code/src/main/java/com/siyehua/chapter11/chapter11_004.jpg)


远程代理控制访问远程对象,此处使用了Java的RMI作为讲解.
[详解](/code/src/main/java/com/siyehua/chapter11/rmi)

### Android/Java实例
Android网络请求就是一个远程代理,APP不直接执行服务器的方法,通过网络代理,获取数据.

## 虚拟代理
虚拟代理控制访问创建开销大的资源.(假设一个对象特别复杂,可以使用虚拟代理简化).虚拟代理经常知道我们真正需要一个对象的时候才创建它.
例如买房的"中介",通过他,可以大大简化手续,但是中介有可能多收你的钱.

![Image](/code/src/main/java/com/siyehua/chapter11/chapter11_005.jpg)

[详解](/code/src/main/java/com/siyehua/chapter11/virtual)

### Android/Java实例
Android ImageView加载网络图片时,ImageView由于非常占内存,可以延迟初始化,通过一个对象(Poxy),
让Poxy对象去请求网络,请求过程中显示"正在加载...",下载完图片,再新建ImageView显示图片.


## 保护代理
保护代理基于权限控制对资源的访问.
例如房子可以使用,买卖.但租房者只有使用权,没有买卖权,而户主则两个权利都有.

![Image](/code/src/main/java/com/siyehua/chapter11/chapter11_006.jpg)

此处使用Java动态代理技术来了创建Proxy类,而我们的任务是告诉Proxy类要做什么.
[详解](/code/src/main/java/com/siyehua/chapter11/dynamic)

### Android/Java代理

## 要点
 * 代理模式为另一个对象提供代表,仪表控制客户对对象的访问,管理访问的方式有许多种.
 * 远程道理管理客户和远程对象之间的交互.
 * 虚拟代理控制访问实例化开销大的对象
 * 保护代理基于调用者控制对对象方法的访问
 * 代理模式有许多变体,例如:缓存代理,同步代理,防火墙代理,写入时复制代理.
 * 装饰者模式为对象加上行为,而代理则是控制
 * Java内置的代理支持,可以根据需要建立动态代理,并将所有调用分配到所选的处理器.


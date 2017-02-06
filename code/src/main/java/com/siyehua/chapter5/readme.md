#单例模式
单例模式确保一个类只有一个实例,并提供一个全局访问点.

##多线程注意问题

标准单例模式是这样的

```java
public class Singleton {

     private Singleton() {
     }

     public static  Singleton singleton;

     public static Singleton getInstance() {
         if (singleton == null) {
              singleton = new Singleton();
         }
         return singleton;
     }
 }
```

假设有多个线程同事访问,就可以产生两个甚至更多实例.解决方案:

1. 如果getInstance()的性能对应用程序来说不重要,可以直接在方法上加同步锁

```java
public class Singleton {

     private Singleton() {
     }

     public static  Singleton singleton;

     public synchronized static Singleton getInstance() {
         if (singleton == null) {
              singleton = new Singleton();
         }
         return singleton;
     }
 }
```

2. 假设创建或运行单例类的负责不中,可以使用"急切"创建实例

```java
public class Singleton {

     private Singleton() {
     }

     public static  Singleton singleton = new Singleton();

     public  static Singleton getInstance() {
         return singleton;
     }
 }
```

3. 最好的方式是使用双重检查,并配合关键字volatile(jdk1.5及以上).

```java
public class Singleton {

    private Singleton() {
    }

    public static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
```

##要点
 * 确定在性能和资源上的exM值,然后小心地选择适当的方案来实现单例,以解决多线程问题.
 * 如果不是采用jdk1.5及以上版本,双重加锁会失效



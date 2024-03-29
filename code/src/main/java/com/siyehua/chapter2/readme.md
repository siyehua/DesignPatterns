# 观察者模式
观察者模式定义了对象之间的一对多的依赖,这样依赖,担当一个对象改变状态时,它的所有依赖者都会收到通知并自动更新.

## 要点
 * 可观察者与观察者用松耦合方式结合,可观察者不知道观察者的细节,只知道观察者实现了观察者接口.
 * 使用观察者模式,你可以从被观察者出推(push)或拉(pull)数据(当更新大量的数据,而大部分都不是自己需要的时候,可以采用拉方式)
 * 有多个观察者时,不可以依赖特定的通知次序.
 * 注意Java自定的被观察者java.util.Observable是一个类,使用它继承,这就违背了:<b>多用组合,少用继承</b>原则.
 * 当类已经继承了其他类时,可以自己去实现观察者模式框架


# 类图
![Class Graph](/code/src/main/java/com/siyehua/chapter2/chapter2_001.jpg)

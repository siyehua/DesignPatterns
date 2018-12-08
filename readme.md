# Java Design Patterns(Java设计模式)
![Conver](/img/conver.jpg)

Head First系列丛书的图文,以及排版方式,还有内容都非常的吸引人,让读者学习技术的时候不会感到疲倦,
Head First设计模式不仅仅讲解了设计模式,还总结了应该怎么高效的学习,是一本非常不错的书,哪怕你已经掌握了大部分的
设计模式,我仍然推荐你学习它的学习方法

## 注意事项
1. 慢一点,你理解的越多,需要记得就越少
2. 勤做练习,自己记笔记
3. 阅读"The are no Dumb Questions"部分.
4. 上床睡觉之前不要再看别的书了,或者至少不要同时看其他有难度的东西.
5. 要喝水,而且要多喝水.
6. 大声说出来.
7. 听听你的大脑怎么说.
8. 要有点感觉!
9. 设计一些东西.

## 章节
[设计模式入门(策略模式)](/code/src/main/java/com/siyehua/chapter1)

[观察者模式](/code/src/main/java/com/siyehua/chapter2)

[装饰者模式](/code/src/main/java/com/siyehua/chapter3)

[工厂模式](/code/src/main/java/com/siyehua/chapter4)

[单例模式](/code/src/main/java/com/siyehua/chapter5)

[命令模式](/code/src/main/java/com/siyehua/chapter6)

[适配器与外观模式](/code/src/main/java/com/siyehua/chapter7)

[模板方法模式](/code/src/main/java/com/siyehua/chapter8)

[迭代器与组合模式](/code/src/main/java/com/siyehua/chapter9)

[状态模式](/code/src/main/java/com/siyehua/chapter10)

[代理模式](/code/src/main/java/com/siyehua/chapter11)

[复合模式](/code/src/main/java/com/siyehua/chapter12)

[与设计模式相处](/code/src/main/java/com/siyehua/chpter13)

## 设计箱内的工具
### OO基础
 * 抽象
 * 封装
 * 多态
 * 继承

### OO原则
 * 封装变化的部分
 * 多用组合,少用继承
 * 针对接口编程,不针对实现编程
 * 为交互之间的松耦合设计而努力
 * 对扩展开放,对修改关闭
 * 依赖抽象,不依赖具体类
 * 最少知道原则:值和你的密友谈话.(墨忒尔法则)
 * 由超类主控一切,当他们需要的时候,自然会调用子类.(别找我,我会找你)
 * 类应该只有一个改变的理由

### OO模式
模式|定义
---|---
策略模式|定义算法族,分别封装起来,让他们之间可以互相替换,此模式让算法的变化独立于使用算法的客户.
观察者模式|在对象之间定义一对多的依赖,这样依赖,当一个对象改变状态,依赖他的对象都会收到通知,并自动更新.
装饰者模式|动态的将责任夫家到对象上.想要扩展功能,装饰者提供有别于继承的另一种选择
抽象工厂模式|提供一个接口,御用创建相关或者依赖对象的家族,而不需要明确指定具体类.
工厂方法|定义了一个创建对象的接口,但由子类决定要实例化的类是哪一个.工厂方法让类把实例化推迟到子类.
单例模式|确保一个雷只有一个实例,并提供一个全局访问点.
命令模式|将请求封装成对象,这可以让你使用不同的请求,队列,或者日志请求,用来参数化其他对象.命令模式也可以支持撤销操作.
适配器模式|将一个类的接口,转换成客户期望的另一个接口.是配给让原本不兼容的类可以合作无间.
外观模式|提供了一个统一的接口,用来访问子系统中的一群接口.外观定义了一个高层接口,让子系统更加容易使用.
模板方法模式|在一个方法中定义一个算法的股价,而将一些步骤延迟到子类中. 模板方法使得子类可以在不改变算法结构的情况下,重新定义算法中的某些步骤.
迭代器模式|提供一种方法顺序访问一个聚合对象中的各个元素,而又不暴露其内部的表示.
组合模式|允许你将对象组成树形结构来表现"整体/部分"的层次关系.组合能让客户以一致的方式处理个别对象和对象组合.
状态模式|允许对象在内部状态改变时沟边它的行为,对象看起来好像修改了它的类.
代理模式|为另一对象提供一个提神或占位符以访问这个对象.
复合模式|复合模式结合两个或以上的模式,组成一个解决方案,解决一再发生的一般性问题.(MVC,MVP)







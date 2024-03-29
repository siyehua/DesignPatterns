# 适配器与外观模式
本章主要讲解了适配器模式和外观模式,之所以讲解外观模式,是因为
外观模式和适配器模式很像,但是本质上的意义是不同的

模式|意图
---|---
装饰者|不改变接口,但假如心的责任
适配器|将一个接口转成另外一个接口
外观|让接口(使用)更简单

## 适配器模式
适配器模式将一个类的接口,转换成客户期望的另一个接口.适配器让原本接口不兼容的类可以合作无间.

![Class Graph](/code/src/main/java/com/siyehua/chapter7/chapter7_001.jpg)


## 外观模式
外观模式提供了一个统一的接口,用来访问子系统中的一群接口.外观定义了一个高层接口,让紫雪松更加容易使用.

![Class Graph](/code/src/main/java/com/siyehua/chapter7/chapter7_002.jpg)

## 要点
 * 当需要使用一个现有的类而其接口并不符合你的需求时,就使用适配器.
 * 当需要简化并统一一个很大的接口或者一群复杂的接口时,使用外观.
 * 适配器将一个对象包装起来以改变其接口,装饰着将一个对象包装起来以增加新的行为和责任,而外观将一群对象"包装"起来以简化其接口


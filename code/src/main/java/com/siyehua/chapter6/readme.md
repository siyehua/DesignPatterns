# 命令模式
命令模式将"请求"封装成对象,一遍使用不同的请求,队列或者日志来参数化其他对象.
命令模式也支持可撤销的操作.

## 要点
 * 命令模式将发出请求的对象和执行请求的对象解耦.
 * 在被解耦的亮着之间是通过命令对象进行沟通的.命令对象封装了接受者和一个或一组动作.

## 类图
![Class Graph](/code/src/main/java/com/siyehua/chapter6/chapter6_001.jpg)



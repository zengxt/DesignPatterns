# 面向对象编程设计模式学习
这里总结一些常用的Java编程设计模式
<br/>
<br/>

## 单例模式
&emsp;&emsp;Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。 让类自身负责保存它的唯一实例。这个类可以保证没有其他实例可以被创建，并且它可以提供一个访问该实例的方法。

&emsp;&emsp;1、私有化类的构造函数，防止类外部的代码创建该类的实例。</font>

&emsp;&emsp;所有类都有构造方法，不编码则系统默认生成空的构造方法，若有显示定义的构造方法，默认的构造方法机会失效。

&emsp;&emsp;2、有一个可以获取该类实例的公共方法，该方法要是静态的。</font>

&emsp;&emsp;CSDN博客地址：https://blog.csdn.net/zengxiantao1994/article/details/79541844
<br/>
<br/>

## 工厂模式（简单工厂、工厂方法、抽象工厂）
&emsp;&emsp;简单工厂模式又叫静态工厂方法模式（Static Factory Method Pattern），是通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。

&emsp;&emsp;工厂方法模式（Factory Method），定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类。

&emsp;&emsp;抽象工厂模式（Abstract Factory）：提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类。

&emsp;&emsp;CSDN博客地址：https://blog.csdn.net/zengxiantao1994/article/details/87938348
<br/>
<br/>

## 代理模式（静态代理、动态代理）
&emsp;&emsp;代理模式的定义：给某一个对象提供一个代理，并由代理对象控制对原对象的引用。

&emsp;&emsp;CSDN博客地址：https://blog.csdn.net/zengxiantao1994/article/details/89388959
<br/>
<br/>

## 观察者模式
&emsp;&emsp;观察者模式又叫做发布-订阅（Publish/Subscribe）模式。观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有的观察者对象，使他们能够自动更新自己。

&emsp;&emsp;CSDN博客地址：https://blog.csdn.net/zengxiantao1994/article/details/89703316
<br/>
<br/>

## 适配器模式
&emsp;&emsp;适配器模式：是将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

&emsp;&emsp;CSDN博客地址：https://blog.csdn.net/zengxiantao1994/article/details/89978125
<br/>
<br/>

## 享元模式
&emsp;&emsp;所谓享元模式就是运行共享技术有效地支持大量细粒度对象的复用。

&emsp;&emsp;CSDN博客地址：https://blog.csdn.net/zengxiantao1994/article/details/90020596
<br/>
<br/>

## 职责链模式
&emsp;&emsp;职责链模式（Chain of Responsibility）：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。

&emsp;&emsp;CSDN博客地址：https://blog.csdn.net/zengxiantao1994/article/details/90199810

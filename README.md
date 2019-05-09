# 面向对象编程设计模式学习
这里总结一些常用的Java编程设计模式
<br/>
<br/>

## 单例模式
&emsp;&emsp;Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。 让类自身负责保存它的唯一实例。这个类可以保证没有其他实例可以被创建，并且它可以提供一个访问该实例的方法。

&emsp;&emsp;<font color="red">1、私有化类的构造函数，防止类外部的代码创建该类的实例。</font>

&emsp;&emsp;所有类都有构造方法，不编码则系统默认生成空的构造方法，若有显示定义的构造方法，默认的构造方法机会失效。

&emsp;&emsp;<font color="red">2、有一个可以获取该类实例的公共方法，该方法要是静态的。</font>

&emsp;&emsp;CSDN博客地址：https://blog.csdn.net/zengxiantao1994/article/details/79541844
<br/>
<br/>

## 工厂模式（简单工厂、工厂方法、抽象工厂）

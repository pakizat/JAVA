# day06学习笔记

1. ## 继承

![image-20250321113739377](assets/image-20250321113739377.png)

![image-20250321114242248](assets/image-20250321114242248.png)

- ### 权限修饰符

![image-20250321160945528](assets/image-20250321160945528.png)

![image-20250321161851308](assets/image-20250321161851308.png)

- ### 继承的特点

![image-20250321162136076](assets/image-20250321162136076.png)

![image-20250321162250387](assets/image-20250321162250387.png)

![image-20250321163950617](assets/image-20250321163950617.png)

![image-20250321164117080](assets/image-20250321164117080.png)

- 一个类要么默认继承 Object 要么间接 继承  要么默认继承

![image-20250324170202754](assets/image-20250324170202754.png)

- ### 方法重写

![image-20250324170850096](assets/image-20250324170850096.png)

- 重写注解 @Override 会检查重写的正确性 可读性也更好

- 重写规范 ：声明不变，重新实现

- 重写应用场景 ：当子类觉得父类方法不好用，或者不满足自己的需求时，就可以用方法重写

- #### 案例

  子类重写toString  输出对象信息 而不是 对象的'地址'

- ### 子类构造器的特点

- 子类的全部构造器，都会先调用父类的构造器，再执行自己。

![image-20250325101546927](assets/image-20250325101546927.png)

- #### 子类调用父类构造器的应用场景

 ![image-20250325111938917](assets/image-20250325111938917.png)

- #### 补充知识：this(...)调用兄弟构造器

![image-20250325112239006](assets/image-20250325112239006.png)

![image-20250325113734237](assets/image-20250325113734237.png)

2. ### 多态

![image-20250325142711513](assets/image-20250325142711513.png) 

![image-20250325153811705](assets/image-20250325153811705.png)

![image-20250325153857759](assets/image-20250325153857759.png)

- #### 多态的好处

![image-20250325160310429](assets/image-20250325160312238.png)

- #### 多态的类型转换 

![image-20250325163906992](C:/Users/11206/AppData/Roaming/Typora/typora-user-images/image-20250325163906992.png)

3. ### 综合案例

![image-20250325165631040](C:/Users/11206/AppData/Roaming/Typora/typora-user-images/image-20250325165631040.png)
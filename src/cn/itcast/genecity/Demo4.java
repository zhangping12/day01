package cn.itcast.genecity;
/*
泛型接口：

泛型接口的定义格式：

    interface 接口名<声明自定义的泛型>{

    }

在接口上自定义泛型要注意的事项：
     1.在接口上自定义泛型的具体的数据类型是在实现该接口的时候指定的。
     2.如果一个接口自定义了泛型，在实现该接口的时候没有指定具体的数据类型，那么默认是Object数据类型。

 如果想在创建接口实现类对象的时候再指定接口自定义泛型的具体数据类型？
 */

interface Dao<T>{
    public void add(T t);
    public void remove(T t);

}
//针对1的例子
/*public class Demo4 implements Dao<String>{
    @Override
    public void add(String s) {

    }

    @Override
    public void remove(String s) {

    }
}*/
//针对2的例子
/*public class Demo4 implements Dao{
    @Override
    public void add(Object o) {

    }

    @Override
    public void remove(Object o) {

    }
}*/
//在创建接口实现类对象的时候再指定接口自定义泛型的具体数据类型
public class Demo4<T> implements Dao<T>{
    public static void main(String[] args) {
        new Demo4<String>();
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void remove(Object o) {

    }
}

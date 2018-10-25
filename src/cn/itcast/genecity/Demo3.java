package cn.itcast.genecity;

import javafx.concurrent.Worker;

import java.util.Comparator;

import java.util.ArrayList;


/*
泛型类

泛型类的定义格式：

    class 类名<声明自定义的泛型>{
    }

注意的事项：
     1、在类上自定义的泛型的具体数据类型是在创建对象的时候指定的
     2、在类上自定义的泛型，如果创建该类的对象时没有指定泛型的具体类型，那么默认是Object类型。
 */
class worker implements Comparator<Worker>{
    @Override
    public int compare(Worker o1, Worker o2) {
        return 0;
    }
}


//自定义 一个集合对象
class MyList<T>{

    Object[] arr = new Object[10];

    int index = 0;

    public MyList(){

    }
    public void add(T o){
        arr[index++] = o;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("123");

        MyList list2 = new MyList<>();//不指定，add则是object类型

        new ArrayList<String>();//如果指定了为String，那么后面的调用的方法都是String
    }
}

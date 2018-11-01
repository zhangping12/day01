package cn.itcast.introspector;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

/*
内省：---》一个变态的反射

内省主要解决的问题 ： 把对象的属性数据封装到对象中。
 */
public class Demo2 {

    public static void main(String[] args) {

    }

    public static void testProperty() throws Exception {
        Person p = new Person();
        //属性描述器
        PropertyDescriptor descriptor = new PropertyDescriptor("id",Person.class);
        //获取属性对应的get或者是set方法设置或者获取属性了
    }
}

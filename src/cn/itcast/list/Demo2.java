package cn.itcast.list;

import java.util.*;

public class Demo2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //使用get方法遍历
        list.add("张三");
        list.add("李四");
        list.add("王五");

        System.out.println("------------get方式遍历-----------");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i)+",");
        }

        //使用迭代器  注意：迭代器在迭代的过程中不能使用集合对象修改集合中的元素个数。如果需要修改要使用迭代器的方法进行修改，
        System.out.println("------------迭代器方式遍历-----------");
        HashSet<String> set = new HashSet<String>();
        set.add("狗娃");
        set.add("狗剩");
        set.add("铁蛋");

        /*Iterator<String> it = set.iterator();//获取到迭代器 原始版本
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }*/

        for (String item : set){  //简化版 增强for循环
            System.out.print(item+",");
            //set.add("hh");此句话是错误的，原因如上的注意
        }

        System.out.println("\r\n------------entrySet迭代器方式遍历-----------");
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("张三","001");
        map.put("李四","002");
        map.put("王五","003");
        Set<Map.Entry<String,String>> entrys = map.entrySet();
        for (Map.Entry<String,String> entry:entrys){
            System.out.println("键："+entry.getKey() + " 值："+entry.getValue());
        }
    }
}

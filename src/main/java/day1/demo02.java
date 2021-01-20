package day1;

import java.util.ArrayList;

/*
题目:
定义以指定格式打印集合的方法(ArrayList类型作为参数),使用{}括起集合,使用@分隔每个元素;
格式参照{元素@元素@元素}
 */
public class demo02 {
    public static void stringAll(ArrayList<student> stu){
        for (int i = 0; i < stu.size(); i++) {
            String name = stu.get(i).getName();
            int age = stu.get(i).getAge();
            boolean Ismale = stu.get(i).isIsmmale();
            System.out.print("{" + name + "@" + age + "@" + Ismale + "}");
        }
    }

    public static void main(String[] args) {
        student stu1 = new student("xiaoming",18,true);
        student stu2 = new student( "xiaohong",19,false);
        student stu3 = new student( "xiaogang",10,true);
        student stu4 = new student( "xiaohuang",17,true);
        ArrayList<student> list = new ArrayList<student>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        stringAll(list);

    }
}

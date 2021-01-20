package day1;

import java.util.ArrayList;
import java.util.List;

/*
题目:
创建4个学生对象,添加到集合,并遍历
 */
public class demo01 {
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
        for (int i = 0; i < list.size(); i++) {
            student stu =list.get(i);
            System.out.println("姓名是"+stu.getName());
            System.out.println("年龄是"+stu.getAge());
        }
    }
}
package day1;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存入随机的20个数字,然后筛选出其中的偶数数字,放入到集合中的.
 */
public class demo03 {
    public static void main(String[] args) {
        ArrayList<Integer> Arraylist = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num =random.nextInt();
            Arraylist.add(num);
        }
        System.out.println(Arraylist);
        System.out.println(ArrayListReturn(Arraylist));

    }
    public static ArrayList<Integer> ArrayListReturn(ArrayList<Integer> list){

        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2 == 0){
                smallList.add(list.get(i));
            }
        }

        return smallList;
    }
}

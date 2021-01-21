package day2;

import java.util.ArrayList;

/*
定义一个方法,把数组(1,2,3)按照指定格式拼接成一个字符串.格式参照如下[word1#word2#word3]
 */
public class demo01 {

    public static String ReturnString(int arr[]){
        String Return = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) {
                Return += "word" + arr[i] + "]";
            }else {
                Return +="word"+arr[i]+"#";
            }

        }
        return Return;
        }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        String s = ReturnString(arr);
        System.out.println(s);
    }
    }

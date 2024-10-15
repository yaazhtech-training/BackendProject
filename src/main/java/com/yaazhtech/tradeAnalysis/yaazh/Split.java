package com.yaazhtech.tradeAnalysis.yaazh;

public class Split {

public static void main(String[] args) {


    String str1 = "welcome2 to 6yaazhtech";

  String arr[]= str1.split("\\d+");


    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i].charAt(3));
    }


}
}

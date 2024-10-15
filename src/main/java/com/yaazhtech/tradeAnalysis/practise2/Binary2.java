package com.yaazhtech.tradeAnalysis.practise2;

public class Binary2 {

    public static void main(String[] args)
    {

        int arr[]={1,2,3,4,5,7,9};

        int start=0,end=arr.length,mid;

        int x=2;

        boolean found=false;

        while(start<=end)
        {
            mid = (start + end) / 2;
            if(arr[mid]==x)
            {
                System.out.println("Element is "+arr[mid] +" :"+mid);
                found=true;
                  break;
            }
            else if(arr[mid]>x)
            {
                end=mid-1;
            }
            else{
                start=mid+1;

            }



    }
        if(found)
        {
System.out.println("FOUND THE ELEMENT");
        }
        else{
            System.out.println("Not FOUND THE ELEMENT");
        }
}}

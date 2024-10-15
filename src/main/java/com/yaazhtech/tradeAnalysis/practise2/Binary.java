package com.yaazhtech.tradeAnalysis.practise2;

public class Binary {

    public static void main(String args[]){

   int[] arr={1,2,3,4,5,6,7};

   int x=4;
   boolean state=false;

   int mid,start=0,end=arr.length;

   while(start<=end)
   {

       mid=(start+end)/2;
       if(arr[mid]==x)
       {
           System.out.println("mid element : " + arr[mid] + " index is : " +mid);
           state=true;
           break;

       }
       else if (arr[mid]>x)
       {
           end=mid-1;
       }
       else {
           start=mid+1;
       }

   }

   if(state)
   {
       System.out.println("found the elements");
   }
   else {
       System.out.println("not found the elements");
   }

    }

}


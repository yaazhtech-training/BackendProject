package com.yaazhtech.tradeAnalysis.practise2;

public class Binary3 {

    public static void main(String[] args) {

        int[] arr ={2,3,5,11,16,20};

        int x=11;
        int start=0,end=arr.length,mid;

        boolean state=false;

        while(start<=end)
        {
            mid=start+end/2;
//missing
            if(arr[mid]==x) {
                System.out.println(arr[mid] + " " + mid);
                state = true;
break;
            }
           else if(arr[mid]>x)
            {
                end=mid-1;
            }

            else
            {
                start=mid+1;
            }


        }

        if(state)
        {
            System.out.println("find the element");
        }

        else
        {
            System.out.println("not find the element");
        }



    }
}

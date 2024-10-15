package com.yaazhtech.tradeAnalysis.interview;



public class BinarySearch {

    int binarysearch(int arr[], int l, int r, int x) {

        int mid = l + r / 2;
        if ( arr[ mid]==x)
        {
            return mid;
        }
        else if (arr[mid]>x)
        {
            r = mid - 1;
        }
else{
            l = mid + 1;
        }
return -1;
    }



    // Driver method to test above
    public static void main(String args[])
    {
        int a[]={2,3,4,5,6};

        int x=4;

        int len=a.length;

        BinarySearch bs=new BinarySearch();
       int r= bs.binarysearch(a,0,5,4);

        System.out.println(r);

    }
}

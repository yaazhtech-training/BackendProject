package com.yaazhtech.tradeAnalysis.interview;

public class Prime {

    public static void main(String[] args)
    {
        int x=19;
        boolean state=false;

        if(x==0 || x==1)
        {
            state=true;
        }

        else if(x>1)
        {
            for(int i=0;i<x/2;i++) {
                if(x%2==0) {
                    state = true;
                    break;
                }
            }
        }

        else {
            state = false;
        }
if(state==false) {
    System.out.println("primenumber");

}

    }
}

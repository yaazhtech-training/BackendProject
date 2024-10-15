package com.yaazhtech.tradeAnalysis.pactise;

class Immutable {

    private final String s;

    public Immutable(final String s) {
        this.s = s;
    }

    public final String getS() {
        return s;
    }

    public static void main(String[] args)
    {
        Immutable im=new Immutable("Java");
        System.out.println(im.getS());
        
    }
}

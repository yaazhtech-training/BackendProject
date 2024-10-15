package com.yaazhtech.tradeAnalysis.pactise;

class Hellow extends Thread {
    void hi() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hai");
        }
    }


    public static class ThreadEx {

        public static void main(String[] args) {
            Hellow hi = new Hellow();
            hi.start();
            hi.hi();

        }

    }
}

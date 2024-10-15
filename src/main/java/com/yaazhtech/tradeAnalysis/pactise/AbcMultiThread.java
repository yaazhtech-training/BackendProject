package com.yaazhtech.tradeAnalysis.pactise;

import java.util.logging.Level;
import java.util.logging.Logger;

class AbcMultiThread implements Runnable{


     @Override
     public void run() {
         try{
             Thread.sleep(1000000);
         }
         catch(InterruptedException ex)
         {
             Logger.getLogger(AbcMultiThread.class.getName()).log(Level.SEVERE,null,ex);
         }
     }
 }

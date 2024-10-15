package com.yaazhtech.tradeAnalysis.yaazh;

import java.util.HashSet;
import java.util.Set;

public class Sorting {

    public static void main(String[] args)
    {
String str="aa12345671";
    char[] inputChar=str.toCharArray();
    int count[]=new int[256];
        for (int i = 0; i < str.length(); i++) { //
            count[str.charAt(i)]++;// 114,1 , 97,1 , 100,1,
    }

        Set<Character> characterList=new HashSet<>();
        for(int i=0;i<inputChar.length;i++){ //

            if(count[inputChar[i]]>1){
                characterList.add(inputChar[i]);
            }

        }

        for(Character s:characterList){
            System.out.println("Repeated char: "+s );
            System.out.println("Occuerenc: "+count[s] );
        }
        for(int i=0;i<inputChar.length;i++){
            if(count[inputChar[i]]==1) {
                System.out.println("Repeated char: " + inputChar[i]);
                System.out.println("Occuerenc: " + count[inputChar[i]]);
            }
        }



}}

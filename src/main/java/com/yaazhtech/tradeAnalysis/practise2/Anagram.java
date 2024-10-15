package com.yaazhtech.tradeAnalysis.practise2;

import java.util.Arrays;

public class Anagram {

        public static void main(String[] args) {
            String str1 = "Race";
            String str2 = "Care";

            str1=str1.toLowerCase();
            str2=str2.toLowerCase();

            // check if length is same
            if(str1.length() == str2.length()) {

                // convert strings to char array
                char[] ch1=str1.toCharArray();
                char[] ch2=str1.toCharArray();


                // sort the char array
                Arrays.sort(ch1);
                Arrays.sort(ch2);

                // if sorted char arrays are same
                // then the string is anagram
                boolean result = Arrays.equals(ch1,ch2);

                if(result) {
                    System.out.println(str1 + " and " + str2 + " are anagram.");
                }
                else {
                    System.out.println(str1 + " and " + str2 + " are not anagram.");
                }
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
    }


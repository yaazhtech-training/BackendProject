package com.yaazhtech.tradeAnalysis.YaazhPra;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapPra {

    public static void main(String[] args) {

        String str="caa1123456zz";

char input[]=str.toCharArray();

int count[]=new int[256];

for(int i=0;i<str.length();i++)
{
    count[str.charAt(i)]++;
}

Set <Character> charset=new HashSet<>();

for(int i=0;i<input.length;i++)
{
    if(count[input[i]]>1)

    {
        charset.add(input[i]);
    }
}

for(Character c:charset)
{
    System.out.println("repeat"+c);
    System.out.println("occurance"+count[c]);
}


for (int i=0;i<input.length;i++)
{
    if(count[input[i]]==1)
    {
        System.out.println("repeat"+input[i]);

        System.out.println("occurance"+count[input[i]]);
    }
}

    }
}

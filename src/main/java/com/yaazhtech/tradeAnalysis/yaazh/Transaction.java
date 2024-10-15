package com.yaazhtech.tradeAnalysis.yaazh;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction {

    public static void main (String[] args)
    {
        List<TransactionData> transactionData = new ArrayList<>();
        transactionData.add(new TransactionData(LocalDate.of(2024,10,15),500,"HDFCXXX"));
        transactionData.add(new TransactionData(LocalDate.of(2024,9,12),800,"HDFC0XXX"));
        transactionData.add(new TransactionData(LocalDate.of(2024,10,13),80,"CANARAXX"));

        Map<LocalDate,List<TransactionData>> groupoftxns=
                transactionData.stream().collect(Collectors.groupingBy(TransactionData::getDate));

        //System.out.println(groupoftxns);

        groupoftxns.forEach((date,txn)->{
            System.out.println("Date :" + date);
            txn.forEach(tx-> System.out.println("Amount :" + tx.getAmount()));
        });





    }
}

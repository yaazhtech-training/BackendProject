package com.yaazhtech.tradeAnalysis.dataTrade;


import jakarta.persistence.*;

import lombok.Data;

@Data

@Entity
@Table(name="product_trade")
public class TradeData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Long id;

    private String name;
    private String currency;
   private String price;

   private String shares;

   private String date;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCurrency() {
//        return currency;
//    }
//
//    public void setCurrency(String currency) {
//        this.currency = currency;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    public String getShares() {
//        return shares;
//    }
//
//    public void setShares(String shares) {
//        this.shares = shares;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getTradeData() {
//        return tradeData;
//    }
//
//    public void setTradeData(String tradeData) {
//        this.tradeData = tradeData;
//    }
//
//    private String tradeData;

}

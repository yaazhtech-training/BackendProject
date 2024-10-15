package com.yaazhtech.tradeAnalysis;

import com.yaazhtech.tradeAnalysis.dataTrade.TradeData;
import com.yaazhtech.tradeAnalysis.repoTrade.RepoTrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TradedataRepositoryTest {

    @Autowired
    private RepoTrade repotest;



    @Test
    @Order(1)
    @Rollback(value=false)
    public void saveDataTest()
    {
//        TradeData tradeDatatest = TradeData.builder()
//                .id("1")
//                .name("pen")
//                .currency("INR")
//                .price("55")
//                .date("2024")
//                .shares("no")
//                .build();
//        repotest.save(tradeDatatest);
//        asserthat

    }

}

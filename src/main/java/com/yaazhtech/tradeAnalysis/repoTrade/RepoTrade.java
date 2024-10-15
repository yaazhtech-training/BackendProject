package com.yaazhtech.tradeAnalysis.repoTrade;

import com.yaazhtech.tradeAnalysis.dataTrade.TradeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoTrade extends JpaRepository<TradeData,Long> {
}

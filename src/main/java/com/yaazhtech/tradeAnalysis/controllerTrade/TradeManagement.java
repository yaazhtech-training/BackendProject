package com.yaazhtech.tradeAnalysis.controllerTrade;


import com.yaazhtech.tradeAnalysis.dataTrade.TradeData;
import com.yaazhtech.tradeAnalysis.modelTrade.TradeModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TradeManagement {

    @PostMapping("/saveDatas")

    public String saveData(@RequestBody  TradeModel tradeModel);

    @GetMapping("/allGetData")
    public List<TradeData> getAllData();

    @DeleteMapping("/{id}")
    public void deleteId(@PathVariable Long id);

    @PutMapping("{id}")
    public TradeData updateId(@PathVariable Long id,@RequestBody TradeData tradeDataUpdate);
}

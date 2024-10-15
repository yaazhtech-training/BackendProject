package com.yaazhtech.tradeAnalysis.controllerTrade;


import com.yaazhtech.tradeAnalysis.ExceptionHandling.NoSuchCustomerExistsException;
import com.yaazhtech.tradeAnalysis.dataTrade.TradeData;
import com.yaazhtech.tradeAnalysis.modelTrade.TradeModel;
import com.yaazhtech.tradeAnalysis.repoTrade.RepoTrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class ControllerTrade implements TradeManagement {

    @Autowired
    RepoTrade repoTrade;

    @Override
    public String saveData(TradeModel tradeModel) {
        TradeData tradeData = new TradeData();
        tradeData.setId(tradeModel.getId());
        tradeData.setName(tradeModel.getName());
        tradeData.setCurrency(tradeModel.getCurrency());
        tradeData.setPrice(tradeModel.getPrice());
        tradeData.setShares(tradeModel.getShares());
        tradeData.setDate(tradeModel.getDate());
        repoTrade.save(tradeData);
        return ("Successfully saved");
    }

    @Override
    public List<TradeData> getAllData() {
        return repoTrade.findAll();
    }

    @Override
    public void deleteId(Long id) {
        repoTrade.deleteById(id);
    }

    @Override
    public TradeData updateId(Long id, TradeData tradeDataUpdate) {

        TradeData trd = repoTrade.findById(id).orElse(null);
        if (trd != null) {
            trd.setPrice(tradeDataUpdate.getPrice());
            trd.setDate(tradeDataUpdate.getDate());

        }


        if (trd == null)
        {
            throw new NoSuchCustomerExistsException(
                    "No Such Customer exists!!");

    }
        else{
            return repoTrade.save(trd);
        }


}}

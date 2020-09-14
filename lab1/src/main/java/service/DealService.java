package service;

import entity.Deal;

import java.util.ArrayList;
import java.util.List;

public class DealService {

    // Variables

    private final List<Deal> dealsList;

    // Constructor

    public DealService() {
        dealsList = new ArrayList<>();
    }

    // Public


    public List<Deal> getDealsList() {
        return dealsList;
    }

    public void addDeal(Deal currentDeal) {
        dealsList.add(currentDeal);
    }

    public void removeDeal(Deal deal) {
        if(!dealsList.contains(deal))
            throw new RuntimeException("Not found");

        dealsList.remove(deal);
    }

}

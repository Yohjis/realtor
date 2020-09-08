package service;


import entity.Estate;

import java.util.ArrayList;
import java.util.List;

public final class EstateService {
    private final List<Estate> estateList;

    public EstateService() {
        this.estateList = new ArrayList<>();
    }

    public ArrayList<Estate> getEstateList() {
        return getEstateList();
    }

    public void addEstate(Estate estate){
        estateList.add(estate);
    }

    public void deleteEstate(Estate estate){
        estateList.remove(estate);
    }
}

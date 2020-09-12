package service;


import entity.Estate;

import java.util.ArrayList;
import java.util.List;

public final class EstateService {
    private final List<Estate> activeEstateList;
    private final List<Estate> passiveEstateList;
    private final List<Estate> amountOfEstateList;

    public EstateService() {
        activeEstateList = new ArrayList<>();
        passiveEstateList = new ArrayList<>();
        amountOfEstateList = new ArrayList<>();
    }

    public List<Estate> getActiveEstateList() {
        return activeEstateList;
    }

    public void addEstate(Estate estate){
      activeEstateList.add(estate);
    }

    public List<Estate> getPassiveEstateList() {
        return passiveEstateList;
    }

    public List<Estate> getAmountOfEstateList() {return amountOfEstateList;}

    public void setInactiveEstate(Estate estate) {
        if(activeEstateList.contains(estate)){
            passiveEstateList.add(estate);
            activeEstateList.remove(estate);
        }else throw new RuntimeException("Estate is not found");
    }

    public void clearEstateLists(){
        activeEstateList.clear();
        passiveEstateList.clear();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nEstates: ");
        for(Estate e: activeEstateList){
            stringBuilder.append("\nid: ").append(e.getId()).append("\t address: ")
                    .append(e.getAddress()).append("\t price: ").append(e.getPrice()).append("\t rooms: ").append(e.getRooms());
        }

                stringBuilder.append("\n\n00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");

        return stringBuilder.toString();
    }
}

package service;


import entity.Estate;
import entity.Realtor;

import java.util.ArrayList;
import java.util.List;

public final class EstateService {

    // Variables

    private final List<Estate> activeEstateList;
    private final List<Estate> passiveEstateList;

    // Constructor

    public EstateService() {
        activeEstateList = new ArrayList<>();
        passiveEstateList = new ArrayList<>();
    }

    // Public

    public List<Estate> getActiveEstateList() {
        return activeEstateList;
    }

    public List<Estate> getPassiveEstateList() {
        return passiveEstateList;
    }

    public void addEstate(Estate estate){
      activeEstateList.add(estate);
    }

    public void deleteEstate(Estate estate) {
        if(activeEstateList.contains(estate)) {
            activeEstateList.remove(estate);
            return;
        }

        if(passiveEstateList.contains(estate)) {
            passiveEstateList.remove(estate);
            return;
        }

        throw new RuntimeException("Not found");
    }

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

    public List<Estate> getByPrice(double priceLow, double priceHigh) {
        List<Estate> estatesByPrice = new ArrayList<>();
        activeEstateList.stream()
                .filter(estate -> {
                    final Double price = estate.getPrice();
                    if(price > priceLow && price < priceHigh)
                        return true;
                    else return false;
                }).forEach(estate -> estatesByPrice.add(estate));
        return estatesByPrice;
    }

    public List<Estate> getEstateListOfRealtor(Realtor realtor) {
        List<Estate> estatesOfRealtor = new ArrayList<>();

        activeEstateList
                .stream()
                .filter(estate -> (estate.getRealtor().equals(realtor)))
                .forEach(estate -> estatesOfRealtor.add(estate));

        return estatesOfRealtor;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#############################################");
        stringBuilder.append("\nEstates: ");
        for(Estate e: activeEstateList){
            stringBuilder.append("\nid: ").append(e.getId()).append("\t address: ")
                    .append(e.getAddress()).append("\n price: ").append(e.getPrice());
        }
        stringBuilder.append("\n\n#############################################");

        return stringBuilder.toString();
    }
}

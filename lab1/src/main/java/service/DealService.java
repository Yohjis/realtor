package service;

import entity.Client;
import entity.Deal;
import entity.Estate;
import entity.Realtor;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class DealService {


    // Variables


    private final EstateService estateService;
    private final ClientService clientService;
    private List<Deal> deals;


    // Constructor

    public DealService(EstateService estateService, ClientService clientService) {
        this.estateService = estateService;
        this.clientService = clientService;
        this.deals = new ArrayList<>();
    }

    // Public

    public void addDeal(Realtor realtor, Client client, Estate estate) {
        System.out.println("Creating new deal");
        final Deal order = new Deal(estate, realtor, client);
        estateService.setInactiveEstate(estate);
        deals.add(order);
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(ArrayList<Deal> deals) {
        this.deals = deals;
    }
}

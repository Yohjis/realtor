package service;

import entity.Client;
import entity.Deal;
import entity.Estate;
import entity.Realtor;

import java.util.ArrayList;
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
    /*

        public void addDeal(Realtor realtor, Client client){
            System.out.println("Trying to create new deal");
            List<Estate> toDealList = client.getEstateWishList();

            estateService.deleteEstate(e);
            DealService order = new DealService(dealId, e, realtor, client);
            System.out.println("New deal has created: " + deal);
            dealServices.add(deal);
            clientService.addClient(client);
        }

     */





    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(ArrayList<Deal> deals) {
        this.deals = deals;
    }
}

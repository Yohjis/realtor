package main.java;

import entity.Client;
import entity.Estate;
import entity.Realtor;
import service.ClientService;
import service.DealService;
import service.EstateService;
import service.RealtorService;

public class Main {
    public static void main(String[] args) {

        final Client client = new Client("Mark", "Djobs", "mdjobs@mail.com");
        final Realtor realtor = new Realtor("Pavel", "Banan");
        final Estate room101 = new Estate("1-01 ,Metalistiv 3, Kyiv", "room", 20000.0);


        final ClientService clientService = new ClientService();
        clientService.addClient(client);

        final EstateService estateService = new EstateService();
        estateService.addEstate(room101);

        final DealService dealService = new DealService(estateService, clientService);
        dealService.addDeal(realtor, client, room101);

        if(estateService.getPassiveEstateList().contains(room101)) {
            System.out.println(" -SUCCESS");
        }

    }
}

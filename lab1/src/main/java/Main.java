import entity.Client;
import entity.Estate;
import entity.Realtor;
import service.ClientService;
import service.DealService;
import service.EstateService;
import service.RealtorService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final Client client1 = new Client("Jack1", "Ma", "mdjobs@mail.com", (double) 1300);
        final Client client2 = new Client("Jack2", "Ma", "mdjobs@mail.com", (double) 1500);
        final Client client3 = new Client("Jack3", "Ma", "mdjobs@mail.com", (double) 1900);
        final Client client4 = new Client("Jack4", "Ma", "mdjobs@mail.com", (double) 199999);


        final Realtor realtor1 = new Realtor("Pavel", "Banan1", "rieltor@rieltor.com");
        final Realtor realtor2 = new Realtor("Pavel", "Banan2", "rieltor@rieltor.com");
        final Realtor realtor3 = new Realtor("Pavel", "Banan3", "rieltor@rieltor.com");
        final Realtor realtor4 = new Realtor("Pavel", "Banan4", "rieltor@rieltor.com");

        final Estate room101 = new Estate("1-01 ,Metalistiv 3, Kyiv", "room", 1000.0, 4);
        final Estate room102 = new Estate("1-02 ,Metalistiv 3, Kyiv", "room", 1500.0, 4);
        final Estate room103 = new Estate("1-03 ,Metalistiv 3, Kyiv", "room", 1500.0, 4);
        final Estate room104 = new Estate("1-04 ,Metalistiv 3, Kyiv", "room", 20000.0, 3);
        final Estate room105 = new Estate("1-05 ,Metalistiv 3, Kyiv", "room", 20000.0, 3);


        final ClientService clientService = new ClientService();
        clientService.addClient(client1);
        clientService.addClient(client2);
        clientService.addClient(client3);
        clientService.addClient(client4);

        final RealtorService realtorService = new RealtorService();
        realtorService.addRealtor(realtor1);
        realtorService.addRealtor(realtor2);
        realtorService.addRealtor(realtor3);
        realtorService.addRealtor(realtor4);

        final EstateService estateService = new EstateService();
        estateService.addEstate(room101);
        estateService.addEstate(room102);
        estateService.addEstate(room103);
        estateService.addEstate(room104);
        estateService.addEstate(room105);

        final DealService dealService = new DealService(estateService, clientService);
        dealService.addDeal(realtor1, client1, room101);

        System.out.println("\n[ CLIENT BASE]");
        System.out.println(clientService);
        System.out.println("\n[ REALTOR BASE]");
        System.out.println(realtorService);
        System.out.println("\n[ ESTATE BASE]");
        System.out.println(estateService);

        List<Estate> estates = estateService.getActiveEstateList();
        System.out.println("Active estates:");
        estates.stream().forEach(estate -> System.out.println(estate.toString()));

        List<Estate> amountOfEstate = estateService.getAmountOfEstateList();
        System.out.println("Amount of Estates: " + estates.size());

        List<Estate> pestates = estateService.getPassiveEstateList();
        System.out.println("Passive estates:");
        pestates.stream().forEach(estate -> System.out.println(estate.toString()));

        if (estateService.getPassiveEstateList().contains(room101)) {
            System.out.println(" -SUCCESS");
        }


    }

}

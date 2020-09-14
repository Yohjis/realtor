import entity.Client;
import entity.Deal;
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

        final Client client1 = new Client("Mark1", "Djobs", "mdjobs@mail.com");
        final Client client2 = new Client("Mark2", "Pedro", "mdjobs@mail.com");
        final Client client3 = new Client("Mark3", "Shmedro", "mdjobs@mail.com");
        final Client client4 = new Client("Mark4", "Pops", "mdjobs@mail.com");


        final Realtor realtor1 = new Realtor("Pavel", "Kek", "rieltor@rieltor.com");
        final Realtor realtor2 = new Realtor("Pavel", "Shmek", "rieltor@rieltor.com");
        final Realtor realtor3 = new Realtor("Pavel", "Abrikos", "rieltor@rieltor.com");
        final Realtor realtor4 = new Realtor("Pavel", "Banan", "rieltor@rieltor.com");

        final Estate room101 = new Estate("1-01 ,Metalistiv 3, Kyiv", "room", 20000.0, realtor1);
        final Estate room102 = new Estate("1-02 ,Metalistiv 3, Kyiv", "room", 40000.0, realtor1);
        final Estate room103 = new Estate("1-03 ,Metalistiv 3, Kyiv", "room", 100000.0, realtor3);
        final Estate room104 = new Estate("1-04 ,Metalistiv 3, Kyiv", "room", 200000.0, realtor4);
        final Estate room105 = new Estate("1-05 ,Metalistiv 3, Kyiv", "room", 25000.0, realtor2);


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


        System.out.println("---- All estates in arrange 19k - 50k");
        estateService
                .getByPrice(19000.0, 50000.0)
                .stream()
                .forEach(System.out::println);

        System.out.println("---- All estates of: " + realtor1);
        estateService
                .getEstateListOfRealtor(realtor1)
                .stream()
                .forEach(System.out::println);

        final DealService dealService = new DealService();
        dealService.addDeal(new Deal(room101, client1));
        estateService.setInactiveEstate(room101);
        System.out.println("--- DEALS");
        dealService.getDealsList().stream().forEach(System.out::println);

        List<Estate> estates = estateService.getActiveEstateList();
        System.out.println("---- Active estates:");
        estates.stream().forEach(estate -> System.out.println(estate.toString()));

        List<Estate> pestates = estateService.getPassiveEstateList();
        System.out.println("---- Passive estates:");
        pestates.stream().forEach(estate -> System.out.println(estate.toString()));
        
        System.out.println("\n---- [ CLIENT SERVICE]");
        System.out.println(clientService);
        System.out.println("\n---- [ REALTOR SERVICE]");
        System.out.println(realtorService);
        System.out.println("\n---- [ ESTATE SERVICE]");
        System.out.println(estateService);

    }

}

package service;

import entity.*;

import javax.print.DocFlavor;
import java.util.*;

public final class ClientService {

    // Variables

    private final List<Client> clients;


    // Constructor

    public ClientService() {
        this.clients = new ArrayList<>();
    }



    // Public

    public void addClient(Client client){
        clients.add(client);
    }
    public List<Client> getActiveClientList() {
        return clients;
    }

    /*public void addClient(Client client){
        activeClientList.add(client);
    }*/

    public void clearClientWishList(Client client) { client.getEstateWishList().clear(); }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");

        for(Client c: clients){
            stringBuilder.append("\nid: ").append(c.getId()).append("\t firstName: ")
                    .append(c.getFirstName()).append("\t lastName: ").append(c.getLastName());
        }

        stringBuilder.append("\n\n00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");


        return stringBuilder.toString();
    }
}
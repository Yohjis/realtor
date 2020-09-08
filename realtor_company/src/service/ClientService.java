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

    public void addClient(Client customer){
        if(customer != null)
            clients.add(customer);
    }

    public void clearClientWishList(Client client) {
        client.getEstateWishList().clear();
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append("\n___________________________________________");
        clients.stream().forEach(client -> stringBuilder.append(client.toString()));
        /*
        for(Client c: client){
            stringBuilder.append("\nid: ").append(c.getId()).append("\t firstName: ")
                    .append(c.getFirstName()).append("\n lastName: ").append(c.getLastName())
                    .append("\t age: ").append(c.getAge()).append("\t regDate: ")
                    .append(c.getRegistrationDate());
        }
        */

        //stringBuilder.append("\n___________________________________________");

        return stringBuilder.toString();
    }
}
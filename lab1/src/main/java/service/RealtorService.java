package service;

import entity.*;

import javax.print.DocFlavor;
import java.util.*;

public final class RealtorService {

    // Variables

    private final List<Realtor> realtors;


    // Constructor

    public RealtorService() {
        this.realtors = new ArrayList<>();
    }

    // Public

    /*public List<Realtor> getActiveRealtorList() {
        return activeReatorList;
    }*/

    public void addRealtor(Realtor realtor){ realtors.add(realtor); }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("\n00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        //realtors.stream().forEach(realtor -> stringBuilder.append(realtor.toString()));
        for(Realtor r: realtors){
            stringBuilder.append("\nid: ").append(r.getId()).append("\t firstName: ")
                    .append(r.getFirstName()).append("\t lastName: ").append(r.getLastName());
        }

        stringBuilder.append("\n\n00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");

        return stringBuilder.toString();
    }
}
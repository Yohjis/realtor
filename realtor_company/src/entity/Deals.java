package entity;

import resources.HashIdGenerator;

import java.util.*;

public final class Deal {

    // Constants

    private final int HASH_ID_LENGTH = 6;

    // Variables

    private String id;
    private List<Estate> estatesInDeal;
    private Double price;
    private Realtor realtor;
    private Client client;
    private Calendar dealDate;

    // Constructors

    public Deal(Long id, Estate estate, Realtor realtor, Client client, GregorianCalendar dealDate) {

        // init definitions
        defineDeal();

        this.estatesInDeal.add(estate);
        this.realtor = realtor;
        this.client = client;
        this.price = estate.getPrice();
        this.dealDate = dealDate;

    }

    // Public

    public double countPrice(ArrayList<Estate> estates){
        return estates.stream().mapToDouble(Estate::getPrice).sum();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Estate> getEstateInDeal() {
        return getEstateInDeal();
    }

    public Double getPrice() {
        return price;
    }

    public Realtor getRealtor() {
        return realtor;
    }

    public Client getClient() {
        return client;
    }

    public Calendar getDealDate() {
        return dealDate;
    }

    // Private

    private void defineDeal() {
        this.id = HashIdGenerator.generateHashId(HASH_ID_LENGTH);
        estatesInDeal = new ArrayList<Estate>();
        dealDate = new GregorianCalendar();
        // dealDate.clear(); <- i am not sure you can use this, depends on functions
    }
}

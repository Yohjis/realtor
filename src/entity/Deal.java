package entity;

import resources.HashIdGenerator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

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

    public Deal(Estate estate, Realtor realtor, Client client) {

        // init definitions
        defineDeal();

        this.estatesInDeal.add(estate);
        this.realtor = realtor;
        this.client = client;
        this.price = estate.getPrice();
        this.dealDate = dealDate;

    }

    // Public

    public void setEstatesInDeal(List<Estate> estatesInDeal) {
        this.estatesInDeal = estatesInDeal;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setRealtor(Realtor realtor) {
        this.realtor = realtor;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDealDate(Calendar dealDate) {
        this.dealDate = dealDate;
    }

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

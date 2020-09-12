package entity;

/*import resources.HashIdGenerator;*/
import java.util.UUID;

import java.util.*;

public final class Deal {

    // Constants

    /*private final int HASH_ID_LENGTH = 6;*/

    // Variables

    private UUID id;
    private List<Estate> estatesInDeal;
    private Double price;
    private Realtor realtor;
    private Client client;
    private Calendar dealDate;
    private final Calendar c = Calendar.getInstance();
    

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

    public UUID getId() {
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
        this.id = UUID.randomUUID()/*HashIdGenerator.generateHashId(HASH_ID_LENGTH)*/;
        estatesInDeal = new ArrayList<Estate>();
        dealDate = new GregorianCalendar();
        // dealDate.clear(); <- i am not sure you can use this, depends on functions
    }
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product=" + estatesInDeal +
                ", price=" + price +
                ", seller=" + realtor +
                ", customer=" + client +
                ", orderDate=" + dealDate +
                ", c=" + c +
                '}';
    }
}

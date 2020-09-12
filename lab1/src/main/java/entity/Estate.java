package entity;

import java.util.ArrayList;
import java.util.UUID;
public class Estate {

    // Variables

    private UUID id;
    private String type;
    private Double price;
    private String address;
    private int rooms;
    // Constructors

    public Estate(){
        defineEstate();
    }

    public Estate(String address, String type, Double price, int rooms){

        defineEstate();
        this.address = address;
        this.type = type;
        this.price = price;
        this.rooms = rooms;
    }

    // Getters


    public String getAddress() {
        return address;
    }
    public UUID getId(){
        return id;
    }
    public String getType(){ return type; }
    public Double getPrice(){
        return price;
    }
    public int getRooms() { return rooms; }

    // Setters
    public void setAddress(String adress) {
        this.address = adress;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        if(price > 0) {
            this.price = price;
        }else throw new RuntimeException("Price must be positive"); // catch in implementation
    }

    public void setRooms(int rooms) { this.rooms = rooms; }
// Private

    private void defineEstate() {
        id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", adress='" + address + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                /*", estateWishList=" + estateWishList +*/
                '}';
    }
}




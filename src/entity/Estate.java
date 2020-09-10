package entity;

import resources.HashIdGenerator;

public class Estate {

    private final int ESTATE_ID_LENGTH = 6;

    // Variables

    private String id;
    private String type;
    private Double price;
    private String address;

    // Constructors

    public Estate(){
        defineEstate();
    }

    public Estate(String address, String type, Double price){

        defineEstate();

        this.address = address;
        this.type = type;
        this.price = price;
    }

    // Getters


    public String getAddress() {
        return address;
    }

    public String getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public Double getPrice(){
        return price;
    }

    // Setters


    public void setAddress(String adress) {
        this.address = adress;
    }

    public void setId(String id) {
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

    // Private

    private void defineEstate() {
        id = HashIdGenerator.generateHashId(ESTATE_ID_LENGTH);
    }
}

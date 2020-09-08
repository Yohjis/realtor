package entity;

public class Estate {

    // Variables

    private Long id;
    private String type;
    private Double price;

    // Constructors

    public Estate(){
    }

    public Estate(Long id, String type, Double price){
        this.id = id;
        this.type = type;
        this.price = price;
    }


    // Getters

    public Long getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public Double getPrice(){
        return price;
    }

    // Setters


    public void setId(Long id) {
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
}

package entity;

public class Estate {

    private Long id;
    private String type;
    private Double price;


    public Estate(){
    }

    public Estate(Long id, String type, Double price){
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Long getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public Double getPrice(){
        return price;
    }
}

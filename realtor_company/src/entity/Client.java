package entity;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Estate> estateWishList;

    public Client(){

        defineEstateWishList();

    }

    public Client(Long id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        defineEstateWishList();

    }

    public void addEstateToWishList(Estate estate) {
        estateWishList.add(estate);
    }

    public void deleteEstateFromWishList(Long id){
        estateWishList.removeIf(e -> e.getId().longValue() == id);
    }
    public Long getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public List<Estate> getEstateWishList(){
        return estateWishList;
    }
    public String getEmail(){
        return email;
    }

    private void defineEstateWishList() {
        estateWishList = new ArrayList<>();
    }
}

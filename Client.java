package entity;

public class Client {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Estate> estateWishList;

    public Client(){
    }
    public Client(Long id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public void addEstateToWishList(Estate estate){
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
    public ArrayList<Estate> getEstateWishList(){
        return estateWishList;
    }
    public String getEmail(){
        return email;
    }
}

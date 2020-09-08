package entity;

import resources.HashIdGenerator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Client {

    // Constants

    public final int HASH_ID_LENGTH = 6;

    // Variables

    private String id;

    /*

        First name, Last name and Email we can change -> delete final and add setters

     */

    private String firstName;
    private String lastName;
    private String email;
    private List<Estate> estateWishList;
    private Calendar registrationDate;

    // Constructors

    public Client(String firstName, String lastName, String email){

        defineClient();

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    // Public


    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void addEstateToWishList(Estate estate) {
        estateWishList.add(estate);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deleteEstateFromWishList(Long id){
        estateWishList.removeIf(e -> e.getId().longValue() == id);
    }

    public String getId(){
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

    @Override
    public String toString() {
        return "CLIENT:\n[ ID]: " + id
                + "\n[ FIRST NAME]: " + firstName
                + "\n[ LAST NAME]: " + lastName;
    }
    // Private

    private void defineClient() {
        estateWishList = new ArrayList<Estate>();
        registrationDate = new GregorianCalendar();
        this.id = HashIdGenerator.generateHashId(HASH_ID_LENGTH);
    }
}

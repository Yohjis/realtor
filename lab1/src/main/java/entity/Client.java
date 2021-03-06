package entity;

/*import resources.HashIdGenerator;*/
import java.util.UUID;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Client extends User {

    // Constants

   /* public final int HASH_ID_LENGTH = 6;*/

    // Variables

    /*

        First name, Last name and Email we can change -> delete final and add setters

     */

    private List<Estate> estateWishList;
    private Calendar registrationDate;

    // Constructors

    public Client(String firstName, String lastName, String email){

        super(firstName, lastName, email);
        defineClient();

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

    public void deleteEstateFromWishList(UUID id){
        estateWishList.removeIf(e -> e.getId() == id);
    }

    public List<Estate> getEstateWishList(){
        return estateWishList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    // Private

    private void defineClient() {
        estateWishList = new ArrayList<Estate>();
        registrationDate = new GregorianCalendar();
    }
}

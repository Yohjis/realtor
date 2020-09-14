package entity;

import java.util.UUID;

public class Realtor extends User{

    // Constants

    /*private final int REALTOR_ID_LENGTH = 6;*/

    // Variables


    // Constructors

    public Realtor(String firstName, String lastName, String email) {

        /*defineRealtor();*/
        super(firstName, lastName, email);
    }

    // Getters



    // Private

    /*private void defineRealtor() {
        this.id = HashIdGenerator.generateHashId(REALTOR_ID_LENGTH);
    }*/

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(User user) {
        return super.equals(user);
    }
}
package entity;

import resources.HashIdGenerator;

public class Realtor {

    // Constants

    private final int REALTOR_ID_LENGTH = 6;

    // Variables

    private String id;
    private String firstName;
    private String lastName;

    // Constructors

    public Realtor(String firstName, String lastName) {

        defineRealtor();

        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    // Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Private

    private void defineRealtor() {
        this.id = HashIdGenerator.generateHashId(REALTOR_ID_LENGTH);
    }
}
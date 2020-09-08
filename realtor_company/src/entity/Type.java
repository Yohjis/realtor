package entity;

public class Type {

    // Variables

    public int flatTypeID;
    public String name;
    public Estate estate;
    public District district;

    // Getters

    public int getFlatTypeID() {
        return flatTypeID;
    }

    public String getName() {
        return name;
    }

    public Estate getEstate() {
        return estate;
    }

    public District getDistrict() {
        return district;
    }


    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setEstate(Estate estate) {
        this.estate = estate;
    }

    public void setFlatTypeID(int flatTypeID) {
        flatTypeID = flatTypeID;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
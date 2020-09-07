package entity;

public class Type {
    public int FlatTypeID;
    public String name;
    public Estate estate;

    public int getFlatTypeID() {
        return FlatTypeID;
    }

    public void setFlatTypeID(int flatTypeID) {
        FlatTypeID = flatTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Estate getEstate() {
        return estate;
    }

    public void setEstate(Estate estate) {
        this.estate = estate;
    }
}

package demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;

public class Wheel extends XmlEntity {
    private String type;
    private Bike bike;

    private Wheel() {
    }

    public Wheel(Bike bike, String type) {
        this.bike = bike;
        this.type = type;
    }

    @XmlIDREF
    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    @XmlElement
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Wheel [type=%s, id=%s]", type, getId());
    }
}
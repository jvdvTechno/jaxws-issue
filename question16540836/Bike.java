package question16540836;

public class Bike extends XmlEntity {
    private String color;

    private Bike() {
    }

    public Bike(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Bike [color=%s, id=%s]", color, getId());
    }
}

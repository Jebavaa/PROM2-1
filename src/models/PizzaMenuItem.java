package models;

public class PizzaMenuItem {
    private String name;
    private int price;

    public PizzaMenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString()
    {
        return this.name + ", " + this.price;
    }
}

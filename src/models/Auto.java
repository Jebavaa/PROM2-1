package models;

public class Auto extends Vehicle
{

    String model;


    public Auto(String brand, String model)
    {
        super(brand);
        this.model = model;
    }

    public String GetModel()
    {
        return model;
    }

    public void PrintBrand()
    {

    }

}

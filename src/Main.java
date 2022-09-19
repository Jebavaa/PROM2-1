import models.PizzaMenu;
import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Hello world!");

        PizzaMenuItem pizza = new PizzaMenuItem("hawaii", 180);
        PizzaMenuItem pizza2 = new PizzaMenuItem("hawaii", 180);
        PizzaMenuItem pizza3 = pizza;



        if(pizza == pizza3)
        {
            System.out.println("je stejna");
        }
        else {
            System.out.println("neni stejna");
        }

        pizza3.setName("Pizza");
        System.out.println(pizza.getName());



        int[] intArr = new int[] {1,2,3,4,5};


        PizzaMenuItem[] pizzaArr = new PizzaMenuItem[]{
                new PizzaMenuItem("jednaPizza", 150),
                new PizzaMenuItem("druhaPzza",150)
        };


        List<PizzaMenuItem> pizzaList = new ArrayList<>();
        pizzaList.add(new PizzaMenuItem("jednaPizza", 150));
        pizzaList.add((new PizzaMenuItem("druhaPizza",150)));

        for (PizzaMenuItem pizzaa : pizzaList)
        {
            System.out.println(pizzaa.toString());
        }

        

    }
}
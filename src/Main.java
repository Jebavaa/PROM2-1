import dataSaver.DataSaver;
import dataSaver.FileDataSaver;
import dataSaver.InMemoryDataSaver;
import models.ExampleClass1;
import models.*;

import static models.MathClass.DoMath;
import static models.MathClass.pi;

public class Main {
    public static void main(String[] args)
    {

        final int x = 10;

        ExampleClass1 exampleClass1 = new ExampleClass1();
        exampleClass1.publicMethod();

                DoMath(1,2);

                        Auto auto = new Auto("sdflkj", "ssdf");
                auto.GetBrand();

                Box<Auto> boxOfCar = new Box<>(auto);

                Box<Integer> number = new Box<>(16);

                Pair<Integer, Auto> par = new Pair<>(1, auto);


        DataSaver<Auto> dataSaver = new InMemoryDataSaver<>();

        if (true)
        {
            dataSaver = new FileDataSaver<>();
        }
        dataSaver.save(auto);
        Auto loadedAuto = dataSaver.load();


        PrintSymbol("h", 10);


    }

    private static void PrintSymbol(String symbol, int count)
    {
        if(count < 0)
        {
            return;
        }

        String textToPrint = "";
        for(int i = 0; i<count; i++)
        {
            textToPrint = textToPrint + symbol;
        }
        System.out.println(textToPrint);

        count--;
        PrintSymbol(symbol, count);
    }
}
package models;

public class ExampleClass1 {

    public int publicNumber = 11;
    protected int protectedNumber = 15;
    private int privateNumber = 12;


    public void publicMethod()
    {
        System.out.println("lskjdlsdf");

        protectedMethod();
        privateMethod();
    }

    private void privateMethod()
    {
        System.out.println("private");
    }

    protected void protectedMethod()
    {
        System.out.println("protected");
    }


    // nested class

    public class InnerClass {

        public void InnerMethod()
        {
            System.out.println("InnerMethod");
        }
    }
}

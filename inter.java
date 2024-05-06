interface CommonFunctions {

    default void show()
    {
        System.out.println("Default Implementation");
    }
}

interface InterfaceA extends CommonFunctions {

    void display();
}

interface InterfaceB extends CommonFunctions {

    void print();
}

class TestImplementation implements InterfaceA, InterfaceB {

    public void display()
    {
        System.out.println("Display Method  InterfaceA");
    }

    public void print()
    {
        System.out.println("Print Method  InterfaceB");
    }

    public static void main(String args[])
    {
        TestImplementation implementation = new TestImplementation();

        implementation.show(); 
        implementation.display(); 
        implementation.print(); 
    }
}


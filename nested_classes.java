class A{
int a1=0;
  static{
    System.out.println("A obj");
    }
  class B{
    static int b1=0;
    static{
    System.out.println("B obj");
    }
  
  }
  public static void main(String args[]){
    A a=new A();
    A.B b =a.new B();
    System.out.println(a1);
    //sSystem.out.println(a.b1);
System.out.println(a.a1);

    
    }
    }

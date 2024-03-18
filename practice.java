/*class SGGS{
  public static void main(String []args){
    SGGS s=new SGGS();
    System.out.println(s);
    System.out.println(s.toString1());
    }
  public String toString1(){
    return  "" +getClass().getName() + "@" + Integer.toString(hashCode(),2);
    }
    }
    
    */
class C1{
  {
    System.out.println("inside c1 init");
  }
  static{
    System.out.println("inside c1 static");
    }
  }
class C2 extends C1{
  {
    System.out.println("inside c2 init");
  }
  static{
    System.out.println("inside c2 static");
    }
  public static void main(String []args){
    C1 obj = new C1();
    System.out.println("in main");
    }
  }
  class C3 extends C2{
    static C3 king=new C3();
    {
    System.out.println("inside c3 init");
  }
  static{
    System.out.println("inside c3 static");
    }
  public static void main(String []args){
    C1 obj = new C1();
    C2 obj1 = new C2();
    C3 obj2 = new C3();
    System.out.println("in main");
    }
  }

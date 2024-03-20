 class A{
  int a;
  friend int sum(B &y);
  public static void main(String [] args){
    A a=new A();
    B b=new B();
    System.out.println(a.sum(b));
    }
 class B {
  int b;
  friend int sum(B &y);
} 
  friend int sum(B &y){
    return this.a+y.b;
    }
  //need to work on this 

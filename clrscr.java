class Amey{
static void A(){
clrscr(100);
System.out.println("*****");
System.out.println("*   *");
System.out.println("*****");
System.out.println("*   *");
System.out.println("*   *");
}
static void M(){
clrscr(100);
System.out.println("****   ****  ");
System.out.println("*   * *   *");
System.out.println("*    *    *");
System.out.println("*         *");
System.out.println("*         *");
}
static void E(){
clrscr(100);
System.out.println("*****      ");
System.out.println("*          ");
System.out.println("*****      ");
System.out.println("*          ");
System.out.println("*****      ");
}
static void Y(){
clrscr(100);
System.out.println("*   *      ");
System.out.println(" * *       ");
System.out.println("  *        ");
System.out.println("  *        ");
System.out.println("  *        ");
}
public static void main(String [] args){
A();
M();
E();
Y();
}
static void clrscr(int time){
try{
Thread.sleep(time);
}catch(Exception ex){}
System.out.println("\033[H\033[2J");
}
}



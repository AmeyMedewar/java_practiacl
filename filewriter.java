import java.io.*;
class filewriter{
  public static void main(String[] args){
   try
   {
    FileWriter f=new FileWriter("/home/Desktop/daily_programs/amey.txt");
   
   try{
    f.write("amey...");
   }
   finally{
    f.close();
   }
  }
  catch(IOException e){
   System.out.println(e);
  }

}
}

cdimport java.io.*;
class copyfiletofile{
 public static void main(String[] args) throws IOException{
  FileInputStream r=new FileInputStream("/home/Desktop/daily_programs/amey.txt");
  FileOutputStream w=new FileOutputStream("/home/Desktop/daily_programs/amey.txt");
  int i;
  while((i=r.read())!=-1){
   w.write((char)i);
  }
  System.out.println("Data copied successfully");
 }

}

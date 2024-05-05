import java.io.*;
class createfile{
public static void main(String[] args) throws IOException {
 File f=new File("/home/Desktop/daily_programs/amey.txt");
 if(f.createNewFile()){
  System.out.println("File successfully created");
 }
 else{
  System.out.println("file already exist");
 }

}
}

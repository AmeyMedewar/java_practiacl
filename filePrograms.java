/*tasks:
1 openig a file
2 closing 
3 creating 
4 deleting 
5 read write */

import java.io.*;
import java.util.*;
class FileEx{
  public static void main(String args[]) throws Exception{
   //3 and 4
   File newfile = new File("newfile.txt");
    newfile.createNewFile();
    File newfile1 = new File("newfile2.txt");
    newfile1.createNewFile();
    newfile1.deleteOnExit();
    
    //5 
    Scanner read =new Scanner(newfile);
    while(read.hasNextLine()){
      String data=read.nextLine();
      System.out.println(data);
      }   
    read.close();
    
    //5
    FileWriter Writer
                = new FileWriter("myfile.txt");
            Writer.write(
                "Files in java");
            Writer.close();
    
   
  }
}

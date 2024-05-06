

import java.io.*;


interface In1 {
  
    
    final int a = 10;

    void display();
}


class inter implements In1 {
  

    
    public void display(){ 
      System.out.println("Amey"); 
    }


    public static void main(String[] args)
    {
        inter t = new inter();
        t.display();
        System.out.println(a);
    }
}


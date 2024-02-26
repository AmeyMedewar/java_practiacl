import java.util.Scanner;

class Library{
    
     
      public static void main(String []args){
      Students s1=new Students();
  }
  
      
    
  }
  
  class Faculty extends books{
    String name;
    String department;
    String [] issued_books=new String[5];
    
    Faculty(){
      System.out.print("Enter Name:   ");
      Scanner Name=new Scanner(System.in);
      name=Name.nextLine();
      
      System.out.print("Enter department:   ");
      Scanner Department=new Scanner(System.in);
      department=Department.nextLine();
    }
  }
  
  class Manager extends books{
    String name;
    String id;
    
    Manager(){
      System.out.print("Enter Name:   ");
      Scanner Name=new Scanner(System.in);
       name=Name.nextLine();
      
      System.out.print("Enter id:   ");
      Scanner Id=new Scanner(System.in);
      id=Id.nextLine();
    }
    }
    
  class books{
    final String name;
    final int total;
    int available;
    
    books(){
      System.out.print("Enter Name:   ");
      Scanner Name=new Scanner(System.in);
      name=Name.nextLine();
      
      System.out.print("Enter Total Number of Books:   ");
      Scanner Total=new Scanner(System.in);
      total=Total.nextInt();
    }
    }
    
    
  
  
}
class Students extends books{
    String name;
    String registration_number;
    String [] issued_books= new String[5] ;
    int fine;
    
    Students(){//This constructor will get invoked each time new students register working as registartion form
      System.out.print("Enter Name:   ");
      Scanner Name=new Scanner(System.in);
      name=Name.nextLine();
      
      System.out.print("Enter registration_number:   ");
      Scanner Registration_number=new Scanner(System.in);
      registration_number=Registration_number.nextLine();
      }
  }

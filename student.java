class Student{
  int rollno;
  String name;
  float marks;
  void getData(int roll,String name,float marks){
    this.rollno=roll;
    this.name=name;
    this.marks=marks;
    }
  void printData(){
    System.out.println(name);
    System.out.println(rollno);
    System.out.println(marks);
    }
    
    
  public static void main(String [] args){
    Student s1=new Student();
    s1.getData(153,"Amey",9.75f);
    s1.printData();
    }
    }
    

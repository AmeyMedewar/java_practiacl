interface Voter{
    void castVote(int age);
}

interface EC{
  public void checkValid();
}

 class India implements Voter,EC{
 final int minAge;
  India(int age){
    this.minAge=age;
  }
    
    public void checkValid(){
  }
 public void castVote(int age) {
 
 if(age<18){
  throw new invalidUser("age is not 18 above");
}


}}


class MH extends India{
  MH(int age){
    super(age);
    }
    
  public static void main(String ...args) {
    India u=new India(18);
    u.castVote(12);
    }
    }

class invalidUser extends RuntimeException{
  invalidUser(String error){
    super(error);
    }
    }

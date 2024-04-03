class Exception{
  public static void main(String ...args) throws InterruptedException,ArrayIndexOutOfBoundsException{
    try{
      Thread.sleep(100);
      //System.out.println(args[0]);
    }
    catch(ArrayIndexOutOfBoundsException ex){
      System.out.println("an ArrayIndexOutOfBoundsException caught");
  }
  
  finally{
    System.out.println("atask done");
  }
  }
  }
  

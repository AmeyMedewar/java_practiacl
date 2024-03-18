class complexity{
  public static void main(String [] args){
    
    int count1=0;
    int count2=0;
    long t1=System.nanoTime();
    
    for(int i=0;i<10000000;i++){
      if(i%2==0){
        count1++;
      }
      else{
        count2++;
        }
      }
      
      long t2=System.nanoTime();
      System.out.println(t2-t1);
      
      long t3=System.nanoTime();
      for(int j=0;j<10000000;j++){
        if(i%2!=0){
          count2++;
      }
        else{
          count1++;
        }
      }
      
      long t3=System.nanoTime();
      System.out.println(t4-t3);
      }
      }
      

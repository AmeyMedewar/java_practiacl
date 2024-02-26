class SY2022BIT153{

  public static void main(String[] args){//Driver code to run the logic
    String arr[]=generateArray(1000000);
    System.out.println(System.nanoTime());
    int prime=countPrime(arr);
    System.out.println(System.nanoTime());
    System.out.println(System.nanoTime());
    int primeInverted=countPrimeInverted(arr);
    System.out.println(System.nanoTime());
    
    System.out.println(prime);
    System.out.println(primeInverted);
    
  }
  
  public static String[] generateArray(int size){
  /* this function returns a string array by callling a function generatenum recursively*/
    String numbers[] = new String[size];
    for(int i=0;i<size;i++){
      String num=generateNumber();  
      numbers[i]=num;
    }
    return numbers;
  }
  
  public static String generateNumber(){
  /* This function generates anumber string containg 6 digits */
    String num="";
    for(int i=0;i<=6;i++){
      num=num + Long.toString(System.nanoTime()%10l);
      }
      
    return num;
  }
  
  
  
  public static int countPrime(String []arr){
  /* it is used to return the count of prime numbers from the given array by calling the function isprime for each number*/
  int count=0;
    for (int i=0;i<arr.length;i++){
     if (isPrime(arr[i])){
       count++;
        }
      }
    return count;
    }
    
    public static int countPrimeInverted(String []arr){
  /* it is used to return the count of prime numbers from the given array by calling the function isprime for each number*/
  int count=0;
    for (int i=0;i<arr.length;i++){
     if (isPrimeInverted(arr[i])){
       count++;
        }
      }
    return count;
    }
  
  public static boolean isPrime(String num){
  /*It checks wheather a number is prime or not and depending upon that return a boolean output*/
    int Num = Integer.parseInt(num);
    if(Num%2==0){
      return false;
    }
    else{
      for(int i=2;i<Num/2;i++){
        if(Num%i==0){
          return false;
          }
        }
      }
    return true;
}

  public static boolean isPrimeInverted(String num){
  /*It checks wheather a number is prime or not and depending upon that return a boolean output*/
    int Num = Integer.parseInt(num);
    if(Num%2!=0){
      for(int i=2;i<Num/2;i++){
        if(Num%i==0){
          return false;
          }
        }
    }
    else{
      return false;
      }
    return true;
}
}


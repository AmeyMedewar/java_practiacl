class Palindrome{
  static boolean ispalindrome(int n){
    int original=n;
    int rem=0;
    int newnum=0;
    while (n!=0){
      rem=n%10; 
      newnum=newnum*10+rem;
      n=n/10;
      }
    if (newnum==original){
      return true;
    }
    else{
    return false;
    }
    }
    
  public static void main(String args[]){
    System.out.println(ispalindrome(1112));
    }
    }
      

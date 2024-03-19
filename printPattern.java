class Pattern{
  static void print(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*");
        }
        System.out.println("\n");
      }
      
      for(int i=n;i>0;i--){
      for(int j=i;j>0;j--){
        System.out.print("*");
        }
        System.out.println("\n");
      }
    }
    public static void main(String args[]){
      print(15);
      }
      }
  
      

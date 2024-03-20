class Sum{
  static int sum(int a[]){
  int sum=0;
    for(int i=0;i<a.length;i++){
      sum+=a[i];
      
      }
      return sum;
      }
    public static void main(String [] args){
      int arr[]={1,2,3,4,5,6,7,8,9,0,5};
      System.out.println(sum(arr));
      }
      }

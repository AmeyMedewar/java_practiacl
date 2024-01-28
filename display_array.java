class SY2022bit153{
  public static void main(String args[]){
    int a[]={};
    int sum=task5(a);
    }
    
  public void task1(int a[]){
    int l=a.length;
    for(int i=0;i<l;i++){
      System.out.println(a[i]);
      }
    }
  public int task2(int a[]){
      return a[0];
    }
  public int task3(int a[]){
      int l=a.length;
      return a[l];
    }
  public static int task5(int a[]){
      int s=0;
      int l=a.length;
      for(int i=0;i<l;i++){
        s=s+a[i];
        }
      return s;  
        }
  public int task4(int a[]){
      int l=a.length;
      return a[l-1];
      }
  }
  

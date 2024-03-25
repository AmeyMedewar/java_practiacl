class Max{
  static int maxElement(int []arr){
    int max=0;
    for (int i=0;i<arr.length;i++){
      if(max<arr[i]){
        max=arr[i];
        }
      }
    return max;
  }
static int minElement(int []arr){
    int min=0;
    for (int i=0;i<arr.length;i++){
      if(min>arr[i]){
        min=arr[i];
        }
      }
    return min;
  }
  public static void main(String args[]){
    int nums[]={1,32,45,67,98,5,7,84,94,0};
    System.out.println("max:" + maxElement(nums));
    System.out.println("min:" + minElement(nums));
    }
}


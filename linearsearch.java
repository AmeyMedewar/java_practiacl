class LinearSearch{    
    public static int linearSearch(int[] arr, int s){    
            for(int i=0;i<arr.length;i++){    
                if(arr[i] == s){    
                    return i;    
                }    
            }    
            return -1;    
        }    
        public static void main(String a[]){    
            int[] a1= {10,20,30,50,70,90,1,2,3,4,5,6,7,8,9};    
            int s = 50;    
            System.out.println(s+" is found at index:"+linearSearch(a1, s));    
        }    
    }    

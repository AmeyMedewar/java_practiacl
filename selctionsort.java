class SelectionSortExample {  
        public static void selectionSort(int[] arr){  
            for (int i= 0;i< arr.length-1;i++)  
            {  
                int ind = i;  
                for (int j = i + 1; j < arr.length; j++){  
                    if (arr[j] < arr[ind]){  
                        ind = j;//searching for lowest index  
                    }  
                }  
                int smallerNumber = arr[ind];   
                arr[ind] = arr[i];  
                arr[i] = smallerNumber;  
            }  
        }  
           
           public static void main(String a[]){  
            int[] arr1 = {9,14,3,2,43,11,58,22,0,98,56,234,4,22,1};  
             
            for(int i:arr1){  
                System.out.print(i+" ");  
            }  
            System.out.println();  
              
            selectionSort(arr1); 
             
            
            for(int i:arr1){  
                System.out.print(i+" ");  
            }  
            System.out.println();  
        }  
    }  

class Armstrong{
	static boolean isarmstrong(int n){
	int org=n;
	int rem=0;
	int check=0;
	
		while(n!=0){
		  rem=n%10;
		  check=check+rem*rem*rem;
		  n=n/10;
		  }
		if (org==check){
			return true;
		}
		else{
			return false;
		}
		}
	public static void main(String args[]){
		System.out.println(isarmstrong(153));
		}
		}
		

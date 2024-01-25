class className{
	int instanceVar=100; //this is a instance var it needs an obj to call it
	
 	static String staticVar ="amey";  //This is a class variable it do not need obj to call it
	
	
	
	public static void main(String Args[]){
	      className obj1 =new className();
	      //system.out.println(instanceVar);
	      //system.out.println(className.instanceVar);
	      System.out.println(obj1.instanceVar);
	      System.out.println(staticVar);
	      System.out.println(className.staticVar);
	      System.out.println(obj1.staticVar);
	      
			
		
		
		}

}

class SY2022bit153{
  //Driver code to test the logic 
  public static void main(String[] args){
    String[] test={"2022BIT150","2011BMH900","2022BIT050"};
    int answer=getValidRegistrationsCountLE50(test);
    System.out.println(answer);
  }
  
  public static int getValidRegistrationsCount(String[] registrations){
    int count=0; //variable to count the valid numbers
    int i=0;
    for(i=0;i<registrations.length;i++){ 
      String reg_no=registrations[i];
      if (reg_no.length()==10){  //checking the length of number for primary sorting 
        int year=Integer.parseInt(reg_no.substring(0,4));
        if (year>=2000 & year<2025){  //checking if the year is valid or not
          String a=reg_no.substring(4,7);
          if (a.equals("BIT")||a.equals("BCS") ||a.equals( "BME" )|| a.equals( "BCH")){  //checking of valid departmental codes
            
            count +=1;
          }       
        }
      }
    }
    return count; 
  }  
  public static int getValidRegistrationsCountLE50(String[] registrations){
    int count=0; //variable to count the valid numbers
    int i=0;
    for(i=0;i<registrations.length;i++){ 
      String reg_no=registrations[i];
      if (reg_no.length()==10){  //checking the length of number for primary sorting 
        int year=Integer.parseInt(reg_no.substring(0,4));
        if (year>=2000 & year<2025){  //checking if the year is valid or not
          String a=reg_no.substring(4,7);
          if (a.equals("BIT")||a.equals("BCS") ||a.equals( "BME" )|| a.equals( "BCH")){  //checking of valid departmental codes
            if (Integer.parseInt(reg_no.substring(8,10))<=50){
              count+=1;
              }
                       
           
          }       
        }
      }
    }
    return count; 
  }  
}

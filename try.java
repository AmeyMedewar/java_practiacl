class SY2022bit153{
  //Driver code to test the logic 
  public static void main(String[] args){
    String [] registrations=generaterandomRegistrationArray(500000); //returns an array of registration numbers randomly generated
    /* We pass the array size and the function returns an array of the length in the specific format */ 
    
    printDataOfTimeComplexity(registrations); //this function prints the data i.e. time complexities of various methods implemented
    
    
  
  }
  
  public static boolean isValidFormatOfRegistration(String reg){
  /* Function to check the format of the string YYYY-DDD-SSS*/
  
    if (isAllDigit(reg.substring(0,4))){
      if(isAllCharOfDept(reg.substring(4,7))){
        if(isAllDigit(reg.substring(7,10))){
          return true;
          }
        }
      }
    return false;  
  }
    
  public static boolean isValidRangeOfRegistrations(String regno){
    int year =Integer.parseInt(regno.substring(0,4));
    if (year>=2000 & year<2025){  //checking if the year is valid or not
      return true;
      }
    return false;  
  }
  
  public static boolean isVaidDept(String regno){
    String a =regno.substring(4,7);
    if (a.equals("bit")||a.equals("bcs") ||a.equals( "bme" )|| a.equals( "bch")){  //checking validity of  departmental codes
            return true;
            }
      return false;      
  }
  
    public static boolean isAllDigit( String reg){ // checking if all are digits in given substring
    for (int i=0;i<reg.length();i++){
      char c=reg.charAt(i);
      if (!Character.isDigit(c)){
      return false;
      }
    }
    return true;
    }
  
  public static boolean isAllCharOfDept(String reg){  // checking if all the letters of departmental codes are characters
    for (int i=0;i<reg.length();i++){
      char c=reg.charAt(i);
      if (!Character.isLetter(c)){
      return false;
      }
    }
    return true;
  }
  
  /*-------------------------Approach 1---------------------------*/
  
  public static int getValidRegistrationsCountLE50APR1(String[] registrations){
    int count=0;
        for(int i=0;i<registrations.length;i++){
          if(registrations[i].length()==10){
            if (isValidFormatOfRegistration(registrations[i])){
              if (isValidRangeOfRegistrations(registrations[i])){
                if (isVaidDept(registrations[i])){
                  if (isValidSequenceLE50APR1( registrations[i])){
                    count++;  
                  }
                }
              }
            }
          }
        }
      return count;
        }
        /* parseInt method to change the number string to integer and then checking sequence */
        
  public static boolean isValidSequenceLE50APR1( String reg){
    int seq=Integer.parseInt(reg.substring(7,10));
    if (seq>0 && seq<=50){
      return true;
      }
    return false;
    }
  
  
    /*-------------------------Approach 2---------------------------*/
  
  public static int getValidRegistrationsCountLE50APR2(String[] registrations){
    int count=0;
        for(int i=0;i<registrations.length;i++){
          if(registrations[i].length()==10){
            if (isValidFormatOfRegistration(registrations[i])){
              if (isValidRangeOfRegistrations(registrations[i])){
                if (isVaidDept(registrations[i])){
                  if (isValidSequenceLE50APR2( registrations[i])){
                    count++;  
                  }
                }
              }
            }
          }
        }
      return count;
        }
        /* use of charAt and getNumericValues method for checking validity of sequnece codes */
  public static boolean isValidSequenceLE50APR2( String reg){
    char num=(reg.charAt(7));
    int num_=Character.getNumericValue(num);
    if(num_==0){
      num=(reg.charAt(8));
      num_=Character.getNumericValue(num);
      if(num_<5){
        return true;
        }
      else if(num_==5){
        num=(reg.charAt(9));
        num_=Character.getNumericValue(num);
      
        if (num_==0){
          return true;
        }
      }
    }
    return false;
  }
  
  
   /*-------------------------Approach 3---------------------------*/
  
  public static int getValidRegistrationsCountLE50APR3(String[] registrations){
    int count=0;
        for(int i=0;i<registrations.length;i++){
          if(registrations[i].length()==10){
            if (isValidFormatOfRegistration(registrations[i])){
              if (isValidRangeOfRegistrations(registrations[i])){
                if (isVaidDept(registrations[i])){
                  if (isValidSequenceLE50APR1( registrations[i])){
                    count++;  
                  }
                }
              }
            }
          }
        }
      return count;
        }
        /* using digit method in Character class which returns the digit in that number system using 
        which we compared the numbers */
        
  public static boolean isValidSequenceLE50APR3( String reg){
    
    char num=(reg.charAt(7));
    int num_=Character.digit(num,10);
    if(num_==0){
      num=(reg.charAt(8));
      num_=Character.digit(num,10);
      if(num_<5){
        return true;
        }
      else if(num_==5){
        num=(reg.charAt(9));
        num_=Character.digit(num,10);
      
        if (num_==0){
          return true;
        }
      }
    }
    return false;
  }
    
    
 /*-------------------------Approach 4---------------------------*/
  
  public static int getValidRegistrationsCountLE50APR4(String[] registrations){
    int count=0;
        for(int i=0;i<registrations.length;i++){
          if(registrations[i].length()==10){
            if (isValidFormatOfRegistration(registrations[i])){
              if (isValidRangeOfRegistrations(registrations[i])){
                if (isVaidDept(registrations[i])){
                  if (isValidSequenceLE50APR4( registrations[i])){
                    count++;  
                  }
                }
              }
            }
          }
        }
      return count;
        }
        /* similar approach like digit method but using dirct checking y providing values to compare method */
        
  public static boolean isValidSequenceLE50APR4( String reg){
   char num=(reg.charAt(7));
   int diff=Character.compare(num,'0');
   if (diff==0){
    num=(reg.charAt(8));
    diff=Character.compare(num,'5');
    if(diff<0){
      return true;
      }
    else if(diff==0){
      num=(reg.charAt(9));
      diff=Character.compare(num,'0');
      if(diff==0){
        return true;
        }
      }
    }
    return false;    
    
  }
  
  
  /*-------------------------Approach 5---------------------------*/
  
   public static int getValidRegistrationsCountLE50APR5(String[] registrations){
    int count=0; //variable to count the valid numbers
    int i=0;
    for(i=0;i<registrations.length;i++){ 
      String reg_no=registrations[i];
      if (reg_no.length()==10){  //checking the length of number for primary sorting 
        int year=Integer.parseInt(reg_no.substring(0,4));
        if (year>=2000 & year<2025){  //checking if the year is valid or not
          String a=reg_no.substring(4,7);
          if (a.equals("BIT")||a.equals("BCS") ||a.equals( "BME" )|| a.equals( "BCH")){  //checking of valid departmental codes
             int seq=Integer.parseInt(reg_no.substring(7,10));
             if (seq>0 && seq<=50){
                count +=1;
            }
          }       
        }
      }
    }
    return count; 
  }  
  /* different approach insted of using different methods the logic is implemented directly inside a single function */
  
  
 
 /*------To Generate a Sequence of random Registration Numbers-----------------*/
 
 public static String[] generaterandomRegistrationArray(int size){ //generate an array by seperatly calling a generateregistration function
  String regArray[] = new String[size];
  for(int i=0;i<size;i++){
    regArray[i] = generateRegistrationNumber();
    }
    return regArray;
  }
  
  public static String generateRegistrationNumber(){
    String reg="";
    for(int i=0;i<=3;i++){
      int numyear=((int)(Math.random()*100)%10);  // generates first four digit showcasing year of enrollment
      String num =Integer.toString(numyear);
      reg=reg+num;
      }
    for(int i=0;i<=2;i++){
      int dept=((int)(Math.random()*100)%26) + 97;  //generates next three characters for dept codes
      /* using math random then after converting to hashcodes convert the number to alphabets */
      String num =Character.toString(dept);
      reg=reg+num;   
      }
      
     for(int i=8;i<=10;i++){
      int numseq=((int)(Math.random()*100)%10); // generates random sequnce for sequnce codes
      String num =Integer.toString(numseq);
      reg=reg+num;
      }
      return reg;
    }
    
    /*-------------------------------------print data ------------------------------------*/
    public static void printDataOfTimeComplexity(String[] registrations){
    /* printing timings of start , end and execution time using nanotime method */
    long initial;
    long finaltime;
    long total;
    int answer;
    
    System.out.print("1    ");
    initial=System.nanoTime();
    System.out.print(initial + "    ");
    answer=getValidRegistrationsCountLE50APR1(registrations);
    finaltime = System.nanoTime();
    System.out.print(finaltime + "    ");
    total= finaltime - initial;
    System.out.println(total);
    
    System.out.print("2    ");
    initial=System.nanoTime();
    System.out.print(initial + "    ");
    answer=getValidRegistrationsCountLE50APR2(registrations);
    finaltime = System.nanoTime();
    System.out.print(finaltime + "    ");
    total= finaltime - initial;
    System.out.println(total);
    
    System.out.print("3    ");
    initial=System.nanoTime();
    System.out.print(initial + "    ");
    answer=getValidRegistrationsCountLE50APR3(registrations);
    finaltime = System.nanoTime();
    System.out.print(finaltime + "    ");
    total= finaltime - initial;
    System.out.println(total);
    
    System.out.print("4    ");
    initial=System.nanoTime();
    System.out.print(initial + "    ");
    answer=getValidRegistrationsCountLE50APR4(registrations);
    finaltime = System.nanoTime();
    System.out.print(finaltime + "    ");
    total= finaltime - initial;
    System.out.println(total);
    
    System.out.print("5    ");
    initial=System.nanoTime();
    System.out.print(initial + "    ");
    answer=getValidRegistrationsCountLE50APR5(registrations);
    finaltime = System.nanoTime();
    System.out.print(finaltime + "    ");
    total= finaltime - initial;
    System.out.println(total);
      }
    }
      
    
    
    
    
  
  
  
  

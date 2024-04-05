class calci {
  final double pi=3.14159265359;
  final double e=2.718281828459045;
  
  
  public static void main(String args[]) throws InvalidInputException {
    int num1 = 10;
    int num2 = 20;
    int sum = add(num1, num2); //addition functionality
    int sub = minus(num1, num2); //subtraction functionality
    int mul = multiply(num1, num2); //Multiplication functionality
    float div = divide(num1, num2); //division functionality
    int mod = modulo(num1, num2); //modulus operation
    double expo = exponent(num1, num2); //exponential operation
    double sqr = square(num1); //square of number
    double cub = cube(num1); //cube of number
    float per = percent(num2); //percentage function

  }

  static int add(int a, int b) {
    return a + b;
  }
  
  static int minus(int a, int b) {
    return a - b;
  }
  
  static int multiply(int a, int b) {
    return a * b;
  }
  
  static float divide(int a, int b) throws InvalidInputException {
    int ans = 0;
    try {
      ans = a / b;
    } catch (Exception e) {
      throw new InvalidInputException();
    }
    return ans;
  }
  
  static int modulo(int a, int b) {
    return a % b;
  }
  
  static double exponent(int a, int b) {
    return a ^ b;
  }
  
  static double square(int a) {
    return a * a;
  }
  
  static double cube(int a) {
    return a * a * a;
  }
  
  static float percent(int a) {
    return a * (1 / 100);
  }
  
  static long factorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    } else {
      return factorial(num - 1) * num;
    }
  }
  
  static long aPowerb(int a, int b) {
    int ans = 0;
    for (int i = 1; i <= b; i++) {
      ans = ans * a;
    }
    return ans;
  }

  static double aPowerb(double a, double b) {
    double ans = 0;
    for (int i = 1; i <= b; i++) {
      ans = ans * a;
    }
    return ans;
  }

  static double squareRoot(int num) throws InvalidInputException {
    if (num < 0) {
      throw new InvalidInputException();
    } else {
      double t;
      double sqrtroot = num / 2;
      do {
        t = sqrtroot;
        sqrtroot = (t + (num / t)) / 2;
      }
      while ((t - sqrtroot) != 0);
      return sqrtroot;
    }
  }

  static String BinaryConvert(int num) {
    String ans = "";
    int rem;
    while (num != 0) {
      rem = num % 2;
      ans = ans.concat(Integer.toString(rem));
      num = num / 2;
    }
    return ans;
  }

  static String HexadecimalConvert(int num) {
    String ans = "";
    int rem;
    while (num != 0) {
      rem = num % 16;
      ans = ans.concat(Integer.toString(rem));
      num = num / 2;
    }
    return ans;
  }

  static String OctalConvert(int num) {
    String ans = "";
    int rem;
    while (num != 0) {
      rem = num % 8;
      ans = ans.concat(Integer.toString(rem));
      num = num / 2;
    }
    return ans;
  }
  
  static double degreeToRadian(double degree){
    double rad=degree/180;
    return rad;
  }
  
 static float sin(float x){
      float sin=0.0f;
      long fact;
      for(int i=1; i<=10; i++){
          fact=1;
          for(int j=1; j<=2*i-1; j++){
              fact=fact*j;
          }
          if(i%2==1){
              sin=sin+(float)(calci.aPowerb(x,2*i-1)/fact);
          }else{
              sin=sin-(float)(calci.aPowerb(x,2*i-1)/fact);
          }
      }
      return sin;
  }
  
  static float cosine(float x){
    return (1/calci.sin(x));
  }
    
  static String ENG(int num){
    double ans=num/100000;
    return ""+Double.toString(ans)+" X 10^6";
    }
    
  static double inverse(int num)throws InvalidInputException{
    if (num==0){
      throw new InvalidInputException();
      }
    else{
      return 1/num;
      }
  }
  static double log10(int num) throws InvalidInputException{
        int x=num;
        if (x <= 0) {
            throw new InvalidInputException();
        }

        int a = 0;
        while (x / 10 > 0) {
            a++;
            x /= 10;
        }

        double r = a;
        double frac = 0.5;
        double x1 = x;
        for (int i = 0; i < 25; i++) {
            x1 *= x1;
            if (x1 > 10) {
                x1 /= 10;
                r += frac;
            }
            frac /= 2;
        }
        return r;
    }
    
}


//this class handles exception of invalid input 
class InvalidInputException extends Exception {
  InvalidInputException() {
    super("Invalid Input ");
  }
}

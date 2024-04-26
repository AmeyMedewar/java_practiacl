class calci {
    final double pi = 3.14159265359;
    final double e = 2.718281828459045;

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
    if (b == 0) {
        throw new InvalidInputException();
    }
    return (float) a / b;
}


    static int modulo(int a, int b) {
        return a % b;
    }

    static double exponent(int a, int b) {
        return Math.pow(a, b);
    }

    static double square(int a) {
        return a * a;
    }

    static double cube(int a) {
        return a * a * a;
    }

    static float percent(int a) {
        return a * 0.01f;
    }

   static long factorial(int num) {
    if (num == 0 || num == 1) {
        return 1;
    } else {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}


    static long aPowerb(int a, int b) {
        long ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        return ans;
    }

    static double aPowerb(double a, double b) {
        return Math.pow(a, b);
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
    
     static float squareRoot(float x) {
        
        if (x <= 0 ) {
            return 0.0f;
        }
        float guess = x / 2.0f;
        int iterations = 100;
        for (int i = 0; i < iterations; i++) {
            guess = 0.5f * (guess + x / guess);
        }
        return guess;
    }

    


    static String BinaryConvert(int num) {
    StringBuilder ans = new StringBuilder();
    while (num != 0) {
        int rem = num % 2;
        ans.append(rem);
        num = num / 2;
    }
    return ans.reverse().toString();
}

static String HexadecimalConvert(int num) {
    StringBuilder ans = new StringBuilder();
    while (num != 0) {
        int rem = num % 16;
        if (rem < 10) {
            ans.append(rem);
        } else {
            ans.append((char) (rem - 10 + 'A'));
        }
        num = num / 16;
    }
    return ans.reverse().toString();
}

static String OctalConvert(int num) {
    StringBuilder ans = new StringBuilder();
    while (num != 0) {
        int rem = num % 8;
        ans.append(rem);
        num = num / 8;
    }
    return ans.reverse().toString();
}

    static double degreeToRadian(double degree) {
        double rad = degree / 180;
        return rad;
    }

    static float sin(float x) {
        float sin = 0.0f;
        long fact;
        for (int i = 1; i <= 10; i++) {
            fact = 1;
            for (int j = 1; j <= 2 * i - 1; j++) {
                fact = fact * j;
            }
            if (i % 2 == 1) {
                sin = sin + (float) (calci.aPowerb(x, 2 * i - 1) / fact);
            } else {
                sin = sin - (float) (calci.aPowerb(x, 2 * i - 1) / fact);
            }
        }
        return sin;
    }

    
    static float cosine(float x) {
        return (float) squareRoot(1 - sin(x) * sin(x));
    }

    static float tangent(float x) {
        return sin(x) / cosine(x);
    }

    static float secant(float x) {
        return 1 / cosine(x);
    }

    static float cosecant(float x) {
        return 1 / sin(x);
    }

    static float cotangent(float x) {
        return cosine(x) / sin(x);
    }

    static String ENG(int num) {
        double ans = num / 100000;
        return "" + Double.toString(ans) + " X 10^6";
    }

    static double inverse(int num) throws InvalidInputException {
        if (num == 0) {
            throw new InvalidInputException();
        } else {
            return 1 / num;
        }
    }

    static double log10(int num) throws InvalidInputException {
        int x = num;
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
    
    static long combination(int n, int k) {
        return factorial(n) / (factorial(k)*factorial(n - k));
    }
   
   
    static long permutation(int n, int k) {
        return factorial(n) / factorial(n - k);
    }
   
    
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}

//this class handles exception of invalid input 
class InvalidInputException extends Exception {
    InvalidInputException() {
        super("Invalid Input ");
    }
}


class TryCalci {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        try {
            int sum = calci.add(num1, num2);
            System.out.println("Sum: " + sum);

            int sub = calci.minus(num1, num2);
            System.out.println("Subtraction: " + sub);

            int mul = calci.multiply(num1, num2);
            System.out.println("Multiplication: " + mul);

            float div = calci.divide(num1, num2);
            System.out.println("Division: " + div);

            int mod = calci.modulo(num1, num2);
            System.out.println("Modulus: " + mod);

            double expo = calci.exponent(num1, num2);
            System.out.println("Exponential: " + expo);

            double sqr = calci.square(num1);
            System.out.println("Square: " + sqr);

            double cub = calci.cube(num1);
            System.out.println("Cube: " + cub);

            float per = calci.percent(num2);
            System.out.println("Percentage: " + per);

            long factorial = calci.factorial(num1);
            System.out.println("Factorial: " + factorial);

            long aPowerbInt = calci.aPowerb(num1, num2);
            System.out.println("a to the power of b (int): " + aPowerbInt);

            double aPowerbDouble = calci.aPowerb((double) num1, (double) num2);
            System.out.println("a to the power of b (double): " + aPowerbDouble);

            double sqrt = calci.squareRoot(num1);
            System.out.println("Square root: " + sqrt);

            float sqrtFloat = calci.squareRoot((float) num1);
            System.out.println("Square root (float): " + sqrtFloat);

            String binary = calci.BinaryConvert(num1);
            System.out.println("Binary: " + binary);

            String hexadecimal = calci.HexadecimalConvert(num1);
            System.out.println("Hexadecimal: " + hexadecimal);

            String octal = calci.OctalConvert(num1);
            System.out.println("Octal: " + octal);

            double degree = 45.0;
            double radian = calci.degreeToRadian(degree);
            System.out.println(degree + " degrees to radians: " + radian);

            float sin = calci.sin(num1);
            System.out.println("Sin: " + sin);

            float cos = calci.cosine(num1);
            System.out.println("Cosine: " + cos);

            float tan = calci.tangent(num1);
            System.out.println("Tangent: " + tan);

            float sec = calci.secant(num1);
            System.out.println("Secant: " + sec);

            float csc = calci.cosecant(num1);
            System.out.println("Cosecant: " + csc);

            float cot = calci.cotangent(num1);
            System.out.println("Cotangent: " + cot);

            String eng = calci.ENG(num1);
            System.out.println("Engineering notation: " + eng);

            double inverse = calci.inverse(num1);
            System.out.println("Inverse: " + inverse);

            double log10 = calci.log10(num1);
            System.out.println("Logarithm base 10: " + log10);

           long combination = calci.combination(num1, num2);
            System.out.println("Combination: " + combination);

            long permutation = calci.permutation(num1, num2);
            System.out.println("Permutation: " + permutation);

            int gcd = calci.GCD(num1, num2);
            System.out.println("GCD: " + gcd);

            int lcm = calci.LCM(num1, num2);
            System.out.println("LCM: " + lcm);

        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}


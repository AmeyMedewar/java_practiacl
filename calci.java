class calci{
public static void main(String args []){
int num1=10;
int num2=20;
int sum=add(num1,num2); //addition functionality
int sub=minus(num1,num2); //subtraction functionality
int mul=multiply(num1,num2); //Multiplication functionality
float div=divide(num1,num2); //division functionality
int mod=modulo(num1,num2); //modulus operation
double expo=exponent(num1,num2); //exponential operation
double sqr=square(num1); //square of number
double cub=cube(num1); //cube of number
float per=percent(num2);  //percentage function

}
static int add(int a,int b){
return a+b;
}
static int minus(int a,int b){
return a-b;
}
static int multiply(int a,int b){
return a*b;
}
static float divide(int a,int b){
if (b==0){
return -1;
}
else{
return a/b;
}
}
static int modulo(int a,int b){
return a%b;
}
static double exponent(int a,int b){
return a^b;
}
static double square(int a){
return a*a;
}
static double cube(int a){
return a*a*a;
}
static float percent(int a){
return a*(1/100);
}

}

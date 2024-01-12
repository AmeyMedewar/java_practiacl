class calci{
public static void main(String args []){
int num1=10;
int num2=20;
int sum=add(num1,num2); //addition functionality
int sub=minus(num1,num2); //subtraction functionality
int mul=multiply(num1,num2); //Multiplication functionality
float div=division(num1,num2); //division functionality


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

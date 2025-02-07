  
class Calculator
{
 public static int PowreInt(int num1,int num2)
{  
int res =(int)Math.pow(num1,num2);
return res;
}
public static double PowerDouble(double num1,double num2)
{
int res = (int)Math.pow(num1,num2);
return res;
}
}
class Calculatormain
{
public static void main(String s[])
{
Calculator c1=new Calculator();
System.out.println("power  res = "+ c1.PowreInt( 2,3));
System.out.println("power  res = "+ c1.PowerDouble (3.0,4.0));

}
}
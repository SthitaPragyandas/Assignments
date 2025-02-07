import java.util.*;

class Exception {
    public  static void main (String s[]){
        try{
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a= sc.nextInt();
            System.out.println("enter the value of b");
            int b= sc.nextInt();
            int c= a/b;
            System.out.println("the result of ,c = "+c);

        }
        catch(ArithmeticException e){
            System.out.println("Denominator cannot be zero");

        }
        finally{
            System.out.println("end of the program");
        }

        
    }
}
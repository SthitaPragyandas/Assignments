import java.util.Scanner;
 class Sum
 {
     public static void main (String args[])
     {
         int n,sum=0,r;
         System.out.println("enter any number");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         while(n>0)
         {
             r=n%10;
             sum=sum+r;
             n=n/10;
         }
         System.out.println("sum="+sum);
     }
 }
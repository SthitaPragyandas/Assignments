  import java.util.Scanner;
 class Prime
 {
     public static void main(String args[])
     {
         System.out.println("enter a number :");
         int n,count=0;
         Scanner sc =new Scanner(System.in);
         n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             if(n%i==0)
             {
                 count++;
                 
                 
             }
         }
        if(count==2)
        {
            System.out.println("it is a prime no");
        }
                else
                {
                System.out.println("it is not a prime no");
                }
           
        
     }
 }
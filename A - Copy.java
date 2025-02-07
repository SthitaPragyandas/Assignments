import java.util.Scanner;
class A{
    public static void main(String s[]) {
        int n,sum=0;
        System.out.println("enter a num:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
            // i=i+1;
            
            System.out.println( "the addition of the natural numbers="+sum);
            

        }
    }
}
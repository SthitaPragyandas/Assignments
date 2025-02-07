import java.util.*;
 class Palindrome1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int r =0;
        a=n;
        while (n>0) {
            r=n%10;
            System.out.print(r);
            n=n/10;
            
            
        }
if (r==a) {
    System.out.println("palindrome");
    
}else{
    System.out.println("not");
}
    }

 }
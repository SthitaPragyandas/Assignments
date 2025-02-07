 import java.util.*;
 class Palindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sc.nextInt();
        int a;
        int p=0;
        int r =0;
        a=n;
        while (n>0) {
            r=n%10;
            p=(p*10)+r;
        
            n=n/10;
            
            
        }
if (a==p) {
    System.out.println("palindrome");
    
}else{
    System.out.println("not");
}
    }

 }
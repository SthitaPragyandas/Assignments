import java.util.*;
 class Odd{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        n= sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.println(i);

        }
    }
 }
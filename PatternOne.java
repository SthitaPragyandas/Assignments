 import java.util.*;
 class PatternOne{
    public static void main(String args[]){
        int n,m;
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();

        for ( int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
 }

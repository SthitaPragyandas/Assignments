 import java.util.*;
 class Matrix{
    public static void main (String s[]){
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the element of matrix:");
        for( int i=0;i<2;i++){

            for(int j=0;j<2;j++){
                a[i][j] = sc.nextInt();
            }
                 

        }
        System.out.println("Matrix");
        for( int i=0;i<2;i++){

            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
                
           System.out.println();
        }

         
    }

 }
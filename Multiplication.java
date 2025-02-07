 import java.util.*;
 class Multiplication{
    public static void main(String s[]){
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element of first array:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("first matrix :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the value of second array");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("second matrix :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("matrix multiplication:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    c[i][j]= c[i][j]+a[i][k]*b[k][j];

                }
                 
            }
             
        }
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                
              System.out.print(c[i][j]+" ");

                }
                System.out.println();
            
        }
    }
 }
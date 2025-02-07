import java.util.*;
public class MatrixSum {
    public static void main(String s[]){
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element of first array:");
        for (int i=0;i<3;i++){//row
            for(int j=0;j<3;j++){
                 a[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix");
        for( int i=0;i<3;i++){
            for( int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        
        }
        System.out.println("enter the value of the second array:");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix :");
        for( int i=0;i<3;i++){
            for( int j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of the two matrix is:");
          
            for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                    c[i][j]=a[i][j]+b[i][j];
                }  
          }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
         } 

    }
}

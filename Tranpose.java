import java.util.*;
class Tranpose{
    public static void main(String s[]){
        int a[][] = new int[3][3];
        Scanner sc = new Scanner( System.in);
        System.out.println("enter  the element of the array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" Tranpose matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }    
    }
 }
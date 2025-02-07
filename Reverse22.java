import java.util.*;
class Reverse22
{
    public static void main(String args[])
{
    int a,b ;
    Scanner sc = new Scanner(System.in);
    a=2;
    b=2;
    int arr[][]=new int[a][b];
    System.out.println("Enter the elements of the array :");
    for(int i=0;i<a;i++)
    {
    for (int j=0;j<b;j++)
    {
        arr[i][j]=sc.nextInt();
    }
    }
    System.out.println("after reversing the elements of the array:");
    for(int i=a-1;i>=0;i--);
    {
        for(int j=b-1;j>=0;j--);
    System.out.println(arr[a][b]);
}
}
}
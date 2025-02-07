import java.util.*;
class CheckNoArray
{
  public static void main(String s[])
   {
     int arr[] =new int[]{1,3,45,64,7,8};
      int n;
      System.out.println ("enter a number");
       
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();

      for(int i=1;i<arr.length;i++)
       { 
        System.out.println(n +"is present in array");
  
       }
       System.out.println(n + " is not present in the array");     
   }
}
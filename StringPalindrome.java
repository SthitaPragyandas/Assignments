 import java.util.*;
 class StringPalindrome{
    public static void main(String s[]){
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        System.out.println("enter the String value");
        int j=s1.length()-1;
        int i=0;
        while(i<=s1.length()-1 && j>=0)
        {
           if(s1.charAt(i)==s1.charAt(j))
           {
            i++;
            j--;
           }
           else
           {
            break;
           }
        }
        if(i==j)
        {
            System.out.println("the entered word is pallindrom");
        }
    }

 }
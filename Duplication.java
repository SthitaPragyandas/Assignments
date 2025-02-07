import java.util.*;
class Duplication
{
    public static void main(String args[])
{
    HashSet <Integer> hs = new HashSet <Integer> ();
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size of the array as n =");
    int n = sc.nextInt();
    for (int i=0;i<n;i++)
    {
    System.out.println("enter the element at position,i="+i);
    hs.add(sc.nextInt());
}
    System.out.println("hs unique elements ="+hs);
}
}
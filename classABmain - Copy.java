 import java.util.*;
 class A{
    
    Scanner sc = new Scanner(System.in);
    int a1 =sc. nextInt();
    public void Am1(){
        System.out.println("a1 in class A");
    }
 }
 class B{
    
    Scanner sc = new Scanner(System.in);
    int b1 = sc.nextInt();
    public void Bm1(){
        System.out.println("b1 in class B");
    }
 }
 class ABmain{
    public static void main(String s[]){
          A a1 = new A();
          B b1 = new B();
          a1.Am1();
          b1.Bm1();
    }
 }
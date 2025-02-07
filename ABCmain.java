 
 class A{
    int a1 =10;
    public void Am1(){
        System.out.println("a1 in class A");
    }
    public static void Am2(){
        System.out.println("m2 in class A,static method");
    }
    
 }
 class B extends A{
    int b1 = 20;
    public void Bm1(){
        System.out.println("b1 in class B");
    }
 }
 class C extends B{
    int c1 = 30;
    public static void Cm1(){
        System.out.println("c1 in class c");
    }
 }
 class ABCmain{
    public static void main(String s[]){
          A a1 = new A();
          B b1 = new B();
          C c1 = new C();
          A.Am2();
          a1.Am2();
          a1.Am1();
          b1.Bm1();
          b1.Am1();
          //a1.Bm1();
    }
 }
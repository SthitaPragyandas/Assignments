 class A{
    int a1 =10;
    public void Am1(){
        System.out.println("a1 in class A");
    }
 }
 class B extends A{
    int b1 = 20;
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
          b1.Am1();
          
    }
 }
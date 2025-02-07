class P3{
    int a;
    P3(int a){
        this.a=a;
        // this.b=b;
    }
    public void disp(){
        System.out.println("in class p3 ,a ="+a);
    }
}
class C3 extends P3{
    int c;
    C3(int c ,int a){
        super(a);
        this.c=c;
    }
    public void disp(){
        System.out.println("In class c3,a="+a+"c="+c);

    }
}
class p3c3main{
    public static void main(String s[]){
        C3 o2= new C3(20,60);
        // P3 o1=new P3(10,56);
        // o1.disp();
        o2.disp();

    }
}
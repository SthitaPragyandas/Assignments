interface I3
{
  void m1();
  void m2();
  int x=100;
}
interface I4
{
  void m1();
  //int m2();
  int x=200;
}
class C2 implements I3,I4
{
  public void m1()
  {
   System.out.println("m1 method of I3 and I4 implemented in Class C2");
   System.out.println("x value of I3,x= "+I3.x);
   System.out.println("x value of I4,x= "+I4.x);
  }
  public void m2()
  {
   System.out.println("m2 method of I3 implemented in Class C2");
  }
  
}
class C2Main
{
  public static void main(String s[])
  {
    C2 obj1=new C2();
    obj1.m1();
    obj1.m2();
      
  }
    
}

  
class InstanceOf
{
public static void main(String s[])
{ 
String s1 ="lucky";
System.out.println(s1 instanceof String);
System.out.println(s1 instanceof Object);
Object o1=new Object();
System.out.println(o1 instanceof Object);
System.out.println(o1 instanceof String);
}
}
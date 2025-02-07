class Box
{
  int bheight,bweight,bdepth,volume;
  Box( int height,int weight,int depth)
{
   bheight = height;
   bweight = weight;
   bdepth = depth;
}
public void disp()
{
System.out.println("height="+bheight+"weight="+bweight+"depth="+bdepth);
volume = bheight*bdepth*bweight;
System.out.println("volume of the Box = "+volume);
}
}
class main
{
public static void main (String s[])
{
Box b1=new Box(12,13,4);
b1.disp();
}
}
 class Box
 {
     int width ;
     int height;
     int depth;
     int volume;
     Box(int wd,int Ht,int Dt)
     {
     width =  wd;
     height = Ht;
     depth = Dt;
     int volume = (wd*Ht*Dt);
     }
      
 
      public void disp()
      {
         
         System.out.println(volume);
     
      }
 
 }
 class Boxmain
 {
 public static void main( String s[])
    {
      
     Box b1=new Box (2,3,4);
     b1.disp();
    }
 }    
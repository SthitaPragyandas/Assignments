import java.util.*;
abstract class Compartment{
    public abstract void  notice();
}
class FirstClass extends Compartment{
    public void  notice(){
        System.out.println("it is First class");

    }
}
class Ladies extends Compartment{
    public void  notice(){
        System.out.println("SecondClass  for ladies");

    }
}
class General extends Compartment{
    public void  notice(){
        System.out.println("ThirdClass  for General");

    }
}
class Luggage extends Compartment{
    public void  notice(){
        System.out.println("FourthClass  for luggage");

    }
}
class TestCompartment{
    public static void main(String s[]){
        Compartment c[]=new Compartment[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Put the number for the classes of Train ");
        int i=sc.nextInt();
        
            switch(i){
                case 1: 
                c[0] = new FirstClass();
		            c[0].notice();
		            break;
		
		case 2: 
        c[1] = new Ladies();
                            c[1].notice();
                            break;
        
		case 3:
         c[2] = new General();
                            c[2].notice();
                            break;
        
		case 4:
         c[3] = new Luggage();
                            c[3].notice();
                            break;
        
                default: System.out.println("Invalid");


            }
        


    }
}
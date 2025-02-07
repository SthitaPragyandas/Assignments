 class Patient
{
 String patientName;
 double height,weight;
Patient( String name , double weight, double height)
{
Patient Name = name;
this.weight = weight;
this.height = height;
}
public  void computeBMI()
{
System.out.println("patientName="+patientName + "height ="+height+"weight="+weight);
System.out.println("BMI="+(weight/(height*height)));
}
}
class main{
public static void main(String s[]){
Patient p1 = new Patient("L",12,5);
p1.computeBMI();
}
}
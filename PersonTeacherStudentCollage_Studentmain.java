class Person{
    String pname="Hagurf";
    String Dob="12/09/2000";
    public void P1disp(){
        System.out.println("Person name ="+pname+" person Dob="+Dob);
    }
 }
 class Teacher extends Person{
    String tsubject="MIL";
    int tsalary=20000;
    public void T1disp(){
        System.out.println("teacher of subject="+tsubject+" teacher salary="+tsalary);
    }
 }
 class Student extends Person{
    int sid=200;
    public void S1disp(){
        System.out.println("student id="+sid);
    }
 }
 class Collage_Student{
    String cname="GIETU";
    String Doj="12/03/2000";
    public void C1disp(){
        System.out.println("collage name="+cname+" collage doj="+Doj);
    }
      
 }
 class PersonTeacherStudentCollage_Studentmain{
    public static void main(String s[]){
        Person p1 = new Person();
        Teacher t1= new Teacher();
        Student s1 = new Student();
        Collage_Student c1= new Collage_Student();
        p1.P1disp();
        t1.T1disp();
        s1.S1disp();
        c1.C1disp();
        t1.P1disp();
        s1.P1disp();
    }

 }
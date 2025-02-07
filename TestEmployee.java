class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}
class Employee extends Person{
    double salary;
    String doj;
    String nin;
    Employee(String name,double salary,String doj,String nin){
        super(name);
        this.salary=salary;
        this.doj=doj;
        this.nin=nin;
        

    }
    public void disp(){
        System.out.println("emp name ="+name+"salary="+salary+"date of joining="+doj+"nin="+nin);
    }
    

}

class TestEmployee{
    public static void main (String s[]){
        Employee e1= new Employee("lucky",100000.90,"12-33-7990","20000");
        e1.disp();

    }
}
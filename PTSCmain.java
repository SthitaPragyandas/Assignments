class Person {
    String name;
    String dob;

    Person(String name, String dob) {
        this.name = name;
        this.dob = dob;

    }

}

class Teacher extends Person {
    double tsalary;
    String tsubject;

    Teacher(String name, String dob, double tsalary, String tsubject) {
        super(name, dob);
        this.tsalary = tsalary;
        this.tsubject = tsubject;
    }

    public void disp1() {
        System.out.println("teacher name =" + name + " person Dob=" + dob + "teacher  subject=" + tsubject
                + " teacher salary=" + tsalary);
    }
}

class Student extends Person {
    String sid;

    Student(String name, String dob, String sid) {
        super(name, dob);
        this.sid = sid;

    }

    public void disp2() {
        System.out.println("Student name =" + name + " person Dob = " + dob + " student id=" + sid);
    }

}

class Collage_Student extends Student {
    String cname;
    String yos;

    Collage_Student(String name, String dob, String sid, String yos, String cname) {
        super(sid, name, dob);
        this.cname = cname;
        this.yos = yos;
    }

    public void disp3() {
        System.out.println("Person name =" + name + " person Dob=" + dob + "student id=" + sid + "student yos=" + yos
                + "student collage name=" + cname);
    }

}

class PTSCmain {
    public static void main(String s[]) {
        // Person p1 = new Person("lucky", "12-09-2005");
        Teacher t1 = new Teacher("lucky", "12-09-2005", 299999, "MIL");
        Student s1 = new Student("lucky", "14-09-2005", "23cse676");
        Collage_Student c1 = new Collage_Student("nil", "13-08-2003", "123", "12-09-2000", "gietu");
        t1.disp1();
        s1.disp2();
        c1.disp3();

    }

}
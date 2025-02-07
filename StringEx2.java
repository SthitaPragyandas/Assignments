class StringEx2{
    public static void main (String s[]){
        String s1="Aditya";
        String s2="Aditya";
        System.out.println("s1 hashcode before concate="+ s1.hashCode());
        System.out.println("s2 hashcode before concate="+ s2.hashCode());
        s1=s1.concat("Das");
        s2=s2+"Das"; 
        // ***s1.hashCode();&s2+"Das" both not are complete step so we have to initilize the value of both s1 &s2 value. For concate we can write both the concate method***
        
        System.out.println("s1 hash code after concate="+s1.hashCode());
        System.out.println("s2 hash code after concat ="+s2.hashCode());
        String s3= new String("aditya");
        String s4=new String("aditya");
        System.out.println("s3 hashcode="+ s3.hashCode());
        System.out.println("s4 hashcode="+ s4.hashCode());
        System.out.println("s3 identity="+System.identityHashCode(s3));
        System.out.println("s4 identity="+System.identityHashCode(s4));


    }
}
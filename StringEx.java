class StringEx {
    public static void main(String s[]) {
        String s1 = "GVSN";
        String s2 = "GVSN";
        System.out.println(" s1= " + s1 + " s2= " + s2);
        System.out.println(" s1.adress= " + s1.hashCode() + " s2.adress= " + s2.hashCode());
        String s3 = new String("madhu");
        String s4 = new String("madhu");
         System.out.println("s3=" + s3 + "s4=" + s4);
        System.out.println("s3.adress= " + s3.hashCode() + " s4.adress= " + s4.hashCode());
        if(s1.equals(s2))
        System.out.println("s1 equals to s2");
        else
        System.out.println("s1 not equals to s2");
        if(s3.equals (s4))
        System.out.println("s3 equals to s4");
        else
        System.out.println("s3 not equals to  s4");
        if(s1==s2)
        System.out.println("s1==s2");
        else
        System.out.println("s1!=s2");
        if(s3==s4)
        System.out.println("s3==s4");
        else
        System.out.println("s3!=s4");

    }
}
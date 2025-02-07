
    public static void main (String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter i1 value:");
        int i1 = sc.nextInt();
        System.out.println("enter the value of i2:");
        int i2 = sc.nextInt();
        int i3 = (i1>i2) ? i1:i2;
        System.out.println(i3+"is bigger");
    }
    
}

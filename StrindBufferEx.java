public class StrindBufferEx {
    public static void main(String s[]){
        StringBuffer sb1=new StringBuffer("Aditya");
        System.out.println(" Before append value of sb1="+sb1);
        System.out.println(" Before append the capacity of sb1="+sb1.capacity());
        sb1.append("Dasabcdefghojklmnopqrst");
        System.out.println(" After append the value of sb1="+sb1);
        System.out.println(" After append the capacity of sb1="+sb1.capacity());
        System.out.println("insert h at the index  3 of sb1="+ sb1.insert(9,"h"));
        System.out.println("reverse the sb="+sb1.reverse());
        System.out.println("the character of the 9th index="+sb1.charAt(9));
        System.out.println("sb1 length="+sb1.length());

         
    }
    
}













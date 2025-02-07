abstract class GeneralBank{
    public  abstract void  getsavingsInterestrate();
    public abstract void getFixedDepositeInterestRate();
}
class ICICIBank extends GeneralBank{
    public void getsavingsInterestrate (){
        System.out.println("The saving rate in icici bank is 4%");

    }
    public void getFixedDepositeInterestRate(){
        System.out.println("The fixed rate in icici bank is 8.5%");
    }


}
class KotMBank extends GeneralBank{
    public void getsavingsInterestrate (){
        System.out.println("The saving rate in kotMbank is 6%");

    }
    public void getFixedDepositeInterestRate(){
        System.out.println("The fixed rate in kotMbank is 9%");
    }
    
}
class Bankmain{
    public static void main(String s[]){
        ICICIBank i = new ICICIBank();
        KotMBank k = new KotMBank();
        GeneralBank g1 = new ICICIBank();
        GeneralBank g2= new KotMBank();
        i.getsavingsInterestrate ();
        i.getFixedDepositeInterestRate();
        k.getsavingsInterestrate ();
        k.getFixedDepositeInterestRate();

    }
}
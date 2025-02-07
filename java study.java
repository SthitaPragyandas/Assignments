 
  class Dowhile {
      int i=1;
    public void disp1_10() {
         // Initialize i to 1
        do {
            System.out.println("i=" + i); // Corrected println statement
            i++;
        } while(i <= 10);
    }
}

// DoWhileMain.java
public class DoWhileMain {
    public static void main(String[] args) {
        Dowhile obj1 = new Dowhile();
        obj1.disp1_10();
    }
}

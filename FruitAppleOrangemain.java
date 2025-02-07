class Fruit {
    String fname;
    String ftaste;
    String fsize;

    Fruit(String fname, String ftaste, String fsize) {
        this.fname = fname;
        this.ftaste = ftaste;
        this.fsize = fsize;

    }

}

class Apple extends Fruit {

    Apple(String fname, String ftaste, String fsize) {
        super(fname, ftaste, fsize);

    }

    public void eat() {
        System.out.println("fruit name=" + fname + " fruit taste =" + ftaste + " fruit size=" + fsize);
    }

}

class Orange extends Fruit {

    Orange(String fname, String ftaste, String fsize) {
        super(fname, ftaste, fsize);

    }

    public void eat() {
        System.out.println("fruit name=" + fname + "  fruit taste =" + ftaste + "  fruit size=" + fsize);
    }

}

class FruitAppleOrangemain {
    public static void main(String s[]) {
        // Fruit f1 = new Fruit();
        Apple a1 = new Apple("Apple","sweet","small");
        Orange o1 = new Orange("orange","juicey","khaata");
        // f1.eat();
        a1.eat();
        o1.eat();
    }

}
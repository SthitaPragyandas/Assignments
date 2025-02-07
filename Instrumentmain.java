abstract class Instrument {
    public abstract void play();
}

class Piano extends Instrument {
    public void play() {
        System.out.println("piano plays sweet");
    }
}

class Flute extends Instrument {
    public void play() {
        System.out.println("Flute plays Fluently");
    }
}

class Guitar extends Instrument{
    public void play(){
        System.out.println("Guitar plays well");

    }
    
}
class Instrumentmain{
    public static void main (String s[]){
        Instrument arr[]= new Instrument[10];
        for(int i=0;i<arr.length;i++)
        arr[i].play();
    }
}
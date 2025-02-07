 class Animal{
    public void eat(){
        System.out.println("tiger eat meat:");
    }
    public void sleep(){
        System.out.println("tigers sleep at night:");
    }
 }
 class Bird extends Animal{
    public void eat(){
        System.out.println(" parrot eats fruits");
    }
    public void sleep(){
        System.out.println("owl sleeps at the day");
    }
    public void fly(){
        System.out.println("penguine can't fly");
    }
 }
 class AnimalBirdmain{
    public static void main(String s[]){
        Animal a1= new Animal();
        Bird b1 = new Bird();
        a1.eat();
        a1.sleep();
        b1.eat();
        b1.sleep();
        b1.fly();
    }
 }
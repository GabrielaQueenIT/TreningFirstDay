package animals;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Hau Hau");
        sayHello();
        System.out.println("Number of legs " +legs);
    }
}

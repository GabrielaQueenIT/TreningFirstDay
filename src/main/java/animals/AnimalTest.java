package animals;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sayHello();
        System.out.println("------------------------------");
        Animal cat = new Cat();
        cat.sayHello();
        cat.sound();
    }
}

//

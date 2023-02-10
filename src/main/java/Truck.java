public class Truck implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jazda jazda ciężarówka depcze Ci po piętach z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("STOP! Zachowaj odstęp od ciężarówki");
    }

    @Override
    public String info() {
        return "ciężarówka";
    }

    public void zatankuj() {
        System.out.println("Aby jechać dalej nie zapomnij zatankować!");
    }
}

public class Footballer extends Person{

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age); //super wywoła nam konstruktor Person najpierw i zainicjuje pola name i age
        this.footballClub = footballClub;
        System.out.println("Jestem w konstruktorze Footballer");
    }
    public void playFootball(){
        System.out.println("I am playing Football! for " + footballClub);
    }

    public void eat(){
        System.out.println("I love pizza very much, but I can't eat it very often");
    }

}



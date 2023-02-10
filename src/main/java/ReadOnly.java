public class ReadOnly {

    private String name = "Bartek";

    //Poniższa metoda będzie zwracała nam wartość pola private dla innych klas
    public String getName() {
        return name + "jest okej";
    }

    //poniższa metoda pozwala nam konfigurować imie przez inne klasy ale nie umożliwiamy działania na tym polu (nie będzie mógł go pobrać i na nim działać)

    public void setName(String name) {
        this.name = name;
    }
}

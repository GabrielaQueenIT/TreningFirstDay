public class FinalTest {
    public static void main(String[] args) {

        final int x = 10; //zmienej final nie da się zmienić
//        x=5;

        final Person person = new Person("Tom", 24);
        person.age = 23; //tu możemy zmienić imie i wiek ale nie możemy przypisać kolejnej osoby

//        person = new Person("Susan", 99); -> nie da się
//

        // jeśli zaznaczymy metodę jako final to nie będziemy mogli jej nadpisać w klasie dziecka
        // (nie da się nadpisać metody eat u Footballer bo jeśli on dziedziczy po person a w person zaznaczymy ją jako final to nie da się nadpisać
        // jeśli zaznaczymy klasę jako final to nie możemy po niej dziedziczyć!

    }
}

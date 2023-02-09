public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.uczelnia;
        System.out.println("-----------------");
        Student.infoUczelnia();
        System.out.println("-----------------");
        Student jacek = new Student();
        jacek.imie = "jacek";
        jacek.nazwisko = "Kos";
        jacek.email = "jacek.kos@gmail.com";
        jacek.numerIndeksu = 564534;
        jacek.nick = "jacko";
        String uczelniaJacka = jacek.uczelnia;
        jacek.infoUczelnia();



//        Student ania = new Student();
//        ania.imie = "Anna";
//        ania.nazwisko = "Adamska";
//        ania.email = "adamska@gmail.com";
//        ania.numerIndeksu = 564214;
//        ania.nick = "Anula";
//
//        Student piotr = new Student();
//        piotr.imie = "Piotr";
//        piotr.nazwisko = "Nowak";
//        piotr.email = "NowakP@gmail.com";
//        piotr.numerIndeksu = 564299;
//        piotr.nick = "Pioterro99";
//
//
//        Student[] students = new Student[3];
//        students[0] = piotr;
//        students[1] = ania;
//        students[2] = jacek;
//
//        for(int i=0; i<students.length; i++){
//            students[i].przedstawSie();
//            students[i].podajNrIndeksu();
//            students[i].zalogujSie();
//            students[i].podajEmail();
//        }
    }
}

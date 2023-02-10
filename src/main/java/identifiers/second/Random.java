package identifiers.second;

import identifiers.first.Parent;

public class Random {
    public void testIdentifier() {

        //klasa w tej innej paczce nie ma dostępu do pól/metod private, default i protected
        Parent parent = new Parent();


        System.out.println(parent.first);
        parent.firstMethod();
    }
}

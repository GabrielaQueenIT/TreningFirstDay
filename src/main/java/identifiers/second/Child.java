package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    public void testIdentifier() {

        //klasa potomna w tej innej paczce nie ma dostępu do pól/metod private i default(pacage)-czyli bez identyfikatora

        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}

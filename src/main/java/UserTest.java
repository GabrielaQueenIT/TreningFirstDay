public class UserTest {

    public static void main(String[] args) {
//        User user = new User();
        User user = new User("Tomasz", "HEJDKSDC");

        System.out.println(user.username);
        System.out.println(user.password);

//        user.username = "Bartek";
//        user.password = "TFGD1H3WJ34S4644";
        user.sayHello();
    }
}

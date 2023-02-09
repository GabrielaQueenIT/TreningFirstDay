public class User {

    public String username;
    public String password;

    public User(String username, String password) {
        System.out.println("Cześć jestem konstruktor");
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public void sayHello(){
        System.out.println("Hello my name is " + username);
    }


}

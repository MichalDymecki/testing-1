public class UserTest {

    public static void main(String[] args) {

        User user = new User();
        User user2 = new User ("hello", "mich");

        user.username = "Michał";
        user.password = "Password";
        user.sayHello();
    }
}

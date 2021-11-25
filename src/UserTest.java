public class UserTest {

    public static void main(String[] args) {

        User user = new User();
        User user2 = new User ("Michal", "hello");

/*        user.username = "Michał";
        user.password = "Password";*/
        System.out.println(user2.username);
        System.out.println(user2.password);
        user2.sayHello();
    }
}

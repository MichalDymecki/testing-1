public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom",27,"University");

        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.techMath();

        Footballer footballer = new Footballer("Mike",29,"Jagnie Jagnięciny");

        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}

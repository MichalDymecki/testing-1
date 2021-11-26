public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("Jestem w konstruktorze mathteacher");
    }

    public void techMath(){
        System.out.println("I am teaching math at school");
    }

    public void sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age + " years old.");
    }
}

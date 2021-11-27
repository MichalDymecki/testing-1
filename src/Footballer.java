public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub){
        super(name, age);
        this.footballClub = footballClub;
        System.out.println("Jestem w konstruktorze footballer");
    }

    public void playFootball(){
        System.out.println("I am playing football for " +footballClub );
        walk();
    }

    public void eat(){
        System.out.println("As footballer I have to eat healthy food.");
    }

}

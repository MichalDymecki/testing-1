public class StudentChecker {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();


        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Adamski";
        adam.nick = "adamA";
        adam.email= "adama@email.com";
        adam.numerIndeksu = 2659;
        String uczelniaAdama = adam.nazwaUczelni;
        adam.infoUczelnia();


        Student ewa = new Student();
        ewa.imie = "Ewa";
        ewa.nazwisko = "Ewamska";
        ewa.nick = "ewaE";
        ewa.email= "ewae@email.com";
        ewa.numerIndeksu = 2893;

        ewa.wydrukDanych();

        Student zdzisiek = new Student();
        zdzisiek.imie = "Zdzisław";
        zdzisiek.nazwisko = "Zdzisielski";
        zdzisiek.nick = "zdzislawZ";
        zdzisiek.email= "zdzislaw@email.com";
        zdzisiek.numerIndeksu = 3009;

        Student[] studenci = new Student[3];
        studenci[0] = adam;
        studenci[1] = ewa;
        studenci[2] = zdzisiek;

        for (int i =0; i < studenci.length; i++){
            studenci[i].przedstawSie();
            studenci[i].podajEmail();
            studenci[i].podajNumerIndeksu();
            studenci[i].zalogujSie();
            System.out.println();
        }


    }
}

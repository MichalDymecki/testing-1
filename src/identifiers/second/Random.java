package identifiers.second;

import identifiers.first.Parent;

public class Random {
    public void testIdentifiers(){

//      klasa w innej paczce nie ma dostępu do pól/metod private oraz default (bez identyfikatora) oraz protected

        Parent parent = new Parent();

        System.out.println(parent.first);
//        System.out.println(parent.second);
//        System.out.println(parent.third);
//        System.out.println(parent.fourth);
        parent.firstMethod();
//        parent.secondMethod();
//        parent.thirdMethod();
//        parent.fourthMethod();
    }
}

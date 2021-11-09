public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);
        System.out.println(secondValue && thirdValue);

        // || lub -> true gdy jedno wyrażenie składowe jest równe true

        System.out.println(firstValue || secondValue); // ture
        System.out.println(secondValue || thirdValue); // false

        // ! - negacja - zwraca wartość przeciwną do wyrażenia ,przed którym się znajduje
        System.out.println(!firstValue);
        System.out.println(!(firstValue&&secondValue));

    }
}

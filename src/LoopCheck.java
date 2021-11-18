public class LoopCheck {
    public static void main(String[] args) {

        for(int i=1; i < 100; i++ ){
            if (i % 3 == 0){
                System.out.println(i);}
            }

        int[] array1 =  new int[] {1, 3, 5, 7, 4};

        int i = (array1.length - 1);
        int[] array2 = new int[array1.length];

        int j = 0;

        while (i >= 0){
              array2[j] = array1[i];
            System.out.println(array2[j]);
            System.out.println("iteracja numer: "+ j);
              j++;
              i--;
        }
    }
}

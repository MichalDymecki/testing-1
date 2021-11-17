public class LoopCheck {
    public static void main(String[] args) {

//        for(int i=1; i < 100; i++ ){
//            if (i % 3 == 0){
//                System.out.println(i);}
//            }

        int[] array1 =  new int[] {1, 3, 5};
        int[] array2 = new int[3];

        int i = (array1.length - 1);
        int j = 0;

        while (i >= 0){
//            System.out.println(array1[i]);
//            i++;
              array2[j] = array1[i];
            System.out.println(array2[j]);
              j++;
              i--;
        }



    }
}

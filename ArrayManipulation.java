import java.util.Arrays;

public class ArrayManipulation {

   
    public static int[] reverseArray(int[] arr) {

        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
         }
         return arr;
         // Liefert Array
    }
    public static void main(String[] args) {
       
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
        System.out.println("Hello");
        System.out.println("Hello2");
    }
    public static int[] squareEach(int[] arr){
        int[] back = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            back[i] = arr[i] * arr[i];
        }
        return back;
    }
}

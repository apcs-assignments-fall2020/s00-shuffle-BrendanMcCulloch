import java.util.Arrays;

public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int perfectshuffle[] = new int[arr.length];
        int brendan = arr.length / 2;

        
        int[] j = new int[brendan];
        for (int i = 0; i < brendan; i++){
            j[i] = arr[i];
        }
        int[] c = new int[brendan];
        for (int i = 0; i < brendan; i++){
            c[i] = arr[i + brendan];
        }

        for (int i = 0; i < arr.length; i++){
            if(i%2 == 0) {
                perfectshuffle[i] = j[i/2];
            }
            else{
                perfectshuffle[i] = c[i/2];
            }
                
            

        } 
        return perfectshuffle;

    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        for (int i = 0; i < arr.length; i++){
            int random = (int) (Math.random() * 10);
            int cards = arr[i];
            arr[i] = arr[random];
            arr[random] = cards;

        }
        return arr;
    } 


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        System.out.println(Arrays.toString(perfectShuffle(arr)));
        System.out.println(Arrays.toString(selectionShuffle(arr)));

    }
}

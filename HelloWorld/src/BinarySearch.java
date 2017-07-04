import java.util.Arrays;

import static java.lang.Math.ceil;

/**
 * Created by nguyeti on 04/07/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1,23,125,2,3};
        Arrays.sort(a);
        for(int i : a) {
            System.out.println(i);
        }
        System.out.println("element is at index " + binarySearch(a, 3));
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int index = 0;

        while(high >= low) {
            int middle = Math.round((high + low) / 2);
            //System.out.println(middle);
            if (key == array[middle]) {
                return middle;
            }
            if (key < array[middle]) {
                high = middle - 1;
            }
            if (key > array[middle]) {
                low = middle + 1;
            }
        }
        return 0;
    }
}

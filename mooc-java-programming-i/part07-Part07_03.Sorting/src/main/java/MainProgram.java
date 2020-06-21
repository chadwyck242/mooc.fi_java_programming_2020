
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {55, 11, 1, 99, 3, 12, 1, 8, 33, 2};
        int[] array2 = {-1, 3, 1, 2};
        int[] array3 = {8, 3, 7, 9, 1, 2, 4};
        int mostSmallest = smallest(array);
        int indexSmallest = indexOfSmallest(array);
        int indexFrom = indexOfSmallestFrom(array2, 0);
        System.out.println("Smallest value in array: " + mostSmallest);
        System.out.println("Index of smallest value in array: " + indexSmallest);
        System.out.println("Index of smallest from start index: " + indexFrom);
        MainProgram.swap(array, 1, 4);
        System.out.println(Arrays.toString(array));
        MainProgram.sort(array3);

    }

    // Returns the smallest value of an array
    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    // Gives the index of the smalles value in an array
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    // Returns index of the smallest from given start location: 
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        int smallest = array[index];

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    // Swap method: swap two values of the given indices
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Sort method: sort an array from smallest value to largest value
    // Uses some of the methods written above
    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));

        while (index < array.length) {
            
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            
            index += 1;
        }

    }

}

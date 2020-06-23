
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        // array of integers
        int[] array = {3, 1, 5, 99, 3, 12};
        // array of strings
        String[] stringArray = {"bobbity", "fobbity", "ribbity", "hobbity", "skip"};
        // ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(-4);
        numbers.add(2);
        numbers.add(9);
        // ArrayList of strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("x");
        strings.add("i");
        strings.add("k");
        strings.add("y");
        strings.add("j");
        strings.add("z");
        

        // Use sort method defined below to sort an 
        // array of integers
        System.out.println("Array of integers");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");

        // Another sort method for sorting strings
        System.out.println("Array of strings");
        System.out.println(Arrays.toString(stringArray));
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        System.out.println("");
        
        // Use method to sort an ArrayList of numbers
        System.out.println("ArrayList of numbers");
        System.out.println(numbers);
        sortIntegers(numbers);
        System.out.println(numbers);
        System.out.println("");
        
        // Another method to sort an ArrayList of strings
        System.out.println("ArrayList of strings");
        System.out.println(strings);
        sortStrings(strings);
        System.out.println(strings);
        System.out.println("");

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> numbers){
        Collections.sort(numbers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
    
    

}

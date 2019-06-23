import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava {

    // Print the sum of all numbers in the array.
    // Also have the function return an array that only includes numbers that are
    // greater than 10
    public void sumAndTen(int[] arr) {
        ArrayList<Integer> greaterThan = new ArrayList<Integer>();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                greaterThan.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(greaterThan);

    }

    // Shuffle the array and print the name of each person.
    // Have the method also return an array with names that are longer than 5
    // characters.
    public void shuffleNames(String[] arr) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> five = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                five.add(arr[i]);
            }
            names.add(arr[i]);
        }
        Collections.shuffle(names);
        System.out.println(names);
        System.out.print(five);
    }

    public void shuffleAlpha() {
        ArrayList<String> alpha = new ArrayList<String>();
        for (char c = 'a'; c <= 'z'; c++) {
            alpha.add(Character.toString(c));
        }
        Collections.shuffle(alpha);
        System.out.println("\nFirst letter is: " + alpha.get(0));
        System.out.println("Last letter is: " + alpha.get(25));
        String first = alpha.get(0);
        if ( "aeiouAEIOU".indexOf(first) >= 0 ) {
            System.out.println("The first letter is a vowel!");
        }
    }
    public int[] random55To100(){
        int[] array = new int[10];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){            
            array[i] = rand.nextInt(45) + 55;
        
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
// Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
     public int[] sorted55To100(){            
        int[] array = random55To100(); //this will print out the new random 10
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); //this will print out the sorted array
        System.out.println("The minimum is: "+array[0]);
        System.out.println("The maximum is: "+array[9]);
        return array;
    }
    public String randomString(){
        String word = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 5; i++){
            Random random = new Random();
            int x = random.nextInt(25) + 1;
            word += alpha.charAt(x);
        }
        System.out.println(word);
        return word;
    }
    public void randomFiveString(){
        ArrayList<String> array = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            String x = randomString();
            array.add(x);
        }
    }
}
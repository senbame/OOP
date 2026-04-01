package lab3.Question5;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Chocolate
        Chocolate[] chocs = {
            new Chocolate("Twix",     58),
            new Chocolate("KitKat",   45),
            new Chocolate("Snickers", 52.7),
            new Chocolate("Bounty",   57)
        };
        Sort.bubbleSort(chocs);
        System.out.println("Chocolates (bubble): " + Arrays.toString(chocs));

        // Time
        Time[] times = {
            new Time(14, 30,  0),
            new Time( 9,  0,  0),
            new Time(23, 59, 59),
            new Time( 0,  0,  1)
        };
        Sort.mergeSort(times);
        System.out.println("Times (merge):       " + Arrays.toString(times));
        
        // Integers
        Integer[] nums = { 5, 3, 8, 1, 9, 2 };
        Sort.mergeSort(nums);
        System.out.println("Integers (merge):    " + Arrays.toString(nums));
    }
}
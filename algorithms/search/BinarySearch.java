package algorithms.search;

public class BinarySearch {
    public static void main(String[] args) {

        /* For Binary Search data must be sorted, it chooses the element in the middle of the array and compares
         it against search value and then proceeds to repeat the process with the left or right half depending on result
         the time complexity is O (logn) - it keeps diving the array in half - it can also be done using iteration or recursion*/
        
         int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

         System.out.println(iterativeBinarySearch(intArray, 7));
         System.out.println(iterativeBinarySearch(intArray,27));
         System.out.println(recursiveBinarySearch(intArray, 6));
         System.out.println(recursiveBinarySearch(intArray, -15));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value) {
                return midpoint;
            }
            else if (input[midpoint] < value){
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        System.out.println("midpoint = " + midpoint);

        if (input[midpoint] == value) {
            return midpoint;
        }
        else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}

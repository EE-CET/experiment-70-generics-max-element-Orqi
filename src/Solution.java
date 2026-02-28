import java.util.Scanner;

public class Solution {
    
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Integer[] intArray = new Integer[N];
        for (int i = 0; i < N; i++) {
            intArray[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        String[] strArray = new String[M];
        for (int i = 0; i < M; i++) {
            strArray[i] = scanner.next();
        }

        System.out.println("Max Integer: " + findMax(intArray));
        System.out.println("Max String: " + findMax(strArray));

        scanner.close();
    }
}
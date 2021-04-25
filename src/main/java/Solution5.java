import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
    private static int max = 0;

    public static void generateMass(int num){
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        System.out.println("С генерированный массив: " + Arrays.toString(arr));
        findMaxAndMinElementInAnArray(arr);
    }

    public static void findMaxAndMinElementInAnArray(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            } else if (min >= j) {
                min = j;
            }
        }
            System.out.println("Максимальный элемент в массиве: " + max);
            System.out.println("Минимальный элемент в массиве: " + min);
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введте целое число для генерации массива : ");
        int num = in.nextInt();
        generateMass(num);

    }

}
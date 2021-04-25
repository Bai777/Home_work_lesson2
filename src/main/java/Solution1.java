import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
    public static void generateMass(int num){
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int)(Math.random() * 2);
        }
        System.out.println("С генерированный массив: " + Arrays.toString(arr));
        changeTheArray(arr);
    }

    public static void changeTheArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;
            }
            else{arr[i] = 1;}
        }
        System.out.print("Массив в котором заменены 0 на 1, 1 на 0:  " + Arrays.toString(arr));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введте целое число для генерации массива : ");
        int num = in.nextInt();
        generateMass(num);
    }
}

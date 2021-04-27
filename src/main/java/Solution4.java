

public class Solution4 {

    private static final int[][] arr = new int[4][4];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i == j){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        print2dArray(makeDiagonalArray(6, 1));

    }

    static int[][] makeDiagonalArray(int size, int value){
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = value;
            arr[i][arr.length - 1 - i] = value;
        }
        return arr;
    }

    static void print2dArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}


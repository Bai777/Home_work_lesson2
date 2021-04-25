

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
    }
}


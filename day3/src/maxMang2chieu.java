import java.util.Arrays;
import java.util.Scanner;

public class maxMang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước ma trận bạn muốn : ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhập phần tử của mảng 2 chiều");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int max = maxOfMatrix(matrix);
        System.out.println("Max của mảng 2 chiều là : " + max);
    }

    public static int maxOfMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}

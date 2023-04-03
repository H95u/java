import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[2];
        int[] arr3;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 1");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 2 ");
            arr2[i] = scanner.nextInt();
        }
        arr3 = concatArr(arr1,arr2);
        System.out.println("Mảng gộp là : " + Arrays.toString(arr3));
    }

    public static int[] concatArr(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        return newArr;
    }
}

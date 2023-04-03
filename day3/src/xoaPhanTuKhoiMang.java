import java.util.Arrays;
import java.util.Scanner;

public class xoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 4, 5, 6, 7, 9};
        int index = 0;
        System.out.println("Nhập số bạn muốn xóa khỏi mảng :");
        int X = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (X == arr[i]) {
                index = i;
            }
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}

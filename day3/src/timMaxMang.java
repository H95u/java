import java.util.Arrays;
import java.util.Scanner;

public class timMaxMang {
    public static void main(String[] args) {
        int[] arr ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng !");
        int size = scanner.nextInt();
        int i = 0;
        arr = new int[size];
        while (i < size){
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println("Max của mảng " + Arrays.toString(arr)+" là " + max);
    }
}

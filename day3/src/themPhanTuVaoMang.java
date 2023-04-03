import java.util.Arrays;
import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 5};
        System.out.println("Nhập phần tử bạn muốn thêm vào");
        int X = scanner.nextInt();
        System.out.println("Nhập index mà bạn muốn thêm vào ");
        int index = scanner.nextInt();
        if (index < 0 || index > arr.length) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
           arr = insertElement(arr,index,X);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertElement(int[] arr, int index, int X) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = X;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}

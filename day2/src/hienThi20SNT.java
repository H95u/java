import java.util.Scanner;

public class hienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng SNT bạn muốn hiển thị !");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N) ; i++) {
                if (N % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

    }
}

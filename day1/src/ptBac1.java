import java.util.Scanner;

public class ptBac1 {
    public static void main(String[] args) {
        System.out.println("Giải pt bậc 1:");
        System.out.println("Xin mời nhập các hệ số a ,b ,c cho pt bậc 1:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();

        if( a != 0) {
            double result = ( c- b ) / a;
            System.out.println("Nghiệm của pt bậc 1 là : " + result);
        } else {
            if ( b == c) {
                System.out.println(" PT vô số nghiệm !");
            } else {
                System.out.println(" PT vô nghiệm !");
            }
        }
    }
}

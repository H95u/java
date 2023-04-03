

import java.util.Scanner;

public class PtBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a :");
        double a = scanner.nextDouble();
        if (a != 0) {
            System.out.println("Nhập hệ số b : ");
            double b = scanner.nextDouble();
            System.out.println("Nhập hệ số c :");
            double c = scanner.nextDouble();
            double delta = Math.pow(b, 2) - 4 * a * c;
            double x;
            double x1;
            if (delta < 0) {
                System.out.println("Pt vô nghiệm");
            } else if (delta == 0) {
                x = -b / 2 * a;
                System.out.println("Pt có nghiệm kép x = " + x);
            } else {
                x = (-b + Math.sqrt(delta)) / 2 * a;
                x1 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("Pt có nghiệm kép x1 = " + x);
                System.out.println(" x2 = " + x1);
            }
        }else {
            System.out.println("Bạn nhập sai !");
        }
    }
}

import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Độ F sang độ C");
            System.out.println("2. Độ C sang độ F");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn :");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("nhập vào độ F :");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit + " độ F = " + fToC(fahrenheit) + " độ C");
                    break;
                case 2:
                    System.out.println("Nhập vào độ C : ");
                    celcius = scanner.nextDouble();
                    System.out.println(celcius + " độ C = " + cToF(celcius) + " độ F");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double cToF(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fToC(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

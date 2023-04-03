import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền : ");
        double inputAmount = scanner.nextInt();
        double result;
        System.out.println("Bạn muốn chuyển từ ( USD hay VND ) ?");
        String currency = scanner.next();
        if (currency.equalsIgnoreCase("USD")) {
            result = inputAmount * 23000;
            System.out.println(inputAmount + "$ = " + result + "vnd");
        } else if (currency.equalsIgnoreCase("VND")) {
            result = inputAmount / 23000;
            System.out.println(inputAmount + "VND = " + result + "$");
        } else {
            System.out.println("Bạn nhập sai !");
        }
    }
}

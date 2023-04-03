import java.util.Scanner;

public class tinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn gửi : ");
        double money = scanner.nextDouble();
        System.out.println("Nhập số tháng bạn muốn gửi :");
        int month = scanner.nextInt();
        System.out.println("Nhập tỉ lệ phần trăm lãi suất ( % ) : ");
        double rate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (rate/100)/12 * month;
        }
        System.out.println("Số tiền lãi của bạn là " + totalInterest);
    }
}

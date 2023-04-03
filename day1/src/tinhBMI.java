import java.util.Scanner;

public class tinhBMI {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao ( m ) : ");
        double height = scanner.nextDouble();
        System.out.println("Nhập vào cân nặng ( kg ) :");
        double weight = scanner.nextDouble();
        double bmi = weight / Math.pow(height,2);
        if (bmi < 18.5){
            System.out.println("Quá nhẹ");
        } else if (bmi <25) {
            System.out.println("Bình thường");
        } else if (bmi < 30) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }
    }
}

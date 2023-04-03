import java.util.Scanner;

public class kiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra :");
        int inputNum = scanner.nextInt();
        if (inputNum < 2){
            System.out.println(inputNum + " không phải là SNT !");
        }else {
            int i = 2;
            boolean check = true;
            while ( i <= Math.sqrt(inputNum)){
                if (inputNum % i == 0 ){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(inputNum + " là SNT !");
            else
                System.out.println(inputNum + " không phải là SNT !");
        }
    }
}

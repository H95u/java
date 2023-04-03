import java.util.Scanner;

public class timGtTrongMang {
    public static void main(String[] args) {
        String[] students = {"Hieu", "Lam", "Duong", "Minh"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String inputName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                check = true;
            }
        }
        if (check) {
            System.out.println(inputName + " có trong mảng " );
        } else {
            System.out.println(inputName +" không có trong mảng");
        }
    }
}

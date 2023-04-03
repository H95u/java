import java.util.Scanner;

public class docSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần đọc : ");
        int inputNum = scanner.nextInt();
        if (inputNum >= 0 && inputNum < 20) {
            switch (inputNum) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirdteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eightteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (inputNum < 100){
            int tens = inputNum / 10;
            int ones = inputNum % 10;
            switch (tens) {
                case 2:
                    System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirty");
                    break;
                case 4:
                    System.out.println("Forty");
                    break;
                case 5:
                    System.out.println("Fifty");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eighty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;
            }
            if (ones !=0){
                System.out.println(convertToWords(ones));
            }
        } else {
            int hundreds = inputNum / 100;
            int remainder = inputNum % 100;
            String words = convertToWords(hundreds) + " hundreds";
            if ( remainder != 0 ){
                words = words + " and " + convertToWords(remainder);
            }
            System.out.println(words);
        }
    }

    public static String convertToWords(int num) {
        String words = "";
        switch (num) {
            case 1:
                words = "one";
                break;
            case 2:
                words = "two";
                break;
            case 3:
                words = "three";
                break;
            case 4:
                words = "four";
                break;
            case 5:
                words = "five";
                break;
            case 6:
                words = "six";
                break;
            case 7:
                words = "seven";
                break;
            case 8:
                words = "eight";
                break;
            case 9:
                words = "nine";
                break;
        }
        return words;
    }
}





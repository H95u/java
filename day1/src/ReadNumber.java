import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bạn muốn đọc : ");
        int inputNum = scanner.nextInt();
        String words = "";
        if (0 <= inputNum && inputNum < 20) {
            switch (inputNum) {
                case 0:
                    words = "Zero";
                    break;
                case 1:
                    words = "One";
                    break;
                case 2:
                    words = "Two";
                    break;
                case 3:
                    words = "Three";
                    break;
                case 4:
                    words = "Four";
                    break;
                case 5:
                    words = "Five";
                    break;
                case 6:
                    words = "Six";
                    break;
                case 7:
                    words = "Seven";
                    break;
                case 8:
                    words = "Eight";
                    break;
                case 9:
                    words = "Nine";
                    break;
                case 10:
                    words = "Ten";
                    break;
                case 11:
                    words = "Eleven";
                    break;
                case 12:
                    words = "Twelve";
                    break;
                case 13:
                    words = "Thirdteen";
                    break;
                case 14:
                    words = "Fourteen";
                    break;
                case 15:
                    words = "Fifteen";
                    break;
                case 16:
                    words = "Sixteen";
                    break;
                case 17:
                    words = "Seventeen";
                    break;
                case 18:
                    words = "Eightteen";
                    break;
                case 19:
                    words = "Nineteen";
                    break;
            }
            System.out.println(words);
        } else if (inputNum < 100) {
            int tens = inputNum / 10;
            int ones = inputNum % 10;
            switch (tens) {
                case 2:
                    words = "Twenty";
                    break;
                case 3:
                    words = "Thirty";
                    break;
                case 4:
                    words = "Forty";
                    break;
                case 5:
                    words = "Fifty";
                    break;
                case 6:
                    words = "Sixty";
                    break;
                case 7:
                    words = "Seventy";
                    break;
                case 8:
                    words = "Eighty";
                    break;
                case 9:
                    words = "Ninety";
                    break;
            }
            System.out.println(words + " " + convertToWords(ones));
        } else if (inputNum < 1000) {
            int hundreds = inputNum / 100;
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

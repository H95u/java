import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to read: ");
        int num = scanner.nextInt();
        String words = "";

        if (num < 0 || num > 999) {
            words = "Out of ability";
        } else if (num < 10) {
            switch (num) {
                case 0:
                    words = "zero";
                    break;
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
        } else if (num < 20) {
            switch (num) {
                case 10:
                    words = "ten";
                    break;
                case 11:
                    words = "eleven";
                    break;
                case 12:
                    words = "twelve";
                    break;
                case 13:
                    words = "thirteen";
                    break;
                case 14:
                    words = "fourteen";
                    break;
                case 15:
                    words = "fifteen";
                    break;
                case 16:
                    words = "sixteen";
                    break;
                case 17:
                    words = "seventeen";
                    break;
                case 18:
                    words = "eighteen";
                    break;
                case 19:
                    words = "nineteen";
                    break;
            }
        } else if (num < 100) {
            int tens = num / 10;
            int ones = num % 10;
            switch (tens) {
                case 2:
                    words = "twenty";
                    break;
                case 3:
                    words = "thirty";
                    break;
                case 4:
                    words = "forty";
                    break;
                case 5:
                    words = "fifty";
                    break;
                case 6:
                    words = "sixty";
                    break;
                case 7:
                    words = "seventy";
                    break;
                case 8:
                    words = "eighty";
                    break;
                case 9:
                    words = "ninety";
                    break;
            }
            if (ones != 0) {
                words = words + " " + convertToWords(ones);
            }
        } else {
            int hundreds = num / 100;
            int remainder = num % 100;
            words = convertToWords(hundreds) + " hundred";
            if (remainder != 0) {
                words = words + " and " + convertToWords(remainder);
            }
        }
        System.out.println(words);
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

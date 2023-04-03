import java.util.Scanner;
import java.util.*;



public class maxdayso {

    public static void main(String args[]) {
        int count, max, i;
        int[] inputArray = new int[500];
   
        Scanner in = new Scanner(System.in);
   
        System.out.println("nhap so luong phan tu cua chuoi");
        count = in.nextInt();
        System.out.println("nhap"+" " + count +" "+ "phan tu cua chuoi");
        for (i=0;i<count;i++){
            inputArray[i]= in.nextInt();
        }
        max = inputArray[0];
        for(i=1;i<count;i++){
            if(inputArray[i]>max)
            max=inputArray[i];
            else 
            max=inputArray[0];
        }
        System.out.println("max cua chuoi la"+ " "+ max);
    }}
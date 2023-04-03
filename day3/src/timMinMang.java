public class timMinMang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = minValue(arr);
        System.out.println("Min của mảng là " + arr[index]);
    }
    public static int minValue(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}

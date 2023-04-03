public class getMax {


public static void main(String[] args) {
    public int getMax(ArrayList list){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<list.size(); i++){
        if(list.get(i) > max){
            max = list.get(i);
        }
    }
    return max;
}
    
}

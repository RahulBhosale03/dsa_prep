package arrays;

public class Smallest_Element {
    public static void main(String[] args) {
        int arr[]= {2,4,1,5,3,7,9,8,11,10};
        int min = arr[0];
        int n = arr.length;

        for(int i=1;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

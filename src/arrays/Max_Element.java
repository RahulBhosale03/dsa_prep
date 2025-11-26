package arrays;

public class Max_Element {
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,3,7,9,8,11,10};
        int n = arr.length;
        int max = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

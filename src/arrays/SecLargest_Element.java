package arrays;

public class SecLargest_Element {
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,3,7,9,8,11,10};
        int max = arr[0];
        int secLargest = -1;
        int n = arr.length;

        for(int i=1;i<n;i++){
            if(arr[i] > max){
                secLargest = max;
                max=arr[i];
            } else if (arr[i] < max && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
    }
}

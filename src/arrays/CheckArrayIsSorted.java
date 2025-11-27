package arrays;

public class CheckArrayIsSorted {

    public static boolean isSorted(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,3,7,9,8,11,10};
        int n = arr.length;
        System.out.println("The Sorted array is : "+isSorted(arr,n));
    }
}

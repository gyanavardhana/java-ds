/*
 * in this java program we are going to reverse an array
 * we are going to reverse this array using swapping
 * we are going to swap first elemt with last elemt
 * and so on untill the list is reversed.
 */
public class reversearray {
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,67,7,8,8,9};
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
        }
      }
}

/*
 * in this java program we are going to find minimum element using binary search in a sorted and rotated array
 * we are going to use binary search based on the rotated part of the array and sorted part of the array,
 * we are going to implement half part of binary search.
 */
public class minelesorrot {
    public static void main(String[]args){
        int a[] = {14, 15, 20, 22, 3, 5, 7, 9, 11};
        System.out.println(min1(a));
    }
    public static int min1(int arr[]){
        int left=0;
        int right=arr.length -1;
        
        while(left < right){
            int mid=(left + right)/2;
            if(arr[mid] < arr[right]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return arr[left];
    }
}

/*
 * in this program we are going to search the element or target
 * we will search in the sorted and rotated array
 * we are going to do this by finding the partitions of array
 * and performing 2 binarysearches in two partiotions
 */
public class searchsortedarrya {
    
    public static void main(String[]args){
        int a[] = {14, 15, 20, 22, 3, 5, 7, 9, 11};
        int m = min1(a);
        int j = bins(a, 0, m-1, 3);
        if(j==-1){
            j=bins(a, m, a.length-1, 3);
        }
        System.out.println(m+" "+j);
    }
    public static int bins(int arr[], int left, int right, int target){
        while(left<=right){
            int mid=(left + right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
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
        return  left;
    }
}

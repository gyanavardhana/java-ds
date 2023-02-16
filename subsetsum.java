/*
 * in this java program we are going to print subset whose sum is equal to the target.
 * we are going reduce the target step by step.
 * we are going to print the subset if the target==0 as we are subtrating the arr[i]
 * so that the program runs 2^n times.
 * this is a less complexive to get the subsets of the array.
 */
import java.util.ArrayList;
public class subsetsum {
    public static void main(String [] args){
        int[] arr = {1,2,7,8,9,3};
        all1(arr, 0,9, new ArrayList<Integer>());
    }
    public static void all1(int[] arr,int i, int target ,ArrayList<Integer> ans ){
        if(i==arr.length){
            if(target==0){
                System.out.println(ans);
            }
            return; 
        }
        ans.add(arr[i]);
        all1(arr, i+1, target-arr[i], ans);
        ans.remove(ans.size()-1);

        all1(arr, i+1, target, ans);
    }
}

import java.util.ArrayList;
/*
 * in this java program we are going to recursive function to print or gain all subsets of an array.
 * by this we can all print the subsets of array and occasionaly we can perform target sum by providing the
 * target and making some changes as we are going to do in the next program.
 */
public class allsub {
    public static void main(String [] args){
        int[] arr = {1,2,7,8,9,3};
        all(arr, 0,0, new ArrayList<Integer>());
    }
    public static void all(int[] arr,int i, int target ,ArrayList<Integer> ans ){
        if(i==arr.length){
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        all(arr, i+1, target-arr[i], ans);
        ans.remove(ans.size()-1);

        all(arr, i+1, target, ans);
    }
}

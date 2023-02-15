import java.util.ArrayList;
/*
 * in this java program we are going to learn how to print the permutations of the array.
 * we are going to print the permutations of the array using the recursive function .
 * so that , the function is called itself in the same function , and this is known as recursive function.
 * because of using recursive function the code complexity increases but effeciency also increases.
 */
public class permu {
    public static void main(String [] args){
        int[] arr = {1,2,3};
        per(arr, 0, new boolean[arr.length], new ArrayList<Integer>());
    }
    public static void per(int[] arr, int pos, boolean[] select, ArrayList<Integer> ans){
        if(pos==arr.length){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(select[i]==false){
                select[i]=true;
                ans.add(arr[i]);
                per(arr, pos+1, select, ans);
                select[i]=false;
                ans.remove(ans.size()-1);
            }
        }
    }
}

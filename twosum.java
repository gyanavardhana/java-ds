import java.util.HashMap;
/*
 * this is a java program to implement hashmamp and find out the 2 numbers in the array
 * whose sum is equal to the target .
 * the map is similar to the dictionary in python.
 */
public class twosum {
    public static void main(String[]args){
        int arr[] = {11,3,7,9,14,2};
        int target = 17;
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int sno = target - arr[i];
            if(map.containsKey(sno)){
                ans[0] = map.get(sno);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}

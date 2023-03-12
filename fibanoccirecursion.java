
/*
 * in this java program we are going to learn about dynamic programming ,at first we are going to print
 * the nth fibanocci numbers by using recursion.and we are going to optimize the recursion code of the 
 * fibanocci by using memorization that is using another storage array.
 * and now we are going to use tabulation instead of memorization i.e nothing but bottom up approach.
 */
public class fibanoccirecursion {
    public static int fb(int n){
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<dp.length; i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];
    }
    public static void main(String [] args){
        int n=10;
        System.out.println(fb(n));
    }
}

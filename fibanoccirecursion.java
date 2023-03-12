
/*
 * in this java program we are going to learn about dynamic programming ,at first we are going to print
 * the nth fibanocci numbers by using recursion.and we are going to optimize the recursion code of the 
 * fibanocci by using memorization that is using another storage array.
 */
public class fibanoccirecursion {
    public static int fb(int n, int[] d){
        if(n==0||n==1){
            return n;
        }
        if(d[n]!=0){
            return d[n];
        }
        int fn= fb(n-1, d) + fb(n-2 , d);
        d[n]=fn;
        return fn;
    }
    public static void main(String [] args){
        int n=10;
        System.out.println(fb(n, new int[n+1]));
    }
}

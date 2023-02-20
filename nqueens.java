/*
 * in this program we are going to learn reduce the time complexity of the program as it
 * is we are going to eliminate the issafe function by creating three boolean arrays.
. . . . . . . Q
. . . Q . . . .
Q . . . . . . .
. . Q . . . . .
. . . . . Q . .
. Q . . . . . .
. . . . . . Q .
. . . . Q . . .
in the following there are 8 queens arranged and let us assume we are comming for first to last row.
so that we have to only check the column,left diagnol,right diagnol so that we create three boolean 
array and back track them.
 */
public class nqueensopt{
    public static void main(String [] args){
        int n=8;
        char[][] arr = new char[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]='.';
            }
            
        }
        nq(arr, 0, new boolean[n], new boolean[2*n-1], new boolean[2*n-1]);
    }
   
    public static void print(char[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void nq(char[][] arr, int row, boolean[] cols, boolean[] d1, boolean[] d2){
        if (row == arr.length){
            print(arr);
            System.out.println("----------------");
            return;
        }
        for(int col=0; col<arr[0].length; col++){
            if(cols[col]==false && d1[row + col]==false && d2[row - col + arr.length-1]==false){
                arr[row][col]='Q';
                cols[col]=true;
                d1[row + col]=true;
                d2[row - col + arr.length-1]=true;
                nq(arr, row+1, cols, d1, d2);
                arr[row][col]='.';
                cols[col]=false;
                d1[row + col]=false;
                d2[row - col + arr.length-1]=false;
            }
        }
    }
}

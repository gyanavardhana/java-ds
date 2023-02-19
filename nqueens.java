/*
 * in this java program we are going to learn the n queens problem ,in this problem ,in a chess board where
 * n queens are placed and they are placed in a such a way that no queen will attack another queen
 * as we know that queens attack diagnolly,forward,backward,left,right we have to make sure that no queen
 * should be alligned in the path.but this logic we havae written will take more time
 */
public class nqueens {
    
public static void main(String [] args){
    int n=4;
    char[][] arr = new char[n][n];
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            arr[i][j]='.';
        }
        
    }
    nq(arr, 0);
}
public static boolean isSafe(char[][] arr, int row, int col){
    for(int i=0; i<row; i++){
        if(arr[i][col]=='Q'){
            return false;
        }
    }

    for(int i=row-1, j=col+1; i>=0 && j<arr[0].length; i--,j++){
        if(arr[i][j]=='Q'){
            return false;
        }

    }
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
        if(arr[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
public static void print(char[][] arr){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            System.out.print(arr[i][j] +" ");
        }
        System.out.println();
    }
}
public static void nq(char[][] arr, int row){
    if (row == arr.length){
        print(arr);
        System.out.println("----------------");
        return;
    }
    for(int col=0; col<arr.length; col++){
        if(isSafe(arr, row, col)==true){
            arr[row][col]='Q';
            nq(arr, row+1);
            arr[row][col]='.';
        }
    }
}
}
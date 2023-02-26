/*
 * in this java program we are going to solve sudoku using the program.
 * we are going to give the input of a unsolved sudoku and get the solve matrix.
 * for this we are going to use the divisibility or modules using 3 and the mod.
 * so that we are checking the eligibility of the number to be place or not by checkinf can place function.
 */
public class suduko1 {
    
public static void main(String args[]){
    char [] []grid= {{'.', '2', '6', '5', '.', '.', '.', '9', '.'},
    {'5', '.', '.', '.', '7', '9', '.', '.', '4'},
    {'3', '.', '.', '.', '1', '.', '.', '.', '.'},
    {'6', '.', '.', '.', '.', '.', '8', '.', '7'},
    {'.', '7', '5', '.', '2', '.', '.', '1', '.'},
    {'.', '1', '.', '.', '.', '.', '4', '.', '.'},
    {'.', '.', '.', '3', '.', '8', '9', '.', '2'},
    {'7', '.', '.', '.', '6', '.', '.', '4', '.'},
    {'.', '3', '.', '2', '.', '.', '1', '.', '.'}};
   solvesudoku(grid);
   
   
   }
   public static void solvesudoku(char [][] arr){
       if(sudokusolve(arr,0,0)){
           for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr.length;j++){
                 System.out.print(arr[i][j]+" ");
               }
               System.out.println();
           }
       }
   
   
   }
   public static boolean sudokusolve(char[][] arr,int x,int y){
       if(x==arr.length){
           return true;
       }
       int nx =y==8 ?x+1:x;
       int ny =y==8 ?0:y+1;
       if(arr[x][y]=='.'){
           for(int val=1;val<=9;val++){
               if(canplace(arr,x,y,val)==true){
                   arr[x][y]=(char)(val+'0');
                   if(sudokusolve(arr,nx,ny)==true){
                       return true;
                   }
                   arr[x][y]='.';
               }
           }
       }
       else{
           if(sudokusolve(arr,nx,ny)==true){
               return true;
           }
       }
   
         return false;
   }
   public static boolean canplace(char arr[][],int x,int y,int val){
       for(int col=0;col<arr[0].length;col++){
           if(arr[x][col]==(char)(val+'0')){
               return false;
           }
    
       }
       for(int row=0;row<arr[0].length;row++){
           if(arr[row][y]==(char)(val+'0')){
               return false;
           }
       }
       x=x-(x%3);
       y=y-(y%3);
       for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
               if(arr[x+i][y+j]==(char)(val+'0')){
                   return false;
               }
           }
       }
       return true;
   }
   
}

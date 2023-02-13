/*
 * in this java program we are going to convert upper case to lower case letters whicha are present in
 * the string.we are not going to use inbuilt methods to do this . we are going unique method which we 
 * have written in the function .in which we add and subtract the character values and we are obliged to 
 * use character arrya in this java program.
 */
public class uppertolower {
    public static void main(String[]args){
        String s ="YOU ARE A MAN STAY STRONG";
        utl(s);
    }
    public static void utl(String s){
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            char ch = c[i];
            if(ch >= 'A' && ch<= 'Z'){
                char yo = (char)(ch -'A'+'a');
                c[i]=yo;
            }
        }
        for(char b: c){
            System.out.print(b);
        }
    }
}

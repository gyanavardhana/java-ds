/*
 * in this java program we are going to learn how to eliminate the vowels in the string.
 * and print the remaining characters in the array.
 * for this we are going to charat function which is inbuilt in java.
 * and returns the character at the index value.
 */
public class vowel {
    public static void main(String[]args){
        String s ="you are a man never yeild";
        rv(s);
    }
    public static void rv(String s){
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                continue;
            }
            System.out.print(c);
        }
    }
}

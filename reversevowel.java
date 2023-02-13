/*
 * in this java program we are going to learn the reverse of the only  vowels present in the string.\
 * we are going to leave the remaing characters as always.
 * we are going to use character array and we are going to use 2 pointers to swap or reverse the vowels.
 */
public class reversevowel {
    public static void main(String[]args){
        String s ="you are a man never yeild";
        rvv(s);
    }
public static void rvv(String s){
    char[] c = s.toCharArray();
    int i=0;
    int j=c.length-1;
    char te;
    while(i<j){
        while(c[i]!='a' && c[i]!='e'&& c[i]!='i'&& c[i]!='o'&& c[i]!='u'){
            i++;
        }
        while(c[j]!='a' && c[j]!='e'&& c[j]!='i'&& c[j]!='o'&& c[j]!='u'){
            j--;
        }
        if(i>=j){
            break;
        }
        te=c[i];
        c[i]=c[j];
        c[j]=te;
        i++;
        j--;

    }
    for(char b: c){
        System.out.print(b);
    }

}

}

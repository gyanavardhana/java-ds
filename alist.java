/*
 * in this java program we are going to implement array list 
 * array list is  a dynamic array of objects
 * it can be used to add,set,get,findindex,remove elements in the list.
 */
import java.util.*;
public class alist {
    public static void main(String [] args){
        ArrayList<Integer> li = new ArrayList<>();
        //adding a element into a list
        li.add(7);
        li.add(8);
        li.add(9);
        System.out.println(li);
        //setting a element in the list
        li.set(0,3);
        li.set(2,5);
        System.out.println(li);
        //removing a elemetn in the list
        li.remove(2);
        System.out.println(li);
        //finding index
        li.indexOf(8);
        System.out.println(li);


    }
}

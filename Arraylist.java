import java.util.*;
public class Arraylist{
    public static void main(String[]args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(345);
        a.add(909);
        a.add(767);
        //adding at particuar index//
        a.add(1,789);
        //modifyling
        a.set(2,7898);
        System.out.println(a);
    }

}

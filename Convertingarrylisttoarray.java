import java.util.*;
public class Convertingarrylisttoarray {
    public static void main(String[]args){
    ArrayList<Integer> a=new ArrayList<>();
        a.add(898);
        a.add(89);
        a.add(1);
        a.add(78);
        //using object also we can store array elements//
        Object b[]=a.toArray();
        System.out.println(Arrays.toString(b));
    }
    
}

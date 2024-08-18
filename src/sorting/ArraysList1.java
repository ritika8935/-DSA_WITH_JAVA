package sorting;
import java.util.*;
public class ArraysList1 {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(20);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}

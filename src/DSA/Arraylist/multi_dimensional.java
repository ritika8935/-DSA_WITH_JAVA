package DSA.Arraylist;
import java.util.*;

public class multi_dimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        list2.remove(3);
        list2.remove(2);

        System.out.println(mainlist);

        for(int j=0;j<mainlist.size();j++){
            ArrayList<Integer> current=mainlist.get(j);
            for(int k=0;k<current.size();k++){
                System.out.print(current.get(k)+" ");
            }
            System.out.println();
        }
    }
}

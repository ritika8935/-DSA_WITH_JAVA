package DSA.Arraylist;

import java.util.ArrayList;

public class introduction {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        //ArrayList-is a class,<Integer>-what type of data we are storing,list-is obj,new-dynamic memory allocation.
        ArrayList<String> List2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        //operation:-
        //* add(); operation
        List.add(1);//0(1)
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        List.add(1,9);//0(n)
        System.out.println(List);

        //*get operation-0(1)
        int Element=List.get(2);
        System.out.println(Element);

        //Delete operation-0(n)
        List.remove(2);
        System.out.println(List);

        //set operation-0(n)
        List.set(2,10);
        System.out.println(List);

        //contains operation
        System.out.println(List.contains(1));
        System.out.println(List.contains(11));

    }
}

package sorting;
import java.util.*;
import java.lang.*;

//Implementing Comparable interface to sort a Collection

class com implements Comparable<com>{
    int x,y;
    com(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(com p){
        return this.x-p.x;
    }
}
public class ArraysList2 {
    public static void main(String args[]){
        List<com> list=new ArrayList<com>();
        list.add(new com(5,10));
        list.add(new com(2,20));
        list.add(new com(10,30));
        Collections.sort(list);
        for(com p: list){
            System.out.println(p.x+" "+p.y);
        }

    }
}

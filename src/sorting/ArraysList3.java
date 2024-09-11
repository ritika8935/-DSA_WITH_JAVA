package sorting;
import java.util.*;
import java.lang.*;
import java.io.*;

//Implementing Comparator interface to sort a Collection
class mycmpp implements Comparator<point>{
    public int compare(point p1,point p2){
        return p1.x-p2.x;
    }
}

public class ArraysList3 {
    public static void main(String args[]){
        List<point> list=new ArrayList<point>();
        list.add(new point(5,10));
        list.add(new point(2,20));
        list.add(new point(10,30));

        Collections.sort(list,new mycmpp());

        for(point p:list){
            System.out.println(p.x+" "+p.y);
        }
    }
}

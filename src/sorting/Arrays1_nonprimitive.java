package sorting;
import java.util.*;
import java.lang.*;
import java.io.*;
//Sorting an array of Non-Primitive types by implementing Comparable interface.
class point implements Comparable<point>{
    int x,y;

    point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(point p){
        //return this.x-p.x; //ascending order
        //return p.x-this.x; //descending order
        //return this.y-p.x; //descending order
        return p.x-this.y; //ascending order
    }
}

public class Arrays1_nonprimitive {
    public static void main(String args[]){
        point arr[]={
                new point(10,20),
                new point(3,12),
                new point(5,7)
        };
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(
                    arr[i].x + " " + arr[i].y);

    }
}

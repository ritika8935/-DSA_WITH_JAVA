package sorting;
import java.util.*;
import java.lang.*;
import java.io.*;
//Sorting an array of Non-Primitive types by implementing Comparator interface.

class points{
    int x,y;
    points(int x,int y){
        this.x=x;
        this.y=y;
    }
}


class mycmp implements Comparator<point>{
    public int compare(point p1,point p2){
       // return p1.x-p2.x; //comparing x co-ordinate
        return p1.y-p2.y;  //comparing y-co-ordinate
    }
}



public class Arrays2_nonprimitive {
    public static void main(String args[]){
        point arr[]={
                new point(10,20),
                new point(3,12),
                new point(5,7)
        };
        Arrays.sort(arr,new mycmp());
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}

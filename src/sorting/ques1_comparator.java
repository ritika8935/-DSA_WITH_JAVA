package sorting;
import java.util.*;
import java.lang.*;
import java.io.*;

//Sort an Integer array in such a way that all even numbers come first followed by all the odd numbers

class Mycls implements Comparator<Integer>{
    public int compare(Integer a,Integer b){
        return a%2-b%2;
    }
}
public class ques1_comparator {
    public static void main(String args[]){
        Integer arr[]={5,20,10,3,12};
        Arrays.sort(arr,new Mycls());
        System.out.println(Arrays.toString(arr));
    }
}

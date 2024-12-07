package DSA.Arraylist;
import java.util.*;

//An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
// An Arraylist nums is monotone increasing if for all i<=j,nums.get(i)<=nums.get(j).AnArraylist nums is
// monotone decreasing
// if for all i <= j, nums.get(i) >= nums.get(j).Given an integer Arraylist nums,
// return true if the given list is monotonic, or false otherwise.
public class practice {
   public static boolean monotone(ArrayList<Integer> list){
       boolean inc=true;
       boolean dec=true;
       for(int i=0;i<list.size()-1;i++){

           if(list.get(i)>list.get(i+1)){
               inc=false;
           }
           if(list.get(i)<list.get(i+1)){
               dec=false;
           }

       }
       return inc||dec;
   }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);

        System.out.println(monotone(list));
    }
}

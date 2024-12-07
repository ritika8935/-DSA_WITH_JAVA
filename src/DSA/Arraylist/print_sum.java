package DSA.Arraylist;
import java.util.*;

public class print_sum {

//    public static boolean printSum(ArrayList<Integer> list,int target){
//           //brute force-0(n^2)
//        for(int i=0;i<list.size();i++){
//            for(int j=i+1;j< list.size();j++){
//                if(list.get(i)+list.get(j)==target){
//                    return true;
//                }
//            }
//        }
//        return false;
     public static boolean printSum(ArrayList<Integer> list,int target){
         int lp=0;
         int rp=list.size()-1;
         while(lp!=rp){
             if(list.get(lp)+list.get(rp)==target){
                 return true;
             }
             if(list.get(lp)+list.get(rp)<target){
                 lp++;
             }else{
                 lp--;
             }
         }
         return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int target=5;

        System.out.println(printSum(list,target));
    }
}

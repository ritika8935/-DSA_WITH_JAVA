package DSA.Arraylist;
import java.lang.reflect.Array;
import java.util.*;

public class maxWaterStored {

//    public static int storedWater(ArrayList<Integer> height){
//      //brute force-0(n^2)
//       int maxWater=0;
//        for(int i=0;i<height.size();i++){
//            for(int j=i+1;j<height.size();j++) {
//                int ht = Math.min(height.get(i), height.get(j));
//                int width = j - i;
//                int currtWater=ht*width;
//                maxWater=Math.max(maxWater,currtWater);
//            }
//        }
//        return maxWater;

    public static int storedWater(ArrayList<Integer> height) {
        //2-pointer= 0(n)
     int maxWater=0;
     int lp=0;
     int rp=height.size()-1;

     while(lp<rp){
       int  ht=Math.min(height.get(lp),height.get(rp));
       int  width=rp-lp;
      int currentWater=ht*width;
      maxWater=Math.max(maxWater,currentWater);

      if(height.get(lp) < height.get(rp)){
          lp++;
      }
      else{
          rp--;
      }
     }
     return maxWater;
    }


    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storedWater(height));
    }
}

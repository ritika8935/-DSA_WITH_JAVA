package DSA.Arraylist;

import java.util.ArrayList;

public class size {
    public static void swap(ArrayList<Integer> list,int indx1,int indx2){
        int temp=indx1;
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(1);
        System.out.println(list.size());

        System.out.println("reverse");
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


//        System.out.println("maximum number:-");
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<list.size();i++){
//            if(max<list.get(i)){
//                max=list.get(i);
//            max=Math.max(max,list.get(i));
//            }
//        }
//        System.out.println("max no is:"+max);

        System.out.println("swapping two number:-");
        int indx1=1 , indx2=3;
        System.out.println(list);
        swap(list,indx1,indx2);
        System.out.println(list);
    }
}

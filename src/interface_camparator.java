import  java.util.Collections;
import  java.util.Comparator;
import  java.util.List;
import  java.util.ArrayList;

public class interface_camparator {
    public static void main(String[] args) {

        Comparator<Integer> com=new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> nums=new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums);
        System.out.println(nums);
    }
}

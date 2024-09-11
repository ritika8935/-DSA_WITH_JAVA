package sorting;
import java.util.Arrays;
import java.util.Collections;
public class Arrays3_Wrappercls {
    public static void main(String args[]){
        Integer arr[]={20,6,9,10};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}

package Leetcode;

public class majority_Element_169 {
    public static void main(String[] args) {
        //int nums[]={3,2,3};
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    //using moore's voting algorithm
    static int majorityElement(int[] nums) {
        int cand=0;
        int point=0;
        for(int i=0;i<nums.length;i++) {
            if (point == 0) {
                cand = nums[i];
            }
            if (cand == nums[i]) {
                point++;
            } else {
                point--;
            }
        }
        return cand;
    }
    }

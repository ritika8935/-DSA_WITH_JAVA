package Recursion;

public class bs_by_recursion {
    public static void main(String[] args) {
        //int []arr={0,1,3,6,7,8,13};
        int []arr={};
        int target=3;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    static int binarySearch(int []arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;

        if(arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target){
            return binarySearch(arr,target,s,mid-1);
        }
            return binarySearch(arr,target,mid+1,e);
    }
}

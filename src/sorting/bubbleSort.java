package sorting;

public class bubbleSort {

    void Bubblesort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
           boolean swapped = false;
           for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                   //swap
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swapped=true;
               }
           }
           if(swapped==false)
               break;
        }

    }

    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
     bubbleSort ob=new bubbleSort();
     int arr[]={64, 34, 25, 12, 22, 11, 90};
     ob.Bubblesort(arr);
        System.out.println("sorted array");
        ob.printArray(arr);
    }
}

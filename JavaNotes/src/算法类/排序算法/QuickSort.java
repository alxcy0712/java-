package 算法类.排序算法;


public class QuickSort {

    private static void print(int[] array){
        for(int i : array){
            System.out.print(i+" ");
        }
    }



    private static int findStandard(int []array,int left ,int right){
        int key = array[left];
        while(left<right){
            while(left<right && array[right]>key){
                right--;
            }
            if(left<right){
                array[left] = array[right];
                left++;
            }
            while(left<right && array[left]<key){
                left++;
            }
            if(left<right){
                array[right] = array[left];
                right--;
            }
        }
        array[left] = key;
        return left;
    }

    private static void quickSort(int []array,int left,int right){
        if(left<right){
            int standard = findStandard(array,left,right);
            quickSort(array,left,standard-1);
            quickSort(array,standard+1,right);
        }
    }


    public static void main(String[] args) {
        int []array = {2,3,6,1,4,3,4,2,7,4,7,4,56,5,4,3,7,3,3,3,56,7,8};
        System.out.print("原数组:");
        print(array);
        quickSort(array,0,array.length-1);
        System.out.print("\n排序后:");
        print(array);
    }
}

package lzx;

import java.util.Arrays;

/***
 * @Author: lzx
 * @Description: java 快排
 * @Date: 2023/2/6
 **/
public class QuickSort1 {
    public static void main(String[] args) {
        int[] a = {6,72,113,11,23};
        quickSort(a,0,a.length -1);
        System.out.println("快排结果：" + Arrays.toString(a));
    }
    //递归调用
    public static void quickSort(int[] array,int start,int end){
        if (start < end){
            int mid = sort(array, start, end);
            quickSort(array,start,mid-1);
            quickSort(array,mid+1,end);
        }
    }

    public static int sort(int[] arr,int start,int end){
        int low = start;
        int high = arr[end]; //基准
        for (int i = start; i < end; i++) {
            if (arr[i] <= high){
                swap(arr,i,low);
                low ++;
            }
        }
        swap(arr,low,end);
        return low;
    }

    public static void swap(int[] arr,int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}

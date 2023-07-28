package lzx;

import java.util.Arrays;

/**
 * @author lzx
 * @date 2023/7/21 17:49
 * @description: TODO 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {11, 44, 23, 67, 88, 65, 34, 48, 9, 12};
        toMergeSort(arr,0,arr.length-1);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    public static void toMergeSort(int[] arr, int left, int right) {
        // 递归出口
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        toMergeSort(arr, left, mid); //先左边递归
        toMergeSort(arr, mid + 1, right); //右边递归
        sort(arr, left, mid, right); //排序函数
    }

    public static void sort(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, tmpIndex = left; //i左半边 j右半边
        int[] tmpArr = arr.clone();
        while (i <= mid && j <= right) {
            if (tmpArr[i] > tmpArr[j]) {
                arr[tmpIndex] = tmpArr[j];
                j++;
                tmpIndex++;
            } else {
                arr[tmpIndex] = tmpArr[i];
                i++;
                tmpIndex++;
            }
        }
        while (i <= mid) { // 左边未完 右边已完
            arr[tmpIndex] = tmpArr[i];
            i++;
            tmpIndex++;
        }

        while (j <= right){ // 右边未完 左边已完
            arr[tmpIndex] = tmpArr[j];
            j++;
            tmpIndex++;
        }
    }
}

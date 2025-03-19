package com.sort.lcr159;

import java.util.Arrays;

public class Method01 {
    public int[] inventoryManagement(int[] stock, int cnt) {
        quickSort(stock, 0, stock.length - 1);
        return Arrays.copyOf(stock, cnt);
    }

    private void quickSort(int[] stock, int i, int j) {
        if(i>=j)return;
        int left = i, right = j;
        while (left < right){
            while (left < right && stock[i] <= stock[right]) right--;
            while (left < right && stock[left] <=  stock[i]) left++;
            swap(stock, left, right);
        }
        swap(stock, i, left);
        quickSort(stock, i, left - 1);
        quickSort(stock, left + 1, j);
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

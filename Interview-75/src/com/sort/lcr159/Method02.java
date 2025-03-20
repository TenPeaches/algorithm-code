package com.sort.lcr159;

import java.util.Arrays;

public class Method02 {
    public int[] inventoryManagement(int[] stock, int cnt) {
        if(cnt==stock.length)return stock;
        quickSort(stock, cnt,0, stock.length - 1);
        return Arrays.copyOf(stock, cnt);
    }

    private void quickSort(int[] stock,int cnt, int i, int j) {
        if(i>=j)return;
        int left = i, right = j;
        while (left < right){
            while (left < right && stock[i] <= stock[right]) right--;
            while (left < right && stock[left] <=  stock[i]) left++;
            swap(stock, left, right);
        }
        swap(stock, i, left);
        if(cnt > left) quickSort(stock, cnt, left + 1, j);
        if(cnt<left) quickSort(stock, cnt, i, left - 1);
        return;
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

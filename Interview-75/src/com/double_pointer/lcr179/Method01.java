package com.double_pointer.lcr179;

public class Method01 {
    public int[] twoSum(int[] price, int target) {
        int left = 0;
        int right = price.length - 1;
        while (left < right) {
            int sum = price[left] + price[right];
            if(sum == target){
                return new int[]{price[left], price[right]};
            }else if(sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return null;
    }
}

package com.krahets.dual_pointer.leetcode167;

public class Method01 {

    // 找到数组中两个数的索引，使得这两个数的和等于目标值
    public int[] twoSum(int[] numbers, int target) {
        // 创建一个数组用于存储结果，长度为2
        int[] result = new int[2];

        // 遍历数组，外层循环固定一个元素
        for (int i = 0; i < numbers.length - 1; i++) {
            // 设置左右指针，左指针指向当前元素的下一个位置，右指针指向数组末尾
            int left = i + 1;
            int right = numbers.length - 1;

            // 使用二分查找找到与固定元素相加等于目标值的另一个元素
            while (left <= right) {
                // 计算中间位置
                int mid = (left + right) / 2;

                // 检查当前元素和中间元素的和是否等于目标值
                if (numbers[i] + numbers[mid] == target) {
                    result[0] = i + 1; // 记录第一个元素的索引（加1以符合题目要求）
                    result[1] = mid + 1; // 记录第二个元素的索引（加1以符合题目要求）
                    return result; // 返回结果
                }
                // 如果和小于目标值，移动左指针向右
                else if (numbers[i] + numbers[mid] < target) {
                    left = mid + 1;
                }
                // 如果和大于目标值，移动右指针向左
                else {
                    right = mid - 1;
                }
            }
        }

        // 如果没有找到符合条件的两个元素，返回结果
        return result;
    }
}


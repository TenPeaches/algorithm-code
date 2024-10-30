package com.krahets.greedy.leetcode135;

public class Method01 {
    // 方法：根据评分数组计算每个孩子应得的最小糖果数量
    public int candy(int[] ratings) {
        // 创建一个与 ratings 长度相同的数组，用于存储每个孩子的糖果数量
        int[] candies = new int[ratings.length];
        int numCandies = 1; // 初始化糖果总数，至少第一个孩子分配 1 个糖果
        candies[0] = 1; // 第一个孩子分配 1 个糖果

        // 正向遍历：从左到右分配糖果
        for (int i = 1; i < ratings.length; i++) {
            // 如果当前评分大于前一个孩子的评分
            if (ratings[i] > ratings[i-1]) {
                // 当前孩子糖果数为前一个孩子糖果数加 1
                candies[i] = candies[i-1] + 1;
                // 更新总糖果数
                numCandies += candies[i];
            } else {
                // 否则，当前孩子至少分配 1 个糖果
                candies[i] = 1;
                // 更新总糖果数
                numCandies += 1;
            }
        }

        // 反向遍历：从右到左调整糖果分配
        for (int i = ratings.length - 2; i >= 0; i--) {
            // 如果当前评分大于下一个孩子的评分
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                // 计算需要增加的糖果数
                int cha = candies[i + 1] - candies[i] + 1;
                // 更新当前孩子的糖果数
                candies[i] += cha;
                // 更新总糖果数
                numCandies += cha;
            }
        }

        // 返回总糖果数
        return numCandies;
    }
}


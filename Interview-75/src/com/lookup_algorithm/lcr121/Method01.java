package com.lookup_algorithm.lcr121;

public class Method01 {
    public boolean findTargetIn2DPlants(int[][] plants, int target) {
        if (plants == null || plants.length == 0 || plants[0].length == 0) {
            return false;
        }
        int i = 0, j = plants[0].length - 1;
        while (i < plants.length && j >= 0) {
            if (plants[i][j] == target) {
                return true;
            }else if (plants[i][j] < target) {
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}

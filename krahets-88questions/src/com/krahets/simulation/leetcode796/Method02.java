package com.krahets.simulation.leetcode796;

public class Method02 {
    // 方法：检查字符串 s 是否可以通过旋转得到字符串 goal
    public boolean rotateString(String s, String goal) {
        // 判断 s 和 goal 是否长度相等，以及 goal 是否是 s+s 的子串
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}


package com.krahets.dual_pointer.leetcode392;

public class Method01 {

    // 检查字符串 s 是否为字符串 t 的子序列
    public boolean isSubsequence(String s, String t) {
        // 获取 s 的长度
        int n = s.length();
        // 如果 s 为空字符串，则 s 视为 t 的子序列
        if(n == 0) {
            return true;
        }
        // 获取 t 的长度
        int m = t.length();

        // 遍历 t 字符串
        for (int i = 0; i < m; ) {
            // 遍历 s 字符串
            for (int j = 0; j < n; ) {
                // 如果 t 的当前字符与 s 的当前字符匹配
                if (s.charAt(j) == t.charAt(i)) {
                    // 如果已经匹配到 s 的最后一个字符，则返回 true
                    if(j == n - 1) {
                        return true;
                    }
                    // 如果 t 已经遍历到最后一个字符但 s 还没匹配完成，则返回 false
                    if(i == m - 1) {
                        return false;
                    }
                    // 匹配成功，继续检查下一个字符
                    i++;
                    j++;
                } else {
                    // 如果字符不匹配，继续遍历 t 的下一个字符
                    if(i == m - 1) {
                        return false; // 如果已经到达 t 的最后字符，返回 false
                    }
                    i++;
                }
            }
        }
        // 如果遍历完 t 仍然没有找到完整的 s 子序列，返回 false
        return false;
    }
}

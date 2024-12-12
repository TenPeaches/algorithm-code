package com.krahets.mathematics.leetcode233;

public class Method01 {
    // 计算从1到n的所有整数中，数字1出现的总次数
    public int countDigitOne(int n) {
        int digit = 1, res = 0; // digit表示当前处理的位数（个位、十位、百位等），res用于存储最终的结果
        int high = n / 10, cur = n % 10, low = 0; // high表示当前位的高位部分，cur表示当前位，low表示当前位的低位部分

        // 当high和cur都不为0时，循环继续
        while (high != 0 || cur != 0) {
            // 根据当前位的值更新结果
            if (cur == 0) {
                // 如果当前位为0，1出现的次数为high * digit
                res += high * digit;
            } else if (cur == 1) {
                // 如果当前位为1，1出现的次数为high * digit + low + 1
                res += high * digit + low + 1;
            } else {
                // 如果当前位大于1，1出现的次数为(high + 1) * digit
                res += (high + 1) * digit;
            }

            // 更新低位和当前位
            low += cur * digit; // 更新低位部分
            cur = high % 10; // 更新当前位
            high /= 10; // 更新高位部分
            digit *= 10; // 更新当前位数
        }

        // 返回计算得到的1出现的次数
        return res;
    }
}


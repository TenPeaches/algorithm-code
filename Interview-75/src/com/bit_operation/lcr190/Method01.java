package com.bit_operation.lcr190;

public class Method01 {
    public int encryptionCalculate(int dataA, int dataB) {
        while (dataB !=0){
            int carry = dataA & dataB;
            dataA = dataA ^ dataB;
            dataB = carry << 1;
        }
        return dataA;
    }
}

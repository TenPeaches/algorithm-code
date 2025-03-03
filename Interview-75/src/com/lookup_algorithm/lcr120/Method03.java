package com.lookup_algorithm.lcr120;

public class Method03 {
    public int findRepeatDocument(int[] documents) {
        int i=0;
        while(i<documents.length){
            if(i==documents[i]){
                i++;
                continue;
            }
            if(documents[i]==documents[documents[i]]){
                return documents[i];
            }
            int temp=documents[i];
            documents[i]=documents[temp];
            documents[temp]=temp;
        }
        return -1;
    }
}

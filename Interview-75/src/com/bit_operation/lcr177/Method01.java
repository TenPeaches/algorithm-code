package com.bit_operation.lcr177;

public class Method01 {
    public int[] sockCollocation(int[] sockets) {
        int n=0,x=0,y=0,z=1;
        for(int i=0;i<sockets.length;i++){
            n^=sockets[i];
        }
        while ((z&n)==0){
            z<<=1;
        }
        for(int i=0;i<sockets.length;i++){
            if((sockets[i]&z)!=0){
                x^=sockets[i];
            }else{
                y^=sockets[i];
            }
        }
        return new int[]{x,y};
    }
}

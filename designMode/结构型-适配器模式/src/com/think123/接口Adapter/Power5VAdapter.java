package com.think123.接口Adapter;

public class Power5VAdapter extends  PowerAdapter {
     public Power5VAdapter(AC220 ac220) {
        super(ac220);
    }
    public int output5V(){
        int output = 0;
        if (ac != null) {
            output = ac.outPut220() / 44;
        }
        return output;
    }
}
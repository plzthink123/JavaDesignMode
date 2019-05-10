package com.think123.Multiton1;

import java.util.ArrayList;
import java.util.Random;

/**
 * 皇帝类
 */
public class Emperor {
    //最多只能有两个皇帝
    private static int maxNumOfEmperor=2;
    //皇帝叫什么名字
    private static ArrayList emperorInfoList=new ArrayList(maxNumOfEmperor);
    //容纳皇帝的列表
    private static ArrayList emperorList=new ArrayList(maxNumOfEmperor);
    //正在被人尊称的是哪个皇帝
    private static int countNumOfEmperor=0;

    //构造函数私有化
    private Emperor(){}
    private Emperor(String info){
        emperorInfoList.add(info);
    }
    //先生产两个皇帝
    static {
        for(int i=0;i<maxNumOfEmperor;i++){
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    public static Emperor getInstance(){
        Random random=new Random();
        //随机拉出一个皇帝,
        countNumOfEmperor=random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    //皇帝的名字
    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
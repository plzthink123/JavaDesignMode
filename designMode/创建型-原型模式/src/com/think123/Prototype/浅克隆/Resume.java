package com.think123.Prototype.浅克隆;

/**
 *模拟复制简历
 */
public class Resume  implements  Cloneable{
    private String name;
    private String birthday;
    private String school;
    private String sex;
    private String timeArea;
    private String company;

    /**
     * 构造函数初始化建立赋值姓名
     */
    public   Resume (String name){
        this.name=name;
    }

    /**
     * 设定个人信息
     * @param birthday 生日
     * @param school 学校
     * @param sex 年龄
     */
    public void setResumeInfo(String birthday,String school,String sex){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    /**
     * 设定工作经验
     * @param timeArea
     * @param company
     */
    public void setWorkExerience(String timeArea,String company){
        this.timeArea=timeArea;
        this.company=company;
    }

    public Object clone(){

        Resume resume = null;
        try {
           resume= (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }

    /**
     * 展示
     */
    public void display(){
        System.out.println("姓名：" + name);
        System.out.println("生日:" + birthday + ",性别:" + sex + ",毕业学校：" + school);
        System.out.println("工作年限:" + timeArea + ",公司:" + company);
    }

}
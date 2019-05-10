package com.think123.Prototype.深克隆;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements  Cloneable, Serializable {
    private String sname;
    private Date birthday;

    /**
     * 重写Object对象的clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用Object对象的clone方法
        Object obj = super.clone();
        Sheep s = (Sheep) obj;
        s.birthday = (Date) this.birthday.clone();
        return s;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
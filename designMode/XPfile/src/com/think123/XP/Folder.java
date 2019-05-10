package com.think123.XP;

import java.util.ArrayList;

public class Folder extends IFile {
    private  String name;
    private int deep;
    private ArrayList<IFile> list=new ArrayList<IFile>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<IFile> getList() {
        return list;
    }

    public void setList(ArrayList<IFile> list) {
        this.list = list;
    }

    @Override
    public IFile getConposite() {
        return null;
    }

    @Override
    public void sampleOperation() {

    }

    @Override
    public int getDeep() {
        return 0;
    }

    @Override
    public void setDeep(int i) {

    }
    public void Add(IFile iFile){
        list.add(iFile);
    }
    public void remove(IFile iFile){
        list.remove(iFile);
    }

}
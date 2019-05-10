package com.think123.XP;

public class File extends IFile {
    private String name;
    private int deep;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
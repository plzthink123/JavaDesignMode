package com.think123.FactoryMethod1;

public class ExportExcel implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("Excel...");
        return true;
    }
}
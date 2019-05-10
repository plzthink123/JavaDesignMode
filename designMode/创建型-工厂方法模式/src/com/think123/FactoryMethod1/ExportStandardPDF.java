package com.think123.FactoryMethod1;

public class ExportStandardPDF implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("standardPDF...");
        return true;
    }
}
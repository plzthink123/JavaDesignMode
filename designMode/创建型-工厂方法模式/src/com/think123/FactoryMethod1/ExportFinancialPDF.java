package com.think123.FactoryMethod1;

public class ExportFinancialPDF implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("financial...");
        return true;
    }
}
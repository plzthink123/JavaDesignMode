package com.think123.FactoryMethod1;

public class ExportExcelfactory implements ExportFactory {
    @Override
    public ExportFile factory(String type ) {
        return new ExportExcel();
    }
}
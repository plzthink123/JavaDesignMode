package com.think123.FactoryMethod1;

public class ExportPDFfactory implements ExportFactory {
    @Override
    public ExportFile factory(String type ) {
        if (type.equalsIgnoreCase("standard")) {
            return new ExportStandardPDF();
        }else if(type.equalsIgnoreCase("financial")) {
            return new ExportFinancialPDF();
        }else{
            throw  new RuntimeException("can not find object");
        }
    }
}
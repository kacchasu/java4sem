package com.marov.practice10_11.practice10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrinterTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("practice10Resources/applicationContext10.xml");
        String arg1 = "consolePrinterBean";
        String arg2 = "filePrinterBean";
        Printer printer1 = context.getBean(arg1, Printer.class);
        Printer printer2 = context.getBean(arg2, Printer.class);
        printer1.doPrint();
        printer2.doPrint();
    }
}

package com.marov.practice10_11.practice10;

import org.springframework.stereotype.Component;

@Component("filePrinterBean")
public class FilePrinter implements Printer {
    @Override
    public void doPrint() {
        System.out.println("do file print");
    }
}

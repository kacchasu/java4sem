package com.marov.practice10_11.practice10;

import org.springframework.stereotype.Component;

@Component("consolePrinterBean")
public class ConsolePrinter implements Printer {
    @Override
    public void doPrint() {
        System.out.println("do console print");
    }
}

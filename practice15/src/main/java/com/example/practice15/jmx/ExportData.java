package com.example.practice15.jmx;

import com.example.practice15.services.ExportDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "com.example.practice15.jmx:name=ExportData")
public class ExportData implements ExportDataMBean {

    @Autowired
    private ExportDataService exportDataService;

    @Override
    public void exportData() {
        exportDataService.exportDataToFile();
    }
}

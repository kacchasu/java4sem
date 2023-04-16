package com.example.practice15;

import com.example.practice15.services.ExportDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    @Autowired
    private ExportDataService exportDataService;

    @Scheduled(fixedRate = 1800000) // 1800000 миллисекунд = 30 минут
    public void exportData() {
        exportDataService.exportDataToFile();
    }
}

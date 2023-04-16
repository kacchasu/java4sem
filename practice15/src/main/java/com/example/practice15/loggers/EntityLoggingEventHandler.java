package com.example.practice15.loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class EntityLoggingEventHandler {

    private static final Logger logger = LoggerFactory.getLogger(EntityLoggingEventHandler.class);

    @HandleBeforeCreate
    public void handleBeforeCreate(Object entity) {
        logger.debug("Before creating: {}", entity);
    }

    @HandleAfterCreate
    public void handleAfterCreate(Object entity) {
        logger.debug("After creating: {}", entity);
    }

    @HandleBeforeSave
    public void handleBeforeSave(Object entity) {
        logger.debug("Before saving: {}", entity);
    }

    @HandleAfterSave
    public void handleAfterSave(Object entity) {
        logger.debug("After saving: {}", entity);
    }

    @HandleBeforeDelete
    public void handleBeforeDelete(Object entity) {
        logger.debug("Before deleting: {}", entity);
    }

    @HandleAfterDelete
    public void handleAfterDelete(Object entity) {
        logger.debug("After deleting: {}", entity);
    }
}

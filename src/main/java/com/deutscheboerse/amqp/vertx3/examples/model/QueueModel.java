package com.deutscheboerse.amqp.vertx3.examples.model;

/**
 * Class used to map the subscribe request body from JSON to Java
 */
public class QueueModel {
    private String name = null;

    public QueueModel() {
        return;
    }

    public QueueModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

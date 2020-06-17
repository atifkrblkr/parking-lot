package com.karbelkardesigns.parkinglot.cache;

import java.util.concurrent.ConcurrentHashMap;

public enum Cache {
    instance;
    ConcurrentHashMap<String, String> parkedList;

    Cache() {
        this.parkedList = new ConcurrentHashMap<>(10);
    }

    public ConcurrentHashMap<String, String> getParkedList() {
        return parkedList;
    }

    public void setParkedList(ConcurrentHashMap<String, String> parkedList) {
        this.parkedList = parkedList;
    }
}

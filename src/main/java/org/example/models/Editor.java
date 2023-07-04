package org.example.models;

import org.example.listener.EventManager;
import org.example.enums.EventType;

public class Editor {
    public EventManager events;
    EventType eventType;
    Editor(){
        events = new EventManager();
    }

    void updateStatus(EventType eventType){
        this.eventType = eventType;
        events.notify();
    }
}

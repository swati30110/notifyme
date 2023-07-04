package org.example.listener;

import org.example.enums.EventType;
import org.example.models.Listener;

import java.util.HashMap;
import java.util.List;

public class EventManager {
    HashMap<EventType, List<Listener>> subscriber;
    public EventManager(){
        subscriber = new HashMap<>();
    }
    public void subscribe(EventType eventType, Listener listener){

    }

    public void unsubscribe(EventType eventType, Listener listener){

    }

    public void notify(EventType eventType, String data){
        for(Listener listener : subscriber.get(eventType))
            listener.update(data);
    }
}

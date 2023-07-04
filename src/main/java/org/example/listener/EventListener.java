package org.example.listener;

import org.example.enums.EventType;

public interface EventListener {
    void update(EventType eventType);
}

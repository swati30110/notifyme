package org.example.listener;

import lombok.AllArgsConstructor;
import org.example.enums.EventType;
@AllArgsConstructor
public class EmailAlertListener implements EventListener {
    String email;
    String message;
    @Override
    public void update(EventType eventType) {

    }

}

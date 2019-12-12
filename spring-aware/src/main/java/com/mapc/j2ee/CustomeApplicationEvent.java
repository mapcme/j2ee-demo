package com.mapc.j2ee;

import org.springframework.context.ApplicationEvent;

public class CustomeApplicationEvent extends ApplicationEvent {

    private Object data;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public CustomeApplicationEvent(Object source) {
        super(source);
        this.data=source;
    }

    public Object getData() {
        return this.data;
    }
}

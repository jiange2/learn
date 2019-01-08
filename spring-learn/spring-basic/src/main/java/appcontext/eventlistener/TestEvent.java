package appcontext.eventlistener;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {
    private String eventName;

    public TestEvent(String eventName) {
        super(eventName);
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "TestEvent{" +
                "eventName='" + eventName + '\'' +
                '}';
    }
}

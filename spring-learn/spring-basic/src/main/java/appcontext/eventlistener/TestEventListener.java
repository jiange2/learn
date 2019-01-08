package appcontext.eventlistener;

import org.springframework.context.ApplicationListener;

public class TestEventListener implements ApplicationListener<TestEvent> {

    @Override
    public void onApplicationEvent(TestEvent event) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(event);
    }
}

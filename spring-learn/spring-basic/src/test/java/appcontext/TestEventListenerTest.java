package appcontext;

import appcontext.eventlistener.TestEvent;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEventListenerTest {

    @Test
    public void test() throws InterruptedException {
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:app-context.xml");
        appContext.publishEvent(new TestEvent("Demo"));
        System.out.println(1);
        Thread.sleep(2000);
    }
}
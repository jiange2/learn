package appcontext.resourceloader;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ResourceLoaderTest {

    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext(new String[]{"classpath:*/app-context.xml"});

        appContext.getResources("classpath:*");
    }
}

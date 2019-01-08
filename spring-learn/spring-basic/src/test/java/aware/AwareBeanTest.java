package aware;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AwareBeanTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:app-context.xml");
        AwareBean awareBean = appContext.getBean(AwareBean.class);
        System.out.println(awareBean.getBeanName());
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:app-context.xml");
        appContext.setBeanName("test");
        AwareBean awareBean = appContext.getBean(AwareBean.class);
        System.out.println(awareBean.getApplicationContext());
    }

    @Test
    public void testAutoClosable(){
        try (ClassPathXmlApplicationContext appContext =
                     new ClassPathXmlApplicationContext("classpath:app-context.xml");){
            System.out.println("test");
        }
    }
}
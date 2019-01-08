package appcontext.profile;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

import static org.junit.Assert.*;

public class ProfileTest {

    @Test
    public void test(){
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"production");
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext(new String[]{"classpath:app-context.xml"});
        Profile profile = appContext.getBean(Profile.class);
        System.out.println(profile.getTest());
    }
}
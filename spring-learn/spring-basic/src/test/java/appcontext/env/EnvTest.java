package appcontext.env;

import org.junit.Test;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.StandardEnvironment;

import java.util.Arrays;
import java.util.Locale;

public class EnvTest {

    @Test
    public void test(){
        //System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"test");
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext(new String[]{"classpath:app-context.xml"});
        StandardEnvironment environment = (StandardEnvironment) appContext.getEnvironment();
        System.out.println(environment.getPropertySources());
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
        System.out.println(environment.getProperty("${test.property}"));
        System.out.println(environment.getSystemProperties());
        environment.setIgnoreUnresolvableNestedPlaceholders(false);
        environment.resolvePlaceholders("");
        System.out.println(environment.resolvePlaceholders("${${spring.profiles.active}}:app-context.xml"));
    }
}

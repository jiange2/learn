package aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBean implements BeanNameAware, ApplicationContextAware {

    private String beanName;

    private ApplicationContext applicationContext;

    private void init(){
        System.out.println("init");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String getBeanName(){
        return beanName;
    }

    public ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}

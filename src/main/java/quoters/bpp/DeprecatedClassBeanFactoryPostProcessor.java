package quoters.bpp;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import quoters.DeprecatedClass;

@Component
public class DeprecatedClassBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    @SneakyThrows
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanNamesForAnnotation = beanFactory.getBeanNamesForAnnotation(DeprecatedClass.class);
        for (String beanName : beanNamesForAnnotation) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            DeprecatedClass annotation = Class.forName(beanDefinition.getBeanClassName()).getAnnotation(DeprecatedClass.class);
            String name = annotation.newClass().getName();
            beanDefinition.setBeanClassName(name);
        }
    }
}


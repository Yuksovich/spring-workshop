package quoters;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:quotes.properties")
@EnableAspectJAutoProxy
@EnableScheduling
@ComponentScan
@ComponentScan("never_use_switch")
public class Conf {
    @Bean
    public DataFactory dataFactory() {
        return new DataFactory();
    }
}

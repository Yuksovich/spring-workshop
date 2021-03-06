package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
@Qualifier("film")
@DeprecatedClass(newClass = T1000.class)
public class Terminator implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] words) {
        this.messages = Arrays.asList(words);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    @PreDestroy
    public void killAll(){
        System.out.println("You are terminated...");
    }
}

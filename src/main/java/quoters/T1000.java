package quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class T1000 implements Quoter {
    @Value("${T1000}")
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}

package never_use_switch;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public @interface Mailer {
    String value();
}


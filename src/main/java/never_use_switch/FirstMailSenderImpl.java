package never_use_switch;

import org.springframework.stereotype.Component;

@Component
@Mailer("1")
public class FirstMailSenderImpl implements MailSender {
    @Override
    public void sendMail() {
        System.out.println("Welcome mail was sent");
    }
}

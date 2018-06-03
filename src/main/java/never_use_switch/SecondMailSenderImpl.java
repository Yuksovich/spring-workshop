package never_use_switch;

@Mailer("2")
public class SecondMailSenderImpl implements MailSender {
    @Override
    public void sendMail() {
        System.out.println("don't call us we call you mail was sent");
    }
}

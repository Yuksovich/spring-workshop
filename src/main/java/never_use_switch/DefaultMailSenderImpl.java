package never_use_switch;

@Mailer("0")
public class DefaultMailSenderImpl implements MailSender {
    @Override
    public void sendMail() {
        System.out.println("Just do what you have to do");
    }
}

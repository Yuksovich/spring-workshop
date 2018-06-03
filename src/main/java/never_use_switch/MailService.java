package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Component
public class MailService {
    @Autowired
    private MailDao dao;
    @Autowired
    private Map<String, MailSender> mailSenderMap;


    @Scheduled(fixedRate = 1000)
    public void sendMail() {
        int i = dao.mailCode();
        MailSender mailSender = mailSenderMap
                .get(String.valueOf(i));
        if (mailSender == null) {
            mailSender = mailSenderMap.get(String.valueOf(0));
        }
        mailSender.sendMail();
    }
}

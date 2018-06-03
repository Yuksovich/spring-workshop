package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MailDaoImpl implements MailDao {
    @Autowired
    private DataFactory dataFactory;

    @Override
    public int mailCode() {
        return dataFactory.getNumberBetween(0, 3);
    }
}

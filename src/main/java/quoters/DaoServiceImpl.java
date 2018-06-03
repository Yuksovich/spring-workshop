package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import quoters.dao.Dao;
import quoters.dao.Derby;
import quoters.dao.Oracle;

import javax.annotation.PostConstruct;

@Component
public class DaoServiceImpl implements DaoService {
    @Autowired
    @Oracle
    private Dao oracle;

    @Autowired
    @Derby
    private Dao derby;

    @Override
    public void useOracle() {
        oracle.crud();
    }

    @Override
    public void useDerby() {
        derby.crud();
    }

    @PostConstruct
    public void saveData() {
        System.out.println("Using derby: ");
        useDerby();
        System.out.println("Using oracle: ");
        useOracle();
    }
}

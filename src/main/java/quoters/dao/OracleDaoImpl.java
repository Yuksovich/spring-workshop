package quoters.dao;

@Oracle
public class OracleDaoImpl implements Dao {
    @Override
    public void crud() {
        System.out.println("I'm oracle dao!");
    }
}

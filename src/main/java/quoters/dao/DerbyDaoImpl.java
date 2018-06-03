package quoters.dao;

import quoters.DatabaseRuntimeException;

@Derby
public class DerbyDaoImpl implements Dao {
    @Override
    public void crud() {
        System.out.println("I'm derby dao!");
        throw new DatabaseRuntimeException("Derby throws db runtime ex");
    }
}

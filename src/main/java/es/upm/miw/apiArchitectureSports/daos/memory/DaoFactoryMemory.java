package es.upm.miw.apiArchitectureSports.daos.memory;

import es.upm.miw.apiArchitectureSports.daos.DaoFactory;
import es.upm.miw.apiArchitectureSports.daos.SportDao;
import es.upm.miw.apiArchitectureSports.daos.UserDao;
import es.upm.miw.apiArchitectureSports.daos.UserSportDao;

public class DaoFactoryMemory extends DaoFactory {

	private UserDao  userDao;
	private SportDao sportDao;
	private UserSportDao usersportDao;

	public DaoFactoryMemory() {
	}


    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SportDao getSportDao() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserSportDao getUserSportDao() {
        // TODO Auto-generated method stub
        return null;
    }

}

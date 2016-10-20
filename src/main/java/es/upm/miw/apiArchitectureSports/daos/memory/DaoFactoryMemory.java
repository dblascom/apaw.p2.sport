package es.upm.miw.apiArchitectureSports.daos.memory;

import es.upm.miw.apiArchitectureSports.daos.DaoFactory;
import es.upm.miw.apiArchitectureSports.daos.ThemeDao;
import es.upm.miw.apiArchitectureSports.daos.VoteDao;

public class DaoFactoryMemory extends DaoFactory {

	private ThemeDao themeDao;
	private VoteDao voteDao;

	public DaoFactoryMemory() {
	}

	@Override
	public ThemeDao getThemeDao() {
		if (themeDao == null) {
			themeDao = new ThemeDaoMemory();
		}
		return themeDao;
	}

	@Override
	public VoteDao getVoteDao() {
		if (voteDao == null) {
			voteDao = new VoteDaoMemory();
		}
		return voteDao;
	}

}

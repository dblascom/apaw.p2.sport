package es.upm.miw.apiArchitectureSports.daos;

import java.util.List;

import es.upm.miw.apiArchitectureSports.entities.Vote;

public interface VoteDao extends GenericDao<Vote, Integer> {
	List<Integer> findValueByThemeId(int themeId);
}

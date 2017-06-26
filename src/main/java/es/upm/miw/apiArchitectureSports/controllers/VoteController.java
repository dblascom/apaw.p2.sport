package es.upm.miw.apiArchitectureSports.controllers;

import java.util.List;

import es.upm.miw.apiArchitectureSports.daos.DaoFactory;
import es.upm.miw.apiArchitectureSports.entities.Theme;
import es.upm.miw.apiArchitectureSports.entities.Vote;
import es.upm.miw.apiArchitectureSports.wrappers.VoteListWrapper;
import es.upm.miw.apiArchitectureSports.wrappers.VoteWrapper;

public class VoteController {

	public boolean createVote(int themeId, int vote) {
		Theme theme = DaoFactory.getFactory().getThemeDao().read(themeId);
		if (theme != null) {
			DaoFactory.getFactory().getVoteDao().create(new Vote(vote, theme));
			return true;
		} else {
			return false;
		}
	}

	public VoteListWrapper voteList() {
		List<Vote> votes = DaoFactory.getFactory().getVoteDao().findAll();
		VoteListWrapper voteListWrapper = new VoteListWrapper();
		for (Vote vote : votes) {
			voteListWrapper.addVoteWrapper(new VoteWrapper(vote.getTheme().getName(),vote.getValue()));
		}
		return voteListWrapper;
	}

}

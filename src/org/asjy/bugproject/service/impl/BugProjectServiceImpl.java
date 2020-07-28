package org.asjy.bugproject.service.impl;

import java.util.List;

import org.asjy.bugproject.BugProject;
import org.asjy.bugproject.dao.BugProjectDao;
import org.asjy.bugproject.daoimpl.BugProjectDaoImpl;
import org.asjy.bugproject.service.BugProjectService;

public class BugProjectServiceImpl implements BugProjectService {
	
	private BugProjectDao dao=new BugProjectDaoImpl();

	@Override
	public List<BugProject> searchBugProjects(BugProject bugProject) {
		
		return dao.getBugProject(bugProject);
		
	}

}

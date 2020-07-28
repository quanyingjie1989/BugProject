package org.asjy.bugproject.service;

import java.util.List;

import org.asjy.bugproject.BugProject;

public interface BugProjectService {
	
	List<BugProject> searchBugProjects(BugProject bugProject);

}

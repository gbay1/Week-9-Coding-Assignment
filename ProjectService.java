package projects.service;

import projects.dao.ProjectDao
import projects.entity.Project;

public class ProjectService {
	public class Project {

		public void setProjectId(Integer projectId) {
			
		}

		public Object getProjectName() {
			return null;
		}

		public Object getEstimatedHours() {
			return null;
		}

		public Object getActualHours() {
			return null;
		}

		public Object getDifficulty() {
			return null;
		}

		public Object getNotes() {
			return null;
		}
	
	}

	private ProjectDao projectDao = new ProjectDao();
	
	/**
	 * This method simply calls the DAO class to insert a project row.
	 *
	 *@param project the {@link Project} object.
	 *@return The project object with the newly generated primary key value.
	 */
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
}

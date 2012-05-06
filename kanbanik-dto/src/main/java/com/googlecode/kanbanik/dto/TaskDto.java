package com.googlecode.kanbanik.dto;

public class TaskDto implements KanbanikDto {

	private static final long serialVersionUID = -853427196900411746L;

	private String id;

	private String name;

	private String description;

	private ClassOfService classOfService;

	private String ticketId;

	private WorkflowitemDto workflowitem;

	private ProjectDto project;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ClassOfService getClassOfService() {
		return classOfService;
	}

	public void setClassOfService(ClassOfService classOfService) {
		this.classOfService = classOfService;
	}

	public WorkflowitemDto getWorkflowitem() {
		return workflowitem;
	}

	public void setWorkflowitem(WorkflowitemDto workflowitem) {
		this.workflowitem = workflowitem;
	}

	public ProjectDto getProject() {
		return project;
	}

	public void setProject(ProjectDto project) {
		this.project = project;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskDto other = (TaskDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
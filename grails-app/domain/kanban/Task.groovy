package kanban

import kanban.user.User


class Task {
	Project project
	User creator
	User assignee
	
	String name	
	String status = "open"
	
	Date dateCreated
	Date lastUpdated
		
    static constraints = {
		project nullable: false
		name nullable: false
		creator nullable: false
		
		status inList: ['open', 'closed']
    }
}

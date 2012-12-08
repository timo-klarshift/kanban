package kanban

import kanban.user.User


class Project {
	User creator
	String name
	
	Date dateCreated
	Date lastUpdated

    static constraints = {
		creator nullable: false
		name nullable: false, blank: false, minSize: 3
    }
	
	public String toString(){
		"$name"
	}
}

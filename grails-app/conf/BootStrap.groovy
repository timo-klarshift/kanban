import kanban.user.Role
import kanban.user.User
import kanban.user.UserRole



class BootStrap {

    def init = { servletContext ->
		def users = [
			'timo', 'niels'			
		]
		
		// 
		def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER')
		userRole.save(flush: true)
		
		users.each { u ->
			def user = User.findByUsername(u)
			if(!user){
				user = new User(username: u, password: u).save(flush: true, failOnError: true)
				UserRole.create(user, userRole)
			}			
		}
		
		// admin stuff
		def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN')
		adminRole.save(flush: true)
		
		def admin = User.findByUsername('admin') 
		if(!admin){
			admin = new User(username: 'admin', password: 'admin')
			admin.save(flush: true)		
			UserRole.create(admin, adminRole)
			UserRole.create(admin, userRole)
		}
    }
    def destroy = {
    }
}

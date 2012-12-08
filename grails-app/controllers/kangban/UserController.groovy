package kangban

import grails.plugins.springsecurity.Secured
import kanban.user.User

@Secured('ROLE_ADMIN')
class UserController {

   def scaffold = User
}

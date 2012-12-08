package kangban

import grails.plugins.springsecurity.Secured
import kanban.user.Role

@Secured('ROLE_ADMIN')
class RoleController {

   def scaffold = Role
}

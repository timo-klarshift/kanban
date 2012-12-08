package kangban

import kanban.Task;
import grails.plugins.springsecurity.Secured


@Secured('ROLE_USER')
class TaskController {

    def scaffold = Task
}

package example.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import example.service.user.UserListService
import example.util.Response

@RestController
class UserController {
  @Autowired
  lateinit var userListService: UserListService

  @GetMapping("/users")
  fun getUsers(): Response {
    return userListService.execute()
  }
}

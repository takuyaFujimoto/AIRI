package example.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import example.entity.User
import example.service.common.LoginService
import example.util.Response
import example.util.Request

@RestController
class CommonController {
  @Autowired
  lateinit var loginService: LoginService

  @PostMapping("/login")
  fun login(@RequestBody req: Request): Response {
    return loginService.execute(req)
    // val result: User = loginService.execute(req)
    // if (result != null) {
    //   return Response("success", result)
    // } else {
    //   return Response("success", "", "E001")
    // }
  }
}

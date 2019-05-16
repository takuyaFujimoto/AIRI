package example.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.DeleteMapping

// DELETE APIのサンプル
@RestController
class SampleDeleteController {

  @DeleteMapping("/")
  fun test(): String {
    return "DELETEリクエスト成功"
  }
}
package example.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping

// POST APIのサンプル
@RestController
class SamplePostController {

  @PostMapping("/")
  fun test(): String {
    return "POSTリクエスト成功"
  }
}
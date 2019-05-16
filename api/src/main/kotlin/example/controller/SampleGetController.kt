package example.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

// GET APIのサンプル
@RestController
class SampleGetController {

  @GetMapping("/")
  fun test(): String {
    return "GETリクエスト成功"
  }
}
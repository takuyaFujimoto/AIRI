package example.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PutMapping

// PUT APIのサンプル
@RestController
class SamplePutController {

  @PutMapping("/")
  fun test(): String {
    return "PUTリクエスト成功"
  }
}
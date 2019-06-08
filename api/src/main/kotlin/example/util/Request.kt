package example.util

data class Request(
  // 飛ばすパラメーター全部ここで定義しておく
  var login_name: String? = "",
  var password: String? = ""
)
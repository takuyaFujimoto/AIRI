package example.repository

import example.entity.User
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface UserRepository {
  @Select("SELECT * FROM user WHERE login_name = #{login_name} AND vaild <> 0")
  fun selectUserByLoginName(@Param("login_name") login_name: String?): User
}

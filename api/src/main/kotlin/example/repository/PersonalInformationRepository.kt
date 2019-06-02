package example.repository

import kotlin.collections.List
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Repository
import example.entity.PersonalInformation

@Mapper
@Repository
interface PersonalInformationRepository {
  @Select(
    "SELECT *",
    "FROM personal_information",
    "WHERE user_id IN",
    "(SELECT id FROM `user` WHERE vaild <> 0)"
  )
  fun selectUsers(): List<PersonalInformation>
}

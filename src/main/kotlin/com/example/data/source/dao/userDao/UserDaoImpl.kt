package com.example.data.source.dao.userDao

import com.example.data.dto.user.UserDto
import com.example.data.mapper.toUserEntity
import com.example.data.tables.authTables.UserTable
import com.example.db.user
import com.example.domin.mapper.userMapper.toUserDto
import com.example.utils.checkIfExistByName
import org.ktorm.database.Database
import org.ktorm.dsl.*
import org.ktorm.entity.add
import org.ktorm.entity.find
import org.ktorm.entity.singleOrNull

class UserDaoImpl constructor(
    private var dataBase: Database,
) : UserDao {

    override suspend fun checkIfUserExistByName(username: String): Boolean {
        return dataBase.checkIfExistByName(UserTable.userName, username)
    }

    override suspend fun getUserByUserName(userName: String): UserDto? {
        return dataBase.user.find { UserTable.userName eq userName }?.toUserDto()
    }

    // ? this not here
    override suspend fun insertUser(user: UserDto): Boolean {
        return dataBase.user.add(user.toUserEntity()) == 1
    }

    override suspend fun updateUserPassword(user: UserDto): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteUser(username: String): Boolean {
        TODO("Not yet implemented")
    }


}//    override suspend fun getUserByUserName(username: String): UserDto {
//        return dataBase.from(UserTable).select()
//            .where { UserTable.userName eq username }.map { row ->
//                UserDto(
//                    userId = row[UserTable.userId]!!,
//                    userRole = row[UserTable.userRole]!!,
//                    username = row[UserTable.userName]!!,
//                    userPassword = row[UserTable.userPassword]!!,
//                    userSalt = row[UserTable.userSalt]!!
//                )
//       
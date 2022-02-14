
package com.example.data.source.dao.userDao

import com.example.data.dto.user.UserDto

interface UserDao {

    suspend fun insertUser(user: UserDto): Boolean

    suspend fun updateUserPassword(user: UserDto): Boolean

    suspend fun deleteUser(username: String): Boolean

    suspend fun checkIfUserExistByName(username: String): Boolean

    suspend fun getUserByUserName(userName: String): UserDto?

}
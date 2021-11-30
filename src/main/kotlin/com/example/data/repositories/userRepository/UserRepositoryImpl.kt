package com.example.data.repositories.userRepository

import com.example.data.dto.user.UserDto
import com.example.data.source.dao.userDao.UserDao


class UserRepositoryImpl constructor(
    private var userDao: UserDao,
) : UserRepository {

    override suspend fun getUserByUserName(username: String): UserDto? {
        return userDao.getUserByUserName(userName = username)
    }
//
//    override suspend fun getListOfRolesName(): List<RoleDt
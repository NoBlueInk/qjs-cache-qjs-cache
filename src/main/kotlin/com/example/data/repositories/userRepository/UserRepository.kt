package com.example.data.repositories.userRepository

import com.example.data.dto.user.UserDto

interface UserRepository {

//    suspend fun getUserByUserName(username: String): UserDto?
//
//    suspend fun getListOfRolesName(): List<RoleDto>
//
//    suspend fun checkIfRoleExistByRoleId(roleId :Int): Boolean
//
//    suspend fun getWhatIsTheUserPermissionsByUserRole(userRole:String):List<PermissionDto>

    suspend fun checkIfUserExistByName(username: String): Boolean

    suspend fun insertUser(user: UserDto): Boolean

//    suspend 
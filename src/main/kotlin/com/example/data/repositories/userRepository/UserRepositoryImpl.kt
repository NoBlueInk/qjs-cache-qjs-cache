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
//    override suspend fun getListOfRolesName(): List<RoleDto> {
//        return dataBase.from(RolesTable).select()
//            .map { row ->
//                RoleDto(
//                    RolesId = row[RolesTable.RolesId]!!,
//                    RolesName = row[RolesTable.RolesName]!!,
//                    RolesDescription = row[RolesTable.RolesDescription]!!,
//                )
//            }
//    }
//
//    override suspend fun checkIfRoleExistByRoleId(roleId: Int): Boolean {
//        return dataBase.from(RolesTable).select()
//            .where { RolesTable.RolesId eq roleId }
//            .map { }.isNotEmpty()
//    }
//
//    override suspend fun getWhatIsTheUserPermissionsByUserRole(userRole: String): List<PermissionDto> {
//        TODO("Not yet implemented")
//    }

    override suspend fun checkIfUserExistByName(username: String): Boolean {
        return userDao.checkIfUserExistByName(username)
    }

    override suspend fun insertUser(user: UserDto): Boolean {
        return userDao.insertUser(user = user)
    }

//    override suspend fun updateUserPassword(user: UserDto): Boolean {
//        val updateUserPassword = dataBase.update(UserTable) { row ->
//            set(row.userPassword, user.userPassword)
//            set(row.userSalt, user.userSalt)
//            where { row.userId eq user.userId }
//        }
//        return updateUserPassword == 1
//    }

    override suspend fun deleteUser(username: String): Boolean {
//        val deleteUser = dataBase.delete(UserTable) { row ->
//            row.userName eq username
//        }
//        return deleteUser == 1
        TODO("Not yet implemented")
    }
}


/* Insert User
        val existingUser = dataBase.from(UserTable).select(UserTable.userId)
//            .where { UserTable.userName eq user.username }
//            .map {}.size
//
//
//
//        return if (existingUser == 0) {
//            val result = dataBase.insert(UserTable) { userTable ->
//                set(userTable.userRole, user.userRole)
//                set(userTable.userName, user.username)
//                set(userTable.userPassword, user.userPassword)
//                set(userTable.userSalt, user.userSalt)
//            }
//            return result == 1
//        } else false
*/
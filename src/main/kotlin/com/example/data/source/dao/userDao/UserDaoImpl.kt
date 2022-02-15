package com.example.data.source.dao.userDao

import com.example.data.dto.user.UserDto
import com.example.data.mapper.toUserEntity
import com.example.data.tables.authTables.UserTable
import com.example.db.user
import com.example.domin.mapper.userMapper.toUserDto
import com.example.utils.checkIfExistByName
import org.ktorm.databas
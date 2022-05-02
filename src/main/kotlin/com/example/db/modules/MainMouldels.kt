package com.example.db.modules

import com.example.data.repositories.userRepository.UserRepository
import com.example.data.repositories.userRepository.UserRepositoryImpl
import com.example.data.source.dao.userDao.UserDao
import com.example.data.source.dao.userDao.UserDaoImpl
import com.example.domin.useCases.SignInUseCase
import com.example.domin.useCases.SignUpUseCase
import com.example.security.HashingService
import com.example.security.SHA256HashingServiceImpl
import com.example.utils.Constants
import org.koin.dsl.module
import or
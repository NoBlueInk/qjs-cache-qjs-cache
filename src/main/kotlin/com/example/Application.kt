
package com.example

import com.example.db.modules.mainModule
import com.example.token.TokenConfig
import io.ktor.server.application.*
import com.example.plugins.*
import com.example.plugins.routing.userConfigRouting
import com.example.plugins.routing.productsConfigRouting
import com.example.plugins.routing.stockAppConfigurationRouting
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.koin.ktor.plugin.Koin

fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        module()
    }.start(wait = true)
}

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
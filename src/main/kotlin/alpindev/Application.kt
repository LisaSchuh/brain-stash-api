package alpindev

import alpindev.plugins.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.module() {
    configureSerialization()

    routing {
        get("/") {
            call.respondText("Hello, world!")
        }
    }
}
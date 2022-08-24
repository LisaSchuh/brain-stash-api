package alpindev

import alpindev.api.noteRouting
import alpindev.plugins.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.module() {
    configureSerialization()


    routing {
        noteRouting()
        get("/") {
            call.respondText("Hello, world!")
        }
    }
}
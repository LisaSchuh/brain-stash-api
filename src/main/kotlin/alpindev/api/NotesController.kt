package alpindev.api
import alpindev.api.dtos.Note
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

val notes = listOf<Note>(Note("this is a text"), Note("this is another text"))

fun Route.noteRouting() {
    route("/notes") {
        get {
            call.respond(notes)
        }
        get("{id?}") {

        }
        post {

        }
        delete("{id?}") {

        }
    }
}

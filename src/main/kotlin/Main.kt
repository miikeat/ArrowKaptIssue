
import arrow.core.raise.Effect
import arrow.core.raise.effect
import arrow.core.raise.fold

data class MyError(val cause: String, val exception: Throwable)

class ExampleImpl {
    fun example(): Effect<MyError,String> {
        TODO("Not yet implemented")
    }
}

suspend fun main() {
    val exampleImpl = ExampleImpl()
    effect {
        exampleImpl.example().bind()
    }.fold({ throw it.exception }, {})
}

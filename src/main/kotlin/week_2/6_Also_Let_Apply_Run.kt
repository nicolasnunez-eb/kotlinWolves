package week_2

class Config {
    var host: String = "localhost"
    var port: Int = 8080
    var connectionType: String = "http"
    private var foo = 12

    fun println() = println(this)

    private fun printPrivate() = println(this)
}

fun example() {
    val config = Config().apply {
        port = 8081
        host = "asdasd"
    }

    val foo: String? = null

    run {

    }

}
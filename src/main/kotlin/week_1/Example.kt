package week_1

class Word {
    private fun wordLength(word: String): String {
        val wordLength = word.length
        val result = when {
            wordLength < 5 -> "short"
            wordLength in 5..9 -> "medium"
            else -> "long"
        }
        return result
    }

    fun print() {
        println(wordLength(""))
    }
}


class Foo(val word: Word) {

    fun print() {
        word.print()
    }
}


class Car(private val age: Int, private val model: String = "asdsa") {
    fun blabla(title: String) {
        println(age)
        println(model)
        println(title)
    }
}

object Development {
    fun baz() {
        val car = Car(20)
        val event = Event(12)
        event.publicId
        car.blabla("asdasd")
    }
}

class Event(private val id: Int) {

    val publicId: String
        get() {
            return (id * 1007).toString()
        }
}

enum class Status(val displayName: String) {
    LIVE("Live"),
    DRAFT("Draft"),
    CANCELLED("Cancelled"),
}

fun foo(status: Status?): String {
    println(status?.displayName)
    return when (status) {
        Status.LIVE -> "pepito"
        Status.DRAFT -> "another"
        Status.CANCELLED -> "ll"
        else -> "asd"
    }
}

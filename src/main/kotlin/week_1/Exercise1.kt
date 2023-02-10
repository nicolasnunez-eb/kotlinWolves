package week_1

import java.time.LocalDate

//1. Create a function that receives a string and reverse it
fun rev(value: String): String = value.reversed()


//2. Create a function that receives a string and:
//* Prints `short` if the string has a length less than 5
//* Prints `medium` if the string has a length between 5 and 10
//* Prints `long` if the string has a length more than 10
fun sizes(value: String): String {
    val valueLength: Int = value.length
    return when {
        valueLength < 5 -> "short"
        valueLength in 5..10 -> "medium"
        else -> "long"
    }
}


//3. Create a Ticket class with the following attributes
//* id -> string
//* purchase value -> int
//* event date -> date
//* door -> string
class Ticket(private val id: String, val value:Int, val eventDate: LocalDate? = LocalDate.now(), val door: String) {
    fun getId(): String {
        return "EVB-${this.id}"
    }
}


//4. Create an object that handles logging
enum class LogLevel {
    DEBUG,
    WARNING,
    ERROR
}

object Logger {
    private fun log(level: LogLevel, message: String) {
        println("[${level.name}] $message")
    }

    fun debug(message: String) = this.log(LogLevel.DEBUG, message)
    fun warning(message: String) = this.log(LogLevel.WARNING, message)
    fun error(message: String) = this.log(LogLevel.ERROR, message)
}


//5. Create an enum class for different event statuses
//* Handle the event statuses in a when expression
//* Obtain an event status from a string
enum class Status {
    APPROVED,
    PENDING,
    DENIED;

    override fun toString() : String {
        return when (this) {
            APPROVED -> "Aprobado"
            PENDING -> "Pendiente"
            DENIED -> "Denegado"
        }
    }
}


//6. Create a function that returns a ticket instance given a condition or null if that condition is not achieved
fun getTicketOrNull (eventDate: LocalDate) : Ticket? {
    return if (eventDate < LocalDate.now()) {
        null
    } else {
        Ticket("123", 23, LocalDate.now().plusDays(1),"12 A")
    }
}

//7. Create a function that handles the previous function and print the ticket information or print `NOT_FOUND`
fun printTicketOrNotFound(ticket: Ticket?) = if (ticket != null) {
    println("[TICKET -> ${ticket.getId()}] Event Date: ${ticket.eventDate} - Door: ${ticket.door}")
} else {
    print ("NOT_FOUND")
}
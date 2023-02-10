import week_1.Status
import week_1.getTicketOrNull
import week_1.printTicketOrNotFound
import java.time.LocalDate

fun main(args: Array<String>) {
    println ("Exercise 1")
    val word = "murcielago"
    val reversed = week_1.rev(word)
    println ( "word -> $word | rev -> $reversed")
    // ---
    println ("Exercise 2")
    val wordSize = week_1.sizes(word)
    println("word -> $word | size -> $wordSize")
    // ---
    println ("Exercise 3")
    val ticket = week_1.Ticket(id="123", value=23, door="B 4")
    println("Ticket -> $ticket")
    // ---
    println ("Exercise 4")
    val logger = week_1.Logger
    logger.debug("hola mundo")
    logger.warning("cuidado mundo")
    logger.error("se rompio el mundo")
    // ---
    println ("Exercise 5")
    println ("Status OK -> ${Status.APPROVED.toString()}")
    println ("Status WAIT -> ${Status.PENDING.toString()}")
    println ("Status NO -> ${Status.DENIED.toString()}")
    // ---
    println ("Exercise 6")
    val now = LocalDate.now()
    val ticketOk = getTicketOrNull(now)
    val ticketNull = getTicketOrNull(now.minusDays(1))
    println ("Ticket OK -> $ticketOk")
    println ("Ticket NULL -> $ticketNull")
    // ---
    println ("Exercise 7")
    printTicketOrNotFound(ticketOk)
    printTicketOrNotFound(ticketNull)
}

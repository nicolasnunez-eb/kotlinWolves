import week_1.Status
import week_1.getTicketOrNull
import week_1.printTicketOrNotFound
import java.time.LocalDate

fun main(args: Array<String>) {
    println ("Exercise 1")
    val reversed = week_1.rev("hola")
    println ( "word -> hola | rev -> $reversed")
    // ---
    println ("Exercise 2")
    val wordSize = week_1.sizes("murcielago")
    println("word -> murcielago | size -> $wordSize")
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
    val status_ok = Status.APPROVED
    val status_pend = Status.PENDING
    val status_nope = Status.DENIED
    println ("Status OK -> ${status_ok.toString()}")
    println ("Status WAIT -> ${status_pend.toString()}")
    println ("Status NO -> ${status_nope.toString()}")
    // ---
    println ("Exercise 6")
    val now = LocalDate.now()
    val yesterday = LocalDate.now().minusDays(1)
    val ticket_ok = getTicketOrNull(now)
    val ticket_no = getTicketOrNull(yesterday)
    println ("Ticket OK -> $ticket_ok")
    println ("Ticket NULL -> $ticket_no")
    // ---
    println ("Exercise 7")
    printTicketOrNotFound(ticket_ok)
    printTicketOrNotFound(ticket_no)
}


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
    val approvedStr = Status.APPROVED.toString()
    val pendingStr = Status.PENDING.toString()
    val deniedStr = Status.DENIED.toString()
    val approved = week_1.getStatus(approvedStr)
    val pending = week_1.getStatus(pendingStr)
    val denied = week_1.getStatus(deniedStr)
    println ("Status Approved -> toStr: $approved | fromStr -> ${approved}")
    println ("Status Pending -> toStr: $pending | fromStr -> ${pending}")
    println ("Status Denied -> toStr: $denied | fromStr -> ${denied}")
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

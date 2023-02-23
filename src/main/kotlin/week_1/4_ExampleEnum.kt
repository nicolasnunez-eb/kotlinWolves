package week_1

/*
    The syntax for enums is almost the same as other languages.
 */

enum class EventStatus {
    DRAFT,
    PUBLISHED,
    CANCELLED,
}

/*
    Something cool with enums is that if we use them along with `when` expression we can have a robust
    pattern matching system which will alert us if we are missing some specific branch of our enums
 */


/*
    If we do not provide every enum case in our `when` expression the compiler will alert us.
    Also, the compiler will enforce us to add the missing branches.
 */
fun handleEventStatus(status: EventStatus): String = when (status) {
    EventStatus.DRAFT -> "Event is draft"
    EventStatus.PUBLISHED -> "Event is published"
    EventStatus.CANCELLED -> "Event is cancelled"
}

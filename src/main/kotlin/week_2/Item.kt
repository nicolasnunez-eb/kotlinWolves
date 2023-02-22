package week_2

class Item(private val price: Int) {

    fun applyDiscount(
        foo: String,
        bar: Int,
        discount: (Int) -> Double,
    ): Double = discount(price)
}


/* Lambdas replace this */
interface Discount {
    fun applyDiscount()
}


class NoDiscount: Discount {
    override fun applyDiscount() {
        TODO("Not yet implemented")
    }
}


data class Ticket(val id: Int, val name: String, val name2: Long? = null, val name3: Double? = null)

fun handleTicket(foo: (Ticket, Ticket) -> String): String {
    return foo(Ticket(12, "asd"), Ticket(123, "asd"))
}
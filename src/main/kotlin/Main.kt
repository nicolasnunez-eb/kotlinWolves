import week_2.Item
import week_2.handleTicket

fun main(args: Array<String>) {
    println("Hello world")
    val item = Item(10)
    item.applyDiscount("", 10) { price -> price * 0.5 }
    item.applyDiscount("", 10) { it * 0.5 }

    handleTicket { (_, name), (_, name1) -> name + name1 }
}

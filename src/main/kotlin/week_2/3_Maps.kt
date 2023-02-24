package week_2


/*
    Maps in Kotlin are a key, value data structure and as `List` and `Set` we have
    1. MutableMap
    2. Map
    And the difference between them is the same, the mutable one can be altered while the other one no.

    We should try to always use `Map`.
 */

fun exampleMap() {
    val shoppingList = mutableMapOf(
        "eggs" to 5,
        "bread" to 1,
        "yogurt" to 3
    )
    val tools = mapOf(
        "hammer" to 1,
        "screws" to 20,
    )

    /* with MutableMap we can remove elements, edit elements and add new ones */
    println(shoppingList)
    shoppingList.remove("bread")
    println(shoppingList)
    shoppingList["noodles"] = 5
    println(shoppingList)
    shoppingList["eggs"] = 12
    println(shoppingList)

    /* with Map we cannot remove, update or add elements because Map interface doesn't support those operations */
//    println(shoppingList)
//    tools.remove("screws")
//    println(shoppingList)
//    tools["hammer"] = 5
//    println(shoppingList)
//    tools["screwdriver"] = 12
//    println(shoppingList)
}

/*
    Also Map and MutableMap also support High order functions like map, filter, etc.
    These HOF receives a lambda that has 1 parameter which is type `Entry`. This object
    has attribute `key` and `value`.
    One thing that we can do in this case is `destructure` the Entry object
*/

val tools = mapOf(
    "hammer" to 1,
    "screws" to 20,
)

fun exampleMap2(): Map<String, Int> {
    /* In this case we use `it` which is the `Entry` object and then access to its attribute `key` */
//    return tools.filter { it.key == "hammer" }

    /* In this case we `destructure` the `Entry` object and obtain only the key attribute */
    return tools.filter { (key, _) -> key == "hammer" }
}

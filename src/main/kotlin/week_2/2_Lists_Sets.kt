package week_2

/*
    As we saw earlier we have 2 types of Lists in kotlin
    1. `MutableList`
    2. `List`
    Both of them are interfaces that implements `Collection` interface. The key difference between both lists
    is that the mutable one can be altered at any time either adding new elements or removing elements.

    Kotlin suggest to use as much as possible `List`
 */


fun exampleList() {
    val ips = listOf("120.0.0.1", "15.0.1.2")
    val hosts = mutableListOf("localhost", "google.com")

    /* hosts can be altered */
    println(hosts)
    hosts.remove("localhost")
    println(hosts)
    hosts.add("youtube.com")
    println(hosts)

    /* ips cannot be modified, it does not compile because `List` interface doesn't have those methods */
//    println(hosts)
//    ips.remove("localhost")
//    println(hosts)
//    ips.add("youtube.com")
//    println(hosts)
}

/*
    Something cool that we can do with `List` and `MutableList` is that we can operate them, they both bring
    really cool methods that simplifies some common algorithms. Let's see some of them
    1. map
    2. filter
    3. count
    4. reduce
    5. groupBy
    6. sum

    One important note about these operators is that they promote immutability (that comes from functional programming)
    This means that these operations doesn't alter the original list, instead they create a new list with the result
    of the operation.
 */

val exampleList = listOf(
    "dinosaur",
    "is",
    "dog",
    "ownership",
    "sun",
    "parents",
    "park",
    "programming",
    "awesome",
    "cumbersome"
)

fun exampleListOperators(): Map<Int, List<String>> {
    /*
        This function will:
        1. Make every word uppercase
        2. Take only words that have more than 4 letters
        3. Group them by letter quantity
    */
    val result = exampleList
        .map { it.uppercase() }
        .filter { it.length > 4 }
        .groupBy { it.length }
    println(result)
    return result
}

fun exampleListOperators2(): Int {
    /*
        This function will:
        1. Take only words that have more than 4 letters
        2. Count the amount of words that satisfies the above condition
    */
    val result = exampleList.count { it.length > 4 }
    println(result)
    return result
}

fun exampleListOperators3(): Int {
    /*
        This function will:
        1. Take only words that have more than 4 letters
        2. Sum the total amount of letters
    */
    val result = exampleList
        .filter { it.length > 4 }
        .sumOf { it.length }
    println(result)
    return result
}

fun exampleListOperators4(): String {
    /*
        This function will:
        1. Make every word uppercase
        2. Concatenate the words with a "-" in the middle
    */
    val result = exampleList
        .map { it.uppercase() }
        .reduce { acc, nextWord -> "$acc-$nextWord" }
    println(result)
    return result
}

package week_1


/*
    Kotlin has the classic `if` conditional and also the `when` conditional that
    can be used as a switch statement but with steroids.

    The key difference between these conditionals and the traditional ones is that
    the Kotlin ones are expressions and not pure language control structures. What does this implies ?
    Expressions can be used on returns or variable assignment as you do with any other operation like `+`, `-`, etc.
*/

fun exampleIf(number: Int): String {
    // The traditional way
//    if (number > 10)
//        return "Is greater than 10"
//    else
//        return "Is less than 10"

    // Using expression syntax
    return if (number > 10) "Is greater than 10" else "IS less than 10"
}

fun exampleIf2(number: Int): Int {
    // The traditional way using `var` for variable assignment
//    var newNumber = 0
//    if (number > 10)
//        newNumber = number
//    else
//        newNumber = -1
//    return newNumber

    // Using expression syntax for variable assignment
    val newNumber = if (number > 10) number else -1
    return newNumber
}

/*
    Every `when` needs to be exhaustive in order to handle every possible value evaluated.
    That's why we need the else branch here.
*/
fun exampleWhen(number: Int): String {
    // Instead of returning the value in each `case` we can just do 1 return
//    when(number) {
//        1 -> return "One"
//        2 -> return "Two"
//        else -> return "Outbound"
//    }
    return when (number) {
        1 -> "One"
        2 -> "Two"
        else -> "Outbound"
    }
}

fun exampleWhen2(number: Int): String = when (number) {
    1 -> "One"
    else -> "Outbound"
}


// `when` with conditions
fun exampleWhen4(number: Int): String = when {
    number > 10 -> "Greater than 10"
    number <= 10 -> "Less equal than 10"
    else -> "Unknown"
}

fun exampleWhen5(number: Any): String = when (number) {
    is Int -> "Number is Int"
    is Double -> "Number is Double"
    else -> "Unknown"
}

fun exampleWhen6(number: Int): String = when (number) {
    in listOf(1, 2) -> "Number is in 1, 2"
    in listOf(3, 4, 5) -> "Number is in 3, 4, 5"
    else -> "Number is not on any list"
}

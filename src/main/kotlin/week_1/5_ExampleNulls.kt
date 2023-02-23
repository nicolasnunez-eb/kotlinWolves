package week_1

/*
    Kotlin has null safety which means that types by default cannot contain null values.
    This makes our life easier and our code will avoid those horribles NullPointerException.

    If we know that something can contain a null value we have to make it explicit in our type system.
    This comes with the syntax `?` in our types. If we add `?` at the end of our types we are saying that
    our variable can contain a null value.
*/

fun nullExample(number: Int?): Int {
//    return number + 10 # We can't do this, the compiler alert us that number can be null.
    if (number == null)
        throw IllegalArgumentException("Number is null")
    return number + 10
}

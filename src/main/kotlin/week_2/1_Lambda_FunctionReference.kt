package week_2

/*
    In Kotlin functions are first class citizens which means that a function here is also an object.
    Thanks to that we can pass functions as arguments, use them as attributes in our classes, etc.

    How can I pass functions as parameters ? In this scenario is where lambdas came in.
    Lambdas are anonymous functions, which means that you can create them on the fly without providing
    a function name.
    The syntax for lambdas is the following:
    1. For the side that requires a lambda is: `fun foo(lambdaFunction: (Int) -> String)`. The type of `lambdaFunction`
    parameter is `(Int) -> String` which means that it takes any function that receives an Int and returns a String
    2. From the client side we have 2 ways of calling it:
        2.1 foo { number -> number.toString() }
        2.2 foo { it.toString() } <-- Preferred way for lambdas that has 1 parameter, it represents the unique argument
        received.
    Notice that when we call a function that receives a lambda the syntax is quite different from a traditional
    function call, in this case we use `{}` instead of `()`.
*/



fun exampleLambda() {
    /*
        In this our lambda is a "provider" which means that it takes no arguments
        and provides a new element, in this case a String
    */

    fun printWord(obtainWord: () -> String) {
        println(obtainWord())
    }

    printWord { "Some special word" }
    printWord { "Nothing" }
    printWord { "Something" }
}

fun exampleLambda2() {
    /*
        In this our lambda is a "consumer" which means that it takes N arguments
        and do some side effect (external operation), in this case printing a word
    */

    fun passWord(wordHandler: (String) -> Unit) {
        println(wordHandler("Nothing"))
        println(wordHandler("Special"))
        println(wordHandler("Here"))
    }

    passWord { word -> println(word) } // <-- this syntax is not suggested for 1 argument lambdas
    passWord { println(it) } // <-- this one yes 👍🏼
    passWord { println(it) }
}


/*
    Besides that we can pass anonymous functions as arguments we can also reuse existent functions or methods
    and pass them as arguments to other functions that expect functions as arguments.

    Pss: Functions that receives other functions as arguments are called HIGH ORDER FUNCTIONS (HOF).
 */

class Event(private val id: Int) {
    val publicId: Int
        get() = id * 1007
}

fun numberProvider(): Int = 5000


fun exampleFunctionReference() {
    /*
        We have a function that receives a provider of Int.
        If we want to reuse publicId getter or numberProvider function
        we have to pass the reference of them.
        To do that we have to use the `::` syntax as below
     */

    fun printNumber(numberProvider: () -> Int) {
        println(numberProvider())
    }

    printNumber(::numberProvider)

    val event = Event(10)
    printNumber(event::publicId)
}
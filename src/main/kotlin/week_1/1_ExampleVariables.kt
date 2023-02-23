package week_1

/*
    Kotlin has 2 ways of defining variables:
    1. VAR: `var` enables your variable to be modified at any type, so we can say that your variable is "mutable"
    2. VAL: `val` on the other sides doesn't let you modify your variable, it can only be initialized one time,
    so we call it "immutable".

    Kotlin recommends to use `val` always, just use `var` if it is the last thing that you can do to solve your problem.
*/


fun varExample() {
    var foo = 15
    print(foo)
    foo = 16
    print(foo)
}


fun valExample() {
    val foo = "hello"
    print(foo)
//    foo = "bye" # this will throw a compile error since `val` variable cannot be modified
}

/*
    Besides that you use `val` some data structures are mutable in their behaviour
    For example you can have `MutableList` or `MutableMap` which allows you to alter the internal state of them.
*/

fun valExample2() {
    val vegetablesBag = mutableListOf("tomato", "potato", "lettuce")
//    vegetablesBag = mutableListOf("eggplant") # I cannot reassign `vegetablesBag` because it's a `val` 👍🏼
    vegetablesBag.add("eggplant")  // But I can mutate the list since this MutableList allow me to do that 😔
}

/*
    As we have `MutableList`, `MutableSet`, `MutableMap` we have their counterparts that are immutable, these are:
    1. List
    2. Set
    3. Map
    As we said, these data structures are immutable, so we cannot alter their internal state from outside. The only
    thing that we can do is operate over them either filtering, mapping (transforming their internal elements), etc.
    These operations give us a new immutable list.

    Kotlin recommends to use immutable list as always as you can.
*/


fun valExample3() {
    val fruitsBag = listOf("apple", "banana", "orange")
//    fruitsBag = mutableListOf("eggplant") # I cannot reassign `fruitsBag` because it's a `val` 👍🏼
//    fruitsBag.add("eggplant")  # I cannot mutate the list since this is a `List` 👍🏼

    // If I want to add a new fruit I have to generate a new list using the immutable list to operate over it
    val updatedFruitBag = fruitsBag + listOf("watermelon")
    print(updatedFruitBag)
}

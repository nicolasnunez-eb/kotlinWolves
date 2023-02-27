package week_2


operator fun String.invoke(test: () -> Unit) {
    test()
}

fun Int.shouldBe(other: Int) {

}


fun test(unitTest: () -> Unit) {
    unitTest()
}

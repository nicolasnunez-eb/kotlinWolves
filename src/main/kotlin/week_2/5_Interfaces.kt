package week_2

interface Foo {
    fun speak(word: String)
}

interface Baz {
    fun talk(word: String)
}

class Bla : Foo, Baz {
    override fun speak(word: String) {
        TODO("Not yet implemented")
    }

    override fun talk(word: String) {
        TODO("Not yet implemented")
    }
}


sealed class Package(val name: String)


class Premium : Package("PREMIUM")
class Regular : Package("REGULAR")


fun handlePackage(pkg: Package) = when(pkg) {
    is Premium -> println(pkg)
    is Regular -> println(pkg)
}

package week_1

import java.util.logging.Logger


/*
    Class attributes are defined between parenthesis either with `val` or `var`, the attribute name and its type
    Attributes have access modifiers like private and protected as Java
    If an attribute does not have an explicit access modifier it will be assumed as `public`
*/

class TV(val name: String, private var status: String, protected val age: Int) {
    override fun toString(): String = "TV $name - $status - $age"
}


/*
    We still can have attributes that are initialized internally and not from constructor
*/
class TV2(val name: String, private var status: String, protected val age: Int) {
    private val display = "32 inch"

    override fun toString(): String = "TV $name - $status - $age - $display"
}


/*
    Kotlin constructors support default values on their attributes
*/
class TV3(val name: String, private var status: String = "WORKING", val age: Int) {
    override fun toString(): String = "TV $name - $status - $age"
}


/*
    Kotlin classes support constructor overloading
*/
class TV4(val name: String, private var status: String, val age: Int) {
    constructor(name: String) : this(name, "WORKING", 2012)
    constructor(age: Int) : this("GENERIC TV", "WORKING", age)

    override fun toString(): String = "TV $name - $status - $age"
}


/*
    Kotlin classes are `final` by default, this means that by default every class cannot be inherited.
    In order to enable a class to be inherited we need to use the `open` keyword on our classes.

    If our parent class has a constructor that needs to receive parameters we have to pass them when
    we inherit from them.
 */

open class Furniture(protected val age: Int)

// Receiving age by constructor and passing through Furniture constructor
class TV5(val name: String, age: Int) : Furniture(age) {
    override fun toString(): String = "TV $name - $age"
}

// Setting a default age in Furniture constructor
class TV6(val name: String) : Furniture(age = 2023) {
    override fun toString(): String = "TV $name - $age"
}


/*
    We can define attributes that doesn't have any value, instead these attributes are calculated using other
    attributes
*/
class Event(private val id: Int) {
    val publicId: String
        get() {
            return (id * 1007).toString()
        }
}

fun handleEvent(event: Event) {
    println(event.publicId) // Accessing event publicId as it is an attribute
}


/*
    If we need static members or methods on our classes we need to use companion object.
    Inside the companion object structure we define every static member. By convention the companion
    object goes at the end of the class
*/

class EventId(private val id: Int) {
    init {
        validateId(id)
    }

    val publicId: String
        get() {
            logger.info("Accessing public id")
            return (id * 1007).toString()
        }

    companion object {
        private val logger = Logger.getLogger(this::class.qualifiedName)

        fun validateId(id: Int) {
            if (id % 1007 != 0)
                throw IllegalArgumentException("Invalid")
        }
    }
}


/*
    `Objects` in kotlin are really useful. An object is basically a unique instance that runs in your application.
    `Objects` cannot be instantiated (since they are already a unique instance)
    or inherited, but they can implement interfaces or inherit from other classes.
    `Objects` can have attributes but these must be initialized internally since `Objects` cannot be instantiated thus
    they do not have constructors.
 */

interface DatabaseConnector {
    fun connect(host: String, port: String)
}

object MySQLConnector : DatabaseConnector {
    private val driver = "Custom driver"

    override fun connect(host: String, port: String) {
        println("Using driver $driver")
        println("Connecting to DB $host:$port")
    }

    fun ping(host: String, port: String): Boolean {
        println("Using driver $driver")
        return true
    }
}

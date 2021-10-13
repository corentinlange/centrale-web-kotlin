/*
 * Corentin Lange 13/10/2021
 */
package quick.start

class App {
    val greeting: String
        get() = "Hello world."
}

open class Human {}

class Man : Human() {}

class Woman : Human() {}

fun main(args: Array<String>) {
    println(App().greeting)
}

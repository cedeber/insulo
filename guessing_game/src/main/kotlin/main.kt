import kotlin.random.Random

fun main() {
    println("Guess the number!")

    val secretNumber = Random.nextInt(1, 100)
    var guess: Int = -1

    while (true) {
        println("Please input your guess.")
        guess = readLine()?.toIntOrNull() ?: continue
        println("You guessed $guess")

        when (guess.compareTo(secretNumber)) {
            -1 -> println("Too small!")
            1 -> println("Too big!")
            else -> {
                println("You win!"); break
            }
        }
    }
}
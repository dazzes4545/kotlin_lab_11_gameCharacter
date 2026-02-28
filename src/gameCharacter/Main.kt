package gameCharacter

fun main() {
    val hero = GameCharacter("Артур")

    hero.printState()
    hero.run()
    hero.printState()
    hero.attack(50)
    hero.printState()
    hero.stop()
    hero.printState()
    hero.die("Сражение с драконом")
    hero.printState()
}
package gameCharacter

class GameCharacter(val name: String) {
    var state: CharacterState = CharacterState.Idle
        private set

    fun run() {
        state = CharacterState.Running
        println("$name начинает бежать")
    }

    fun attack(damage: Int) {
        state = CharacterState.Attacking(damage)
        println("$name атакует с уроном $damage")
    }

    fun die(reason: String) {
        state = CharacterState.Dead(reason)
        println("$name погиб: $reason")
    }

    fun stop() {
        state = CharacterState.Idle
        println("$name бездействует")
    }

    fun printState() {
        when (state) {
            is CharacterState.Idle -> println("$name: Бездействует")
            is CharacterState.Running -> println("$name: Бежит")
            is CharacterState.Attacking -> {
                val damage = (state as CharacterState.Attacking).damage
                println("$name: Атакует с уроном $damage")
            }
            is CharacterState.Dead -> {
                val reason = (state as CharacterState.Dead).reason
                println("$name: Мертв ($reason)")
            }
        }
    }
}
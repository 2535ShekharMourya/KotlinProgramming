package enumAndSealedClasses.sealedclasses

sealed class UserInputEvent

data class MouseClick(val x: Int, val y: Int) : UserInputEvent()
data class TextInput(val text: String) : UserInputEvent()
data class KeyPress(val key: Char) : UserInputEvent()

fun handleEvent(event: UserInputEvent) {
    when (event) {
        is MouseClick -> println("Mouse clicked at (${event.x}, ${event.y})")
        is TextInput -> println("Text input: ${event.text}")
        is KeyPress -> println("Key pressed: ${event.key}")
    }
}

fun main() {
    val mouseClick = MouseClick(100, 150)
    val textInput = TextInput("Hello, Kotlin!")
    val keyPress = KeyPress('A')

    handleEvent(mouseClick)
    handleEvent(textInput)
    handleEvent(keyPress)
}

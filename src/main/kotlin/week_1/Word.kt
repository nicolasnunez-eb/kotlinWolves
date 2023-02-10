package week_1

object Word {
    fun printWord(word: String): String {
        val wordLength = word.length
        return when {
            wordLength < 5 -> "short"
            wordLength in 5..9 -> "medium"
            else -> "long"
        }
    }
}

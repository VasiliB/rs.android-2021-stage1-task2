package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var indexA = 0
        var indexB = 0
        var bufferIndex = 1
        var buffer = ""
        lateinit var answer: String
        val y = "YES"
        val n = "NO"
        while (indexA <= a.lastIndex) {
            if (a[indexA] != b[indexB] && a[indexA].isUpperCase()) {
                answer = n
                println(answer)
            } else {
                if (a[indexA].toLowerCase() == b[indexB].toLowerCase()) {
                    buffer = buffer.padEnd(bufferIndex, a[indexA])
                    if (indexB != b.lastIndex && indexA != a.lastIndex) {
                        indexB++
                        bufferIndex++
                    }
                }
            }
            indexA++
        }
        if (buffer.toUpperCase() == b) {
            answer = y
        } else {
            answer = n
        }
        println(buffer)
        println(b)
        return (answer)
    }
}
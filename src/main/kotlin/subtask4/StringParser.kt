package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val p1 = '<' to '>'
        val p2 = '(' to ')'
        val p3 = '[' to ']'
        val parseStrings = arrayListOf<String>()


        for (i in inputString.indices){
            when {
                inputString[i] == p1.first ->  parseStrings.add(getString(inputString.substring(i),p1))
                inputString[i] == p2.first ->  parseStrings.add(getString(inputString.substring(i),p2))
                inputString[i] == p3.first ->  parseStrings.add(getString(inputString.substring(i),p3))

            }
        }

        return parseStrings.toTypedArray()
    }

    private fun getString(subString: String, pair: Pair<Char,Char>): String {
        var count = 0
        var result = ""
        for (i in 1 until subString.length) {
            if (subString[i] == pair.first) {
                count++
            } else if (subString[i] == pair.second && count != 0) {
                count--
            } else if (subString[i] == pair.second && count == 0) {
                result = subString.substring(1, i)
                break
            }
        }
        return result
    }

}

package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val result = StringBuilder()
        val countOfMis = countOfMismatches(digitString)
        var numOfChanges = k
        if (isPalindrome(digitString)){
            return digitString
        } else if (numOfChanges >= countOfMis){
            numOfChanges -= countOfMis
            for (i in 0 until  digitString.length/2){
                var value = if (digitString[i] > digitString[digitString.length-1-i]){
                    digitString[i]
                } else{
                    digitString[digitString.length-1-i]
                }
                if (digitString[i] != '9' && digitString[digitString.length-1-i] != '9' && numOfChanges>0){
                    if (digitString[i] == digitString[digitString.length-1-i]){
                        if (numOfChanges >= 2){
                            value = '9'
                            numOfChanges -= 2
                        }
                    }else {
                        value = '9'
                        numOfChanges--
                    }
                }
                result.append(value)

            }
            val firstPart = StringBuilder(result)

            if (n % 2 == 1) {
                if (numOfChanges != 0) {
                    firstPart.append("9")
                }
                else {
                    firstPart.append(digitString[n / 2])
                }
            }
            return firstPart.append(result.reverse()).toString()
        } else {
            return "-1"
        }

    }

    private fun isPalindrome(digitString: String):Boolean{
        for(i in 0 until digitString.length/2){
            if (digitString[i] != digitString[digitString.length-1-i]){
                return false
            }
        }
        return true
    }

    private fun countOfMismatches(digitString: String):Int{
        var count = 0
        for(i in 0 until digitString.length/2){
            if (digitString[i] != digitString[digitString.length-1-i]){
                count++
            }
        }

        return count
    }
}

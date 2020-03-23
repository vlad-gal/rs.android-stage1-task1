package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val array: ArrayList<Int> = ArrayList(sadArray.toList())
        var u = 0
        while (u < array.size) {
            for (i in array.indices) {
                if (array.size<3){
                    break
                }
                if (i == 0) {
                    continue
                } else if (i == array.lastIndex) {
                    break
                } else if (array[i] > array[i + 1] + array[i - 1]) {
                    array.removeAt(i)
                }
            }
            u++
        }
        return array.toIntArray()
    }
}

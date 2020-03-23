package subtask3

class BillCounter {

    // TODO: Complete the following function

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        return if ((bill.sum()-bill[k])/2 == b){
            "Bon Appetit"
        } else{
            (b-(bill.sum()-bill[k])/2).toString()
        }
    }
}

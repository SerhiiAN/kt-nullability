package mate.academy

/*
    Implement the function. The input String may contain number or be null.
    If the number is present, multiply it by 3, then add 10 and return the reminder of dividing by 11.
    If the number is not present return null
 */
const val MULTIPLIER = 3
const val ADDER = 10
const val DIVIDER = 11

fun getReminder(numberStr: String?) : Int? {
    val number: Int? = if (numberStr == null) numberStr else (numberStr.toInt() * MULTIPLIER + ADDER) % DIVIDER
    return number
}

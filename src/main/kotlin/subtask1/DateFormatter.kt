package subtask1

import java.text.SimpleDateFormat

import java.util.*

class DateFormatter {
    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val error = ("Такого дня не существует")
        val myDate = Calendar.getInstance()
        myDate.set(
            year.toInt(),
            month.toInt() - 1,
            day.toInt()
        )
        val dayOutFormat = SimpleDateFormat("d M, yyyy", Locale("RU"))
        val dayIn = ("$day $month, $year")
        val dayOut = (dayOutFormat.format(myDate.getTime()))
        if (dayIn == dayOut) {
            val fullDate = SimpleDateFormat("d MMMM, EEEE", Locale("RU"))
            val result = (fullDate.format(myDate.getTime()))
            println(fullDate.format(myDate.getTime()))
            return (result)
        } else return (error)
    }
}
val defaultArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val arrayArgs = IntArray(args.size)

    fun linearSearch(array: IntArray, value: Int) {

        var found = false
        var position: Int = -1

        for (i in 0..array.size -1) {

            if (array[i] == value) {
                found = true
                position = i
            }
        }

        if (found) println("$value found at position $position") else println("$value not found!")
    }

if (args.size != 0) {

    for (i in 0..args.size - 1) {

        arrayArgs[i] = args[i].toInt()
    }
    linearSearch(arrayArgs, 3)
} else {

    linearSearch(defaultArray, 3)
}
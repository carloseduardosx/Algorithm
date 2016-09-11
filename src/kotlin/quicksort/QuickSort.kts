val defaultArray = intArrayOf(10, 5, 8, 3, 1, 7, 6, 4, 2, 0, 9)
val arrayArgs = IntArray(args.size)

fun quickSort(array: IntArray, left: Int, right: Int) {

    var i = left
    var j = right
    var tmp: Int
    val pivot = array[(right + left) / 2]

    while (i <= j) {

        while (array[i] < pivot) {

            i++
        }
        while (array[j] > pivot) {

            j--
        }

        if (i <= j) {

            tmp = array[i]
            array[i] = array[j]
            array[j] = tmp
            i++
            j--
        }

        if (left < j) {
            quickSort(array, left, j)
        }
        if (i < right) {
            quickSort(array, i, right)
        }
    }
}

if (args.size != 0) {

    for (i in 0..args.size - 1) {

        arrayArgs[i] = args[i].toInt()
    }
    quickSort(arrayArgs, 0, arrayArgs.size - 1)
} else {

    quickSort(defaultArray, 0, defaultArray.size - 1)
}

if (arrayArgs.size == 0) {

    defaultArray.forEach { println(it) }
} else {

    arrayArgs.forEach { println(it) }
}
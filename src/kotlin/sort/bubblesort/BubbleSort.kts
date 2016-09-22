val defaultArray = intArrayOf(10, 5, 8, 3, 1, 7, 6, 4, 2, 0, 9)
val arrayArgs = IntArray(args.size)


fun bubbleSort(array: IntArray) {

    var swapped = false

    while (!swapped) {

        array.forEach {

            for (i in 1..array.size - 1) {

                if (array[i - 1] > array[i]) {

                    val bigger = array[i - 1]
                    array[i - 1] = array[i]
                    array[i] = bigger
                }
                swapped = true
            }
        }
    }
}

if (args.size != 0) {

    for (i in 0..args.size - 1) {

        arrayArgs[i] = args[i].toInt()
    }
    bubbleSort(arrayArgs)
} else {

    bubbleSort(defaultArray)
}

if (arrayArgs.size == 0) {

    defaultArray.forEach { println(it) }
} else {

    arrayArgs.forEach { println(it) }
}
val defaultArray = intArrayOf(10, 5, 8, 3, 1, 7, 6, 4, 2, 0, 9)

fun mergeSort(unsortedArray: IntArray) {

    split(unsortedArray, 0, unsortedArray.size, IntArray(unsortedArray.size))
    unsortedArray.forEach { println(it) }
}

fun split(unsortedArray: IntArray, first: Int, last: Int, sortedArray: IntArray) {

    if (last - first < 2) return //Array with one position are considered sorted

    val middle = (last + first) / 2
    split(unsortedArray, first, middle, sortedArray)
    split(unsortedArray, middle, last, sortedArray)
    merge(unsortedArray, first, middle, last, sortedArray)
    copyArray(unsortedArray, first, last, sortedArray)
}

fun merge(unsortedArray: IntArray, first: Int, middle: Int, last: Int, sortedArray: IntArray) {

    var i = first
    var j = middle

    for (k in first..last - 1) {

        if (i < middle && (j >= last || unsortedArray[i] <= unsortedArray[j])) {

            sortedArray[k] = unsortedArray[i]
            i += 1
        } else {

            sortedArray[k] = unsortedArray[j]
            j += 1
        }
    }
}

fun copyArray(unsortedArray: IntArray, first: Int, last: Int, sortedArray: IntArray) {

    for (i in first..last - 1) {

        unsortedArray[i] = sortedArray[i]
    }
}

if (args.size != 0) {

    val array = IntArray(args.size)

    for (i in 0..args.size - 1) {

        array[i] = args[i].toInt()
    }
    mergeSort(array)
} else {

    mergeSort(defaultArray)
}
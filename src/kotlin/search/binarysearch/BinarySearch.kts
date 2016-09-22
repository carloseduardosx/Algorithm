val defaultArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val arrayArgs = IntArray(args.size)

fun binarySearch(array: IntArray, value: Int) {

    var currentValue: Int? = -1000
    var lower = 0
    var higher = array.size

    while (currentValue != value) {

        if (lower > higher) {

            println("$value not exist at array")
        }

        val mid = lower + (higher - lower) / 2

        if (array[mid] < value) {

            currentValue = array[mid]
            lower = mid + 1
        }

        if (array[mid] > value) {

            currentValue = array[mid]
            higher = mid - 1
        }

        if (array[mid] == value) {

            currentValue = array[mid]
            println("$value found at position $mid")
        }
    }
}

if (args.size != 0) {

    for (i in 0..args.size - 1) {

        arrayArgs[i] = args[i].toInt()
    }
    binarySearch(arrayArgs, 3)
} else {

    binarySearch(defaultArray, 3)
}
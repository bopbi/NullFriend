package nullfriend.collections

fun <T> isNull(elements: List<T>) : Boolean {
    elements.forEach {
        if (it == null) {
            return true
        }
    }
    return false
}

@Suppress("UNCHECKED_CAST")
inline fun <T> whenItsNotNull(elements: List<T?>, action: (List<T>) -> Unit) {
    if (!isNull(elements)) {
        action(elements as List<T>)
    }
}
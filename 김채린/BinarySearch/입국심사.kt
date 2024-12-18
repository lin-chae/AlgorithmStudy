import kotlin.math.max
class Solution {

fun solution(
    n: Int,
    times: IntArray,
): Long {
    var maxNum = -1
    for (i in times) {
        maxNum = max(maxNum, i)
    }
    var right = maxNum *1L * n
    var left = 0L
    var mid = 0L
    while (left < right) {
        mid = (right + left) / 2
        var num = 0L
        for (i in times.indices) {
            num += mid / times[i]
        }
        if (num < n) {
            left = mid+1
        } else {
            right = mid
        }
    }
    return left
}
}

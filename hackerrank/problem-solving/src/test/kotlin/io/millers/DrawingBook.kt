package io.millers

import org.junit.jupiter.api.Test
import kotlin.math.min
import kotlin.test.assertEquals

/**
 * https://www.hackerrank.com/challenges/drawing-book/problem
 */
class DrawingBook {
    /**
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */
    fun pageCount(n: Int, p: Int): Int {
        // Write your code here

        // pages are grouped as [1], [2,3], [4,5]
        // last page is either [n-1, n] (odd) or [n] (even)

        // the number of page 'groups'
        val groupCount = n / 2
        // the 'group' of the searched page is found through
        val pageGroup = p / 2

        return min(pageGroup, groupCount - pageGroup)
    }

    @Test
    fun test1() {
        val result = pageCount(6, 2)
        assertEquals(1, result)
    }

    @Test
    fun test2() {
        val result = pageCount(5, 4)
        assertEquals(0, result)
    }


}
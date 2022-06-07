package io.millers

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * https://www.hackerrank.com/challenges/sock-merchant
 */
class SockMerchant {

    /**
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
    fun sockMerchant(n: Int, ar: Array<Int>): Int {
        return ar.groupBy { it }
            .values.sumOf {
                it.count() / 2
            }
    }

    @Test
    fun test1() {
        val socks = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
        val result = sockMerchant(socks.size, socks)
        assertEquals(3, result)
    }
}
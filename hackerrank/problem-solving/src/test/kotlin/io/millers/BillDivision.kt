package io.millers

import io.millers.common.ConsoleAssert
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * Source: https://www.hackerrank.com/challenges/bon-appetit/problem
 */
class BillDivision : ConsoleAssert() {

    /**
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k item Anna didn't eat
     *  3. INTEGER b amount of money Brian paid Anna
     **/
    fun bonAppetit(bill: Array<Int>, skippedItem: Int, charged: Int): Unit {
        // Write your code here

        val commonSum = bill.filterIndexed { idx, _ -> idx != skippedItem }.sum()
        val actualCharge = commonSum / 2
        val diff = charged - actualCharge

        print(diff.takeIf { it != 0 } ?: "Bon Appetit")
    }

    @Test
    fun test1() {
        bonAppetit(arrayOf(3, 10, 2, 9), 1, 12)
        assertEquals("5", out.toString())
    }

    @Test
    fun test2() {
        bonAppetit(arrayOf(3, 10, 2, 9), 1, 7)
        assertEquals("Bon Appetit", out.toString())
    }

}



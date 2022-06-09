package io.millers

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * Source: https://www.hackerrank.com/challenges/counting-valleys/problem
 */
class CountingValleys {
    /**
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    fun countingValleysImperative(steps: Int, path: String): Int {
        var level = 0
        var valleys = 0

        path.forEach {
            val change = if ('U' == it) 1 else -1
            level += change
            val valleyCrossed = if (level == 0 && change == 1) 1 else 0
            valleys += valleyCrossed
        }

        return valleys
    }

    fun countingValleys(steps: Int, path: String): Int =
        path.map { if ('U' == it) 1 else -1 }
            .map { Step(0, it) }
            .reduce { sum, change -> sum + change }
            .valleys

    @Test
    fun test1() {
        val res = countingValleys(8, "UDDDUDUU")
        assertEquals(1, res)
    }

    @Test
    fun test2() {
        val res = countingValleys(7, "UUUDDUD")
        assertEquals(0, res)
    }

    @Test
    fun test3() {
        val res = countingValleys(12, "DDUUDDUDUUUD")
        assertEquals(2, res)
    }

}

class Step(val valleys: Int, val level: Int) {
    operator fun plus(increment: Step): Step {
        val newLevel = level + increment.level
        val valleysCrossed = valleys +
                if (newLevel == 0 && increment.level > 0) 1 else 0
        return Step(valleysCrossed, newLevel)
    }
}
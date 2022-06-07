package io.millers.common

import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

abstract class ConsoleAssert {

    protected val out = ByteArrayOutputStream()

    @BeforeEach
    fun setup() {
        System.setOut(PrintStream(out))
    }

}
package de.havox_design.aoc2023.day20

import de.havox_design.aoc.utils.kotlin.helpers.tests.shouldBe
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class PulsePropagationTest {
    @ParameterizedTest
    @MethodSource("getDataForTestSolvePart1")
    fun testSolvePart1(filename: String, expectedResult: Long) =
        PulsePropagation(filename).solvePart1().shouldBe(expectedResult)

    companion object {
        @JvmStatic
        private fun getDataForTestSolvePart1(): Stream<Arguments> =
            Stream.of(
                Arguments.of("de/havox_design/aoc2023/day20/day20Part1sample1.txt", 32000000L),
                Arguments.of("de/havox_design/aoc2023/day20/day20Part1sample2.txt", 11687500L)
            )
    }
}

package de.havox_design.aoc2021.day12

import de.havox_design.aoc.utils.kotlin.helpers.tests.shouldBe
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class PassagePathingTest {

    @ParameterizedTest
    @MethodSource("getDataForTestProcessPart1")
    fun testProcessPart1(filename: String, expectedResult: Int) =
        PassagePathing(filename).processPart1().shouldBe(expectedResult)

    @ParameterizedTest
    @MethodSource("getDataForTestProcessPart2")
    fun testProcessPart2(filename: String, expectedResult: Int) =
        PassagePathing(filename).processPart2().shouldBe(expectedResult)

    companion object {
        @JvmStatic
        private fun getDataForTestProcessPart1(): Stream<Arguments> =
            Stream.of(
                Arguments.of("de/havox_design/aoc2021/day12/day12sample1.txt", 10),
                Arguments.of("de/havox_design/aoc2021/day12/day12sample2.txt", 19),
                Arguments.of("de/havox_design/aoc2021/day12/day12sample3.txt", 226)
            )

        @JvmStatic
        private fun getDataForTestProcessPart2(): Stream<Arguments> =
            Stream.of(
                Arguments.of("de/havox_design/aoc2021/day12/day12sample1.txt", 36),
                Arguments.of("de/havox_design/aoc2021/day12/day12sample2.txt", 103),
                Arguments.of("de/havox_design/aoc2021/day12/day12sample3.txt", 3509)
            )
    }
}

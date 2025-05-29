plugins {
    id("com.gradle.develocity") version("4.0.2")
}

rootProject.name = "advent-of-code-2021"

include("aoc2021")
include("aoc2021:aoc2021-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")

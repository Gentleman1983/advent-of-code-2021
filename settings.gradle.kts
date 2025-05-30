plugins {
    id("com.gradle.develocity") version("4.0.2")
}

dependencyResolutionManagement {
    versionCatalogs {
        create("aoc2021Libs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}

include("aoc2021")
include("aoc2021:aoc2021-kotlin")

include("advent-of-code-utils")
apply( "advent-of-code-utils/settings.gradle.kts")
project(":aoc-utils").projectDir = file( path = "$rootDir/advent-of-code-utils/aoc-utils")
project(":aoc-utils:aoc-utils-kotlin").projectDir = file( path = "$rootDir/advent-of-code-utils/aoc-utils/aoc-utils-kotlin")
project(":aoc-utils:aoc-utils-java").projectDir = file( path = "$rootDir/advent-of-code-utils/aoc-utils/aoc-utils-java")

rootProject.name = "advent-of-code-2021"

package section_three.named_and_default_arguments

import atomictest.eq

fun main() {
    color(blue = 0, red = 99, green = 52) eq "(99, 52, 0)"
    color(red = 255, 255, 0) eq "(255, 255, 0)"
}
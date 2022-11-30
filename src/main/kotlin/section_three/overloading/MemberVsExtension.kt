package section_three.overloading

import atomictest.eq

class MemberVsExtension {
    fun foo() = 0
}

fun MemberVsExtension.foo() = 1 // Can't be called

fun MemberVsExtension.foo(a: Int) = a + 2

fun main() {
    MemberVsExtension().foo() eq 0
    MemberVsExtension().foo(1) eq 3
}
package com.example.androidapp

import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTextTest {
    @Test
    fun greetingText_includesName() {
        assertEquals("Hello Android!", greetingText("Android"))
    }
}

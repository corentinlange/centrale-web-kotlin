/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package quick.start

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}

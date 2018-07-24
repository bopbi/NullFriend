import nullfriend.collections.isNull
import nullfriend.collections.whenItsNotNull
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class NullFriendTest {

    @Test
    fun testIsNull_whenInputMixed_shouldReturnTrue() {
        val result = isNull(listOf(1, null, ""))
        assertTrue(result)
    }

    @Test
    fun testIsNull_whenInputNotContainNull_shouldReturnFalse() {
        val result = isNull(listOf(1, ""))
        assertFalse(result)
    }

    @Test
    fun testIsNull_whenInputOnlyContainNull_shouldReturnTrue() {
        val result = isNull(listOf(null))
        assertTrue(result)
    }

    @Test
    fun testWhenItsNotNull_shouldAssertFalse() {
        val result = false
        whenItsNotNull(listOf(1, null, "")) {
            assertTrue(result)
        }
        assertFalse(result)
    }
}

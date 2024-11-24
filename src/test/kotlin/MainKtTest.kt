import org.example.ArrayPrimitive
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MainKtTest{
    private val testArraySample: ArrayPrimitive = ArrayPrimitive()

    @Test
    fun testStringArray(){
        val expectedStringArray = arrayOf("one", "two", "three")
        testArraySample.stringArray = expectedStringArray
        assertArrayEquals(expectedStringArray, testArraySample.stringArray)
    }
}
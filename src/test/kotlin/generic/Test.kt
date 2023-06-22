package generic

import org.junit.jupiter.api.Test

class Test {
    @Test
    fun genericTest() {
        assert(GenericClass().status).equals(true)
    }
}
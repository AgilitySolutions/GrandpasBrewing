package com.agilitysolutions.testing

class TestHelper {
    static def expectThrown(Class expectedThrowable = Throwable, Closure closure) {
        try {
            closure()
        } catch(Throwable t) {
            if (!expectedThrowable.isInstance(t)) {
                throw t
            }
            return t
        }
        throw new AssertionError("Expected Throwable $expectedThrowable not thrown")
    }
}

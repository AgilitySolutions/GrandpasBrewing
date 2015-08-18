package com.grandpasbrewing.data.migrations

import org.flywaydb.core.Flyway
import static org.mockito.Mockito.*;

class MigratorTest extends GroovyTestCase {
    private Flyway mockedFlyway;
    private Migrator _migrator;

    void setUp() {
        super.setUp()

        mockedFlyway = mock(Flyway.class);
        _migrator = new Migrator(mockedFlyway);
    }

    void testConstructor() {
        def exception = expectThrown(IllegalArgumentException) {
            new Migrator(null);
        }

        assert exception;
    }

    void testMigrate() {
        _migrator.Migrate("url", "user", "password");

        verify(mockedFlyway).setDataSource("url", "user", "password");
        verify(mockedFlyway).migrate();
    }

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

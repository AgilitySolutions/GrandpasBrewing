package com.agilitysolutions.data

import com.agilitysolutions.testing.TestHelper
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
        def exception = TestHelper.expectThrown(IllegalArgumentException) {
            new Migrator(null);
        }

        assert exception;
    }

    void testMigrate() {
        _migrator.Migrate("url", "user", "password");

        verify(mockedFlyway).setDataSource("url", "user", "password");
        verify(mockedFlyway).migrate();
    }


}

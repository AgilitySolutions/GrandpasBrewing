package com.agilitysolutions.data

import org.flywaydb.core.Flyway
import static org.mockito.Mockito.*;

class MigratorTest extends GroovyTestCase {
    private Flyway mockedFlyway;
    private DatabaseMigrator _databaseMigrator;

    void setUp() {
        super.setUp()

        mockedFlyway = mock(Flyway.class);
        _databaseMigrator = new DatabaseMigrator(mockedFlyway);
    }

    void testMigrate() {
        _databaseMigrator.Migrate("url", "user", "password");

        verify(mockedFlyway).setDataSource("url", "user", "password");
        verify(mockedFlyway).migrate();
    }


}

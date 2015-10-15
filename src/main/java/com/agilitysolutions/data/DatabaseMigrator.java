package com.agilitysolutions.data;

import com.agilitysolutions.data.interfaces.Migrator;
import org.flywaydb.core.Flyway;

public class DatabaseMigrator implements Migrator {
    private Flyway _flyway;

    public DatabaseMigrator(Flyway flyway) {
        _flyway = flyway;
    }

    public void Migrate(String url, String user, String password) {
        _flyway.setDataSource(url, user, password);
        _flyway.migrate();
    }
}

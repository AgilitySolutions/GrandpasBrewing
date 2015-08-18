package com.grandpasbrewing.data.migrations;

import com.grandpasbrewing.data.migrations.interfaces.IMigrator;
import org.flywaydb.core.Flyway;

public class Migrator implements IMigrator {
    private Flyway _flyway;

    public Migrator(Flyway flyway) {
        if (flyway == null) throw new IllegalArgumentException();

        _flyway = flyway;
    }

    public void Migrate(String url, String user, String password) {
        _flyway.setDataSource(url, user, password);
        _flyway.migrate();
    }
}

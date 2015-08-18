package com.grandpasbrewing.data.migrations.interfaces;

public interface IMigrator {
    void Migrate(String url, String user, String password);
}

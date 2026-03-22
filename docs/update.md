# Update & Rollback Procedure

## Update Steps
1. **Backup:** Run `db_backup.sh`.
2. **Stop Service:** `systemctl stop smart-energy`.
3. **Deploy:** Download new `.jar` file.
4. **Migrate:** Run Liquibase/Flyway migrations (if any).
5. **Start:** `systemctl start smart-energy`.

## Rollback (If things break)
1. Stop service.
2. Replace current `.jar` with the previous version from `/backups/bin/`.
3. Restore DB from the last backup.
4. Start service.

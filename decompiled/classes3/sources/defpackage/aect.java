package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aect extends gga {
    final /* synthetic */ com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aect(com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase_Impl gnpPerAccountRoomDatabase_Impl) {
        super(3, "84319eff82fa715dd9f27196c67a319c", "6807f1b0919d1d796ba7bf2c8b1a1ac1");
        j$.util.Objects.requireNonNull(gnpPerAccountRoomDatabase_Impl);
        this.d = gnpPerAccountRoomDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `threads` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `last_updated_version` INTEGER NOT NULL, `last_notification_version` INTEGER NOT NULL, `creation_id` INTEGER NOT NULL, `payload_type` TEXT, `payload` BLOB, `insertion_time_ms` INTEGER NOT NULL, `storage_mode` INTEGER NOT NULL, `opaque_backend_data` BLOB NOT NULL, `thread_type` INTEGER NOT NULL, `type_specific_data` BLOB NOT NULL, `external_experiment_ids` TEXT NOT NULL, `rendering_metadata` BLOB NOT NULL DEFAULT X'', `send_timestamp_usec` INTEGER NOT NULL DEFAULT 0, `notification_type` TEXT DEFAULT NULL)");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '84319eff82fa715dd9f27196c67a319c')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `threads`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        hgu.V(gjhVar);
    }

    public final defpackage.akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(20);
        map.put("id", new ghy("id", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("thread_id", new ghy("thread_id", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("read_state", new ghy("read_state", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("deletion_status", new ghy("deletion_status", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("count_behavior", new ghy("count_behavior", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("system_tray_behavior", new ghy("system_tray_behavior", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("last_updated_version", new ghy("last_updated_version", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("last_notification_version", new ghy("last_notification_version", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("creation_id", new ghy("creation_id", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("payload_type", new ghy("payload_type", "TEXT", false, 0, (java.lang.String) null, 1));
        map.put("payload", new ghy("payload", "BLOB", false, 0, (java.lang.String) null, 1));
        map.put("insertion_time_ms", new ghy("insertion_time_ms", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("storage_mode", new ghy("storage_mode", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("opaque_backend_data", new ghy("opaque_backend_data", "BLOB", true, 0, (java.lang.String) null, 1));
        map.put("thread_type", new ghy("thread_type", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("type_specific_data", new ghy("type_specific_data", "BLOB", true, 0, (java.lang.String) null, 1));
        map.put("external_experiment_ids", new ghy("external_experiment_ids", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("rendering_metadata", new ghy("rendering_metadata", "BLOB", true, 0, "X''", 1));
        map.put("send_timestamp_usec", new ghy("send_timestamp_usec", "INTEGER", true, 0, "0", 1));
        map.put("notification_type", new ghy("notification_type", "TEXT", false, 0, "NULL", 1));
        gib gibVar = new gib("threads", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "threads");
        return !hgu.S(gibVar, gibVarT) ? new defpackage.akwb(false, hgb.e(gibVarT, gibVar, "threads(com.google.android.libraries.notifications.platform.internal.room.ChimeThreadEntity).\n Expected:\n")) : new defpackage.akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}

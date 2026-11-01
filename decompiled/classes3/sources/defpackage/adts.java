package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adts extends gga {
    final /* synthetic */ com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adts(com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase_Impl chimePerAccountRoomDatabase_Impl) {
        super(2, "4dff45f02f3e689be0f6f1524b0cca0c", "557f59ae5db83868cf5aa3ce16101df1");
        j$.util.Objects.requireNonNull(chimePerAccountRoomDatabase_Impl);
        this.d = chimePerAccountRoomDatabase_Impl;
    }

    public final void a(gjh gjhVar) {
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS `chime_thread_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `last_updated_version` INTEGER NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `modified_timestamp` INTEGER NOT NULL)");
        dzk.M(gjhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dzk.M(gjhVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4dff45f02f3e689be0f6f1524b0cca0c')");
    }

    public final void b(gjh gjhVar) {
        dzk.M(gjhVar, "DROP TABLE IF EXISTS `chime_thread_states`");
    }

    public final void c(gjh gjhVar) {
        this.d.u(gjhVar);
    }

    public final void d(gjh gjhVar) {
        hgu.V(gjhVar);
    }

    public final defpackage.akwb g(gjh gjhVar) {
        java.util.HashMap map = new java.util.HashMap(8);
        map.put("id", new ghy("id", "INTEGER", true, 1, (java.lang.String) null, 1));
        map.put("thread_id", new ghy("thread_id", "TEXT", true, 0, (java.lang.String) null, 1));
        map.put("last_updated_version", new ghy("last_updated_version", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("read_state", new ghy("read_state", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("deletion_status", new ghy("deletion_status", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("count_behavior", new ghy("count_behavior", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("system_tray_behavior", new ghy("system_tray_behavior", "INTEGER", true, 0, (java.lang.String) null, 1));
        map.put("modified_timestamp", new ghy("modified_timestamp", "INTEGER", true, 0, (java.lang.String) null, 1));
        gib gibVar = new gib("chime_thread_states", map, new java.util.HashSet(0), new java.util.HashSet(0));
        gib gibVarT = hgu.T(gjhVar, "chime_thread_states");
        return !hgu.S(gibVar, gibVarT) ? new defpackage.akwb(false, hgb.e(gibVarT, gibVar, "chime_thread_states(com.google.android.libraries.notifications.internal.storage.impl.room.ChimeThreadState).\n Expected:\n")) : new defpackage.akwb(true, (java.lang.String) null);
    }

    public final void e() {
    }

    public final void f() {
    }
}

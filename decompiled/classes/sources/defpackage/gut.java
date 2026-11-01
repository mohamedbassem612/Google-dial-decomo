package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gut extends defpackage.ghg {
    private final android.content.Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gut(android.content.Context context) {
        super(9, 10);
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.c = context;
    }

    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        gipVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        android.content.SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = true == sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gipVar.e();
            try {
                gipVar.p(new java.lang.Object[]{"last_cancel_all_time_ms", java.lang.Long.valueOf(j)});
                gipVar.p(new java.lang.Object[]{"reschedule_needed", java.lang.Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                gipVar.k();
                gipVar.i();
            } catch (java.lang.Throwable th) {
                gipVar.i();
                throw th;
            }
        }
        android.content.Context context = this.c;
        defpackage.aooh.f(context, "context");
        android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            gipVar.e();
            try {
                gipVar.p(new java.lang.Object[]{"next_job_scheduler_id", java.lang.Integer.valueOf(i)});
                gipVar.p(new java.lang.Object[]{"next_alarm_manager_id", java.lang.Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                gipVar.k();
            } finally {
                gipVar.i();
            }
        }
    }
}

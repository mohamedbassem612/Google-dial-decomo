package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aneu implements defpackage.anet {
    private static final aexb a;
    private static final aexb b;
    private static final aexb c;
    private static final aexb d;
    private static final aexb e;
    private static final aexb f;
    private static final aexb g;

    static {
        aewz aewzVarA = new aewz(aewo.a("com.google.android.gms.icing.mdd"), "", "", false, false).b().a();
        a = aewzVarA.c("api_logging_sample_interval", 100L);
        aewzVarA.c("cleanup_log_logging_sample_interval", 1000L);
        b = aewzVarA.c("group_stats_logging_sample_interval", 100L);
        c = aewzVarA.c("mdd_android_sharing_sample_interval", 100L);
        d = aewzVarA.c("mdd_default_sample_interval", 100L);
        aewzVarA.c("mdd_download_events_sample_interval", 1L);
        aewzVarA.c("mobstore_file_service_stats_sample_interval", 100L);
        e = aewzVarA.c("network_stats_logging_sample_interval", 100L);
        f = aewzVarA.c("pds_migration_compare_results_sample_interval", 10000L);
        aewzVarA.c("silent_feedback_sample_interval", 100L);
        g = aewzVarA.c("storage_stats_logging_sample_interval", 100L);
    }

    @Override // defpackage.anet
    public final long a() {
        return ((java.lang.Long) a.b()).longValue();
    }

    @Override // defpackage.anet
    public final long b() {
        return ((java.lang.Long) b.b()).longValue();
    }

    @Override // defpackage.anet
    public final long c() {
        return ((java.lang.Long) c.b()).longValue();
    }

    @Override // defpackage.anet
    public final long d() {
        return ((java.lang.Long) d.b()).longValue();
    }

    @Override // defpackage.anet
    public final long e() {
        return ((java.lang.Long) e.b()).longValue();
    }

    @Override // defpackage.anet
    public final long f() {
        return ((java.lang.Long) f.b()).longValue();
    }

    @Override // defpackage.anet
    public final long g() {
        return ((java.lang.Long) g.b()).longValue();
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anen implements defpackage.anem {
    private static final aexb a;
    private static final aexb b;
    private static final aexb c;
    private static final aexb d;
    private static final aexb e;
    private static final aexb f;
    private static final aexb g;
    private static final aexb h;

    static {
        aewz aewzVarA = new aewz(aewo.a("com.google.android.gms.icing.mdd"), "", "", false, false).b().a();
        a = aewzVarA.c("abs_free_space_after_download", 524288000L);
        b = aewzVarA.c("abs_free_space_after_download_extremely_low_storage_allowed", 2097152L);
        c = aewzVarA.c("abs_free_space_after_download_low_storage_allowed", 104857600L);
        d = aewzVarA.d("downloader_enforce_https", true);
        e = aewzVarA.c("downloader_max_retry_on_checksum_mismatch_count", 5L);
        f = aewzVarA.c("downloader_max_threads", 2L);
        g = aewzVarA.d("enforce_low_storage_behavior", true);
        h = new defpackage.aewv(aewzVarA, java.lang.Double.valueOf(0.1d));
        aewzVarA.c("time_to_wait_for_downloader", 120000L);
    }

    @Override // defpackage.anem
    public final double a() {
        return ((java.lang.Double) h.b()).doubleValue();
    }

    @Override // defpackage.anem
    public final long b() {
        return ((java.lang.Long) a.b()).longValue();
    }

    @Override // defpackage.anem
    public final long c() {
        return ((java.lang.Long) b.b()).longValue();
    }

    @Override // defpackage.anem
    public final long d() {
        return ((java.lang.Long) c.b()).longValue();
    }

    @Override // defpackage.anem
    public final long e() {
        return ((java.lang.Long) e.b()).longValue();
    }

    @Override // defpackage.anem
    public final long f() {
        return ((java.lang.Long) f.b()).longValue();
    }

    @Override // defpackage.anem
    public final boolean g() {
        return ((java.lang.Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.anem
    public final boolean h() {
        return ((java.lang.Boolean) g.b()).booleanValue();
    }
}

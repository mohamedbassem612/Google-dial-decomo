package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anec implements aneb {
    private static final aezc a = new aezc(defpackage.andz.b, 18);

    public final double a() {
        return ((java.lang.Double) a.a(13, "CollectionBasisVerifierFeatures__log_sampling_rate", 1.0d).eZ()).doubleValue();
    }

    public final long b() {
        return ((java.lang.Long) a.b(12, "CollectionBasisVerifierFeatures__failure_log_cooldown_period_ms", 86400000L).eZ()).longValue();
    }

    public final long c() {
        return ((java.lang.Long) a.b(14, "CollectionBasisVerifierFeatures__max_stack_trace_size", 1000L).eZ()).longValue();
    }

    public final long d() {
        return ((java.lang.Long) a.b(15, "CollectionBasisVerifierFeatures__min_app_version_code_to_log", -1L).eZ()).longValue();
    }

    public final boolean e() {
        return ((java.lang.Boolean) a.d(1, "CollectionBasisVerifierFeatures__enable_cbv_v2", false).eZ()).booleanValue();
    }

    public final boolean f() {
        return ((java.lang.Boolean) a.d(2, "CollectionBasisVerifierFeatures__enable_google_signature_check", false).eZ()).booleanValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) a.d(4, "CollectionBasisVerifierFeatures__enable_log_sampling", true).eZ()).booleanValue();
    }

    public final boolean h() {
        return ((java.lang.Boolean) a.d(5, "CollectionBasisVerifierFeatures__enable_logging", false).eZ()).booleanValue();
    }

    public final boolean i() {
        return ((java.lang.Boolean) a.d(6, "CollectionBasisVerifierFeatures__enable_logging_field_not_annotated", false).eZ()).booleanValue();
    }

    public final boolean j() {
        return ((java.lang.Boolean) a.d(7, "CollectionBasisVerifierFeatures__enable_logging_uc_never_collect", false).eZ()).booleanValue();
    }

    public final boolean k() {
        return ((java.lang.Boolean) a.d(8, "CollectionBasisVerifierFeatures__enable_logging_using_cel", false).eZ()).booleanValue();
    }

    public final boolean l() {
        return ((java.lang.Boolean) a.d(9, "CollectionBasisVerifierFeatures__enable_logging_using_cel_to_all_apps_beyond_gms_core", false).eZ()).booleanValue();
    }

    public final boolean m() {
        return ((java.lang.Boolean) a.d(10, "CollectionBasisVerifierFeatures__enable_use_proto_data_store", true).eZ()).booleanValue();
    }

    public final boolean n() {
        return ((java.lang.Boolean) a.d(11, "CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false).eZ()).booleanValue();
    }
}

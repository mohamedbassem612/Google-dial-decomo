package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aner implements defpackage.anep {
    private static final aexb a;
    private static final aexb b;
    private static final aexb c;
    private static final aexb d;
    private static final aexb e;
    private static final aexb f;
    private static final aexb g;
    private static final aexb h;
    private static final aexb i;
    private static final aexb j;
    private static final aexb k;
    private static final aexb l;
    private static final aexb m;
    private static final aexb n;
    private static final aexb o;
    private static final aexb p;
    private static final aexb q;
    private static final aexb r;
    private static final aexb s;
    private static final aexb t;
    private static final aexb u;

    static {
        aewz aewzVarA = new aewz(aewo.a("com.google.android.gms.icing.mdd"), "", "", false, false).b().a();
        final int i2 = 1;
        aewzVarA.d("gms_icing_mdd_add_configs_from_phenotype", true);
        aewzVarA.d("broadcast_newly_downloaded_groups", true);
        aewzVarA.e("build_id_overrides", new aewy() { // from class: aneq
            public final java.lang.Object a(byte[] bArr) {
                return i2 != 0 ? (defpackage.acur) alad.y(defpackage.acur.a, bArr) : (defpackage.acvp) alad.y(defpackage.acvp.a, bArr);
            }
        }, "");
        aewzVarA.d("gms_icing_mdd_cache_last_location", true);
        final int i3 = 0;
        aewzVarA.d("clear_state_on_mdd_disabled", false);
        a = aewzVarA.d("delete_file_groups_with_files_missing", true);
        b = aewzVarA.d("disable_phenotype_namespace_migration_and_cleanup", false);
        aewzVarA.d("gms_mdd_download_first_on_wifi_then_on_any_network", true);
        aewzVarA.d("gms_mdd_dump_mdd_info", false);
        aewzVarA.d("enable_android_file_sharing", true);
        aewzVarA.d("enable_android_file_sharing_data_clean_up", true);
        aewzVarA.d("enable_android_sharing_daily_maintenance", false);
        aewzVarA.d("enable_client_error_logging", false);
        c = aewzVarA.d("enable_compressed_file", true);
        d = aewzVarA.d("enable_days_since_last_maintenance_tracking", true);
        aewzVarA.d("gms_mdd_enable_debug_ui", false);
        e = aewzVarA.d("enable_delayed_download", true);
        aewzVarA.d("enable_delta_download", true);
        aewzVarA.d("enable_download_stage_experiment_id_propagation", true);
        f = aewzVarA.d("enable_file_download_dedup_by_file_key", false);
        aewzVarA.d("enable_gdd_batch_sync", false);
        aewzVarA.d("enable_gdd_zwieback_id_propagation", false);
        g = aewzVarA.d("enable_isolated_structure_verification", true);
        aewzVarA.d("gms_mdd_enable_mdd_gcm_service", true);
        h = aewzVarA.d("enable_mdd_multi_variant_handling", false);
        aewzVarA.d("enable_mobile_data_download", true);
        aewzVarA.d("enable_mobstore_file_service", true);
        aewzVarA.d("enable_mobstore_file_service_rename", true);
        aewzVarA.d("enable_mobstore_file_service_whitelist", true);
        i = aewzVarA.d("enable_rng_based_device_stable_sampling", true);
        aewzVarA.d("enable_set_runtime_properties", true);
        j = aewzVarA.d("enable_sideloading", true);
        aewzVarA.d("gms_mdd_enable_silent_feedback", true);
        k = aewzVarA.d("enable_zip_folder", true);
        l = aewzVarA.c("FeatureFlags__file_key_version", 2L);
        aewzVarA.d("gcm_reschedule_only_once_per_process_start", true);
        aewzVarA.d("gms_mdd_switch_to_cronet", false);
        aewzVarA.c("gms_icing_mdd_location_s2_level", 10L);
        aewzVarA.c("gms_icing_mdd_task_await_time", 5L);
        m = aewzVarA.d("log_file_groups_with_files_missing", true);
        n = aewzVarA.d("log_network_stats", true);
        aewzVarA.d("gms_mdd_log_storage_stats", true);
        o = aewzVarA.d("gms_icing_mdd_delete_groups_removed_accounts", false);
        p = aewzVarA.d("gms_icing_mdd_delete_uninstalled_apps", true);
        q = aewzVarA.d("gms_icing_mdd_enable_download_pending_groups", true);
        r = aewzVarA.d("gms_icing_mdd_enable_garbage_collection", true);
        s = aewzVarA.d("gms_icing_mdd_enable_verify_pending_groups", true);
        t = aewzVarA.c("gms_icing_mdd_reset_trigger", 0L);
        aewzVarA.d("migrate_file_expiration_policy", true);
        aewzVarA.d("migrate_to_new_file_key", true);
        u = aewzVarA.e("FeatureFlags__pds_migration_state", new aewy() { // from class: aneq
            public final java.lang.Object a(byte[] bArr) {
                return i3 != 0 ? (defpackage.acur) alad.y(defpackage.acur.a, bArr) : (defpackage.acvp) alad.y(defpackage.acvp.a, bArr);
            }
        }, "");
        aewzVarA.d("remove_groupkeys_with_downloaded_field_not_set", true);
        aewzVarA.d("test_only_file_key_version", false);
    }

    @Override // defpackage.anep
    public final long a() {
        return ((java.lang.Long) l.b()).longValue();
    }

    @Override // defpackage.anep
    public final long b() {
        return ((java.lang.Long) t.b()).longValue();
    }

    @Override // defpackage.anep
    public final defpackage.acvp c() {
        return (defpackage.acvp) u.b();
    }

    @Override // defpackage.anep
    public final boolean d() {
        return ((java.lang.Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean e() {
        return ((java.lang.Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean f() {
        return ((java.lang.Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean g() {
        return ((java.lang.Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean h() {
        return ((java.lang.Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean i() {
        return ((java.lang.Boolean) f.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean j() {
        return ((java.lang.Boolean) g.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean k() {
        return ((java.lang.Boolean) h.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean l() {
        return ((java.lang.Boolean) i.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean m() {
        return ((java.lang.Boolean) j.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean n() {
        return ((java.lang.Boolean) k.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean o() {
        return ((java.lang.Boolean) m.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean p() {
        return ((java.lang.Boolean) n.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean q() {
        return ((java.lang.Boolean) o.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean r() {
        return ((java.lang.Boolean) p.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean s() {
        return ((java.lang.Boolean) q.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean t() {
        return ((java.lang.Boolean) r.b()).booleanValue();
    }

    @Override // defpackage.anep
    public final boolean u() {
        return ((java.lang.Boolean) s.b()).booleanValue();
    }
}

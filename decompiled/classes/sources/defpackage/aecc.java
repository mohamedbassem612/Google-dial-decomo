package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aecc {
    public static final defpackage.ecs a = new defpackage.aecb();

    public static final defpackage.efn a(android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            defpackage.aooh.i("registrationPreferences");
        }
        return new defpackage.efn(new defpackage.acik(sharedPreferences, 2), defpackage.ajsz.cW(new java.lang.String[]{"last_successful_registration_request_hash_code", "last_successful_registration_environment_url", "last_successful_registration_time_ms", "is_registered_to_unified_fcm_registration", "last_successful_registration_account_type", "last_successful_registration_pseudonymous_cookie", "last_successful_fcm_registration_token", "last_used_registration_api", "internal_target_id", "fetch_only_id"}), new defpackage.efl(null, 0), new defpackage.aeca(null, 0));
    }
}

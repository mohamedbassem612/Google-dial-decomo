package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ged implements defpackage.gek {
    public static defpackage.ged a;
    public static defpackage.ged b;
    private final /* synthetic */ int $cid;

    public ged(int i) {
        this.$cid = i;
    }

    @Override // defpackage.gek
    public final /* synthetic */ java.lang.CharSequence a(androidx.preference.Preference preference) {
        if (this.$cid != 0) {
            androidx.preference.EditTextPreference editTextPreference = (androidx.preference.EditTextPreference) preference;
            return android.text.TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(2132019488) : editTextPreference.g;
        }
        androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) preference;
        return android.text.TextUtils.isEmpty(listPreference.l()) ? listPreference.j.getString(2132019488) : listPreference.l();
    }
}

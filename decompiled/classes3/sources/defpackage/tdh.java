package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tdh {
    public static final aimz a = aimz.i("com/android/dialer/rtt/settings/impl/ui/AccessibilitySettingsFragmentPeer");
    public androidx.preference.PreferenceScreen b;
    public final android.content.Context c;
    public final defpackage.tdf d;
    public final defpackage.tdd e;
    public final ajwr f;

    public tdh(android.content.Context context, defpackage.tdf tdfVar, ajwr ajwrVar, defpackage.tdd tddVar) {
        this.c = context;
        this.d = tdfVar;
        this.f = ajwrVar;
        this.e = tddVar;
    }

    public final androidx.preference.ListPreference a() {
        defpackage.tdf tdfVar = this.d;
        return tdfVar.ee(tdfVar.A().getString(2132020610));
    }

    public final androidx.preference.SwitchPreference b() {
        defpackage.tdf tdfVar = this.d;
        return tdfVar.ee(tdfVar.A().getString(2132018857));
    }
}

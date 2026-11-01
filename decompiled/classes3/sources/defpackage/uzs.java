package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uzs implements geh {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/configui/ConfigOverrideFragmentPeer");
    public final agtk b = new defpackage.uzr(this);
    public final defpackage.uzq c;
    public final agtj d;
    public final defpackage.ulw e;

    public uzs(defpackage.uzq uzqVar, agtj agtjVar, defpackage.ulw ulwVar) {
        this.c = uzqVar;
        this.d = agtjVar;
        this.e = ulwVar;
    }

    public static void b(androidx.preference.Preference preference) {
        if (preference instanceof androidx.preference.EditTextPreference) {
            androidx.preference.EditTextPreference editTextPreference = (androidx.preference.EditTextPreference) preference;
            editTextPreference.p(editTextPreference.g);
        }
    }

    public final boolean a(androidx.preference.Preference preference, java.lang.Object obj) {
        gus.aI();
        mni.cx(new defpackage.vet(preference, 1));
        return true;
    }
}

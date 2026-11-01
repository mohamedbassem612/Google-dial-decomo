package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oiz extends defpackage.oja {
    public static final aimz a = aimz.i("com/android/dialer/expresso/settings/ui/ExpressoSettingsFragmentPeer");
    public static final java.lang.String[] b = {"android.permission.RECEIVE_SMS", "android.permission.SEND_SMS"};
    public final defpackage.oix c;
    public final agzc d;
    public final defpackage.odo e;
    public final agtj f;
    public final defpackage.odm g;
    public final agtk h;
    public final ok i;
    public final defpackage.jiv j;
    public final aogc k;

    public oiz(defpackage.oix oixVar, defpackage.jiv jivVar, agzc agzcVar, defpackage.odo odoVar, agtj agtjVar, aogc aogcVar) {
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(aogcVar, "resultPropagator");
        this.c = oixVar;
        this.j = jivVar;
        this.d = agzcVar;
        this.e = odoVar;
        this.f = agtjVar;
        this.k = aogcVar;
        this.g = new defpackage.iyh(this, 8);
        this.h = new defpackage.oiy();
        this.i = oixVar.O(new oz(), new defpackage.kse(this, 4));
    }

    public final androidx.preference.Preference a() {
        defpackage.oix oixVar = this.c;
        androidx.preference.Preference preferenceEe = oixVar.ee(oixVar.Y(2132018629));
        if (preferenceEe != null) {
            return preferenceEe;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final androidx.preference.Preference b() {
        defpackage.oix oixVar = this.c;
        androidx.preference.Preference preferenceEe = oixVar.ee(oixVar.Y(2132018652));
        if (preferenceEe != null) {
            return preferenceEe;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final androidx.preference.SwitchPreference c() {
        defpackage.oix oixVar = this.c;
        androidx.preference.Preference preferenceEe = oixVar.ee(oixVar.Y(2132019130));
        if (preferenceEe != null) {
            return (androidx.preference.SwitchPreference) preferenceEe;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final androidx.preference.SwitchPreference d() {
        defpackage.oix oixVar = this.c;
        androidx.preference.Preference preferenceEe = oixVar.ee(oixVar.Y(2132019131));
        if (preferenceEe != null) {
            return (androidx.preference.SwitchPreference) preferenceEe;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oxi extends defpackage.oxj {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/settings/ui/AnswerMethodSettingsFragmentPeer");
    public final defpackage.agzc b;
    public final defpackage.oxh c;
    public final odo d;
    public final defpackage.oxg e;
    public final aoin f;
    public final aoin g;
    public final aoin h;
    public final aoin i;
    public final odm j;
    public final krv k;

    public oxi(defpackage.agzc agzcVar, krv krvVar, defpackage.oxh oxhVar, odo odoVar, defpackage.oxg oxgVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(aoinVar, "enableSimpleViewSingleTapDefault");
        aooh.f(aoinVar2, "enableIncomingCallGesturePromoBanner");
        aooh.f(aoinVar4, "enableIncomingCallGesturePostCallBottomSheet");
        this.b = agzcVar;
        this.k = krvVar;
        this.c = oxhVar;
        this.d = odoVar;
        this.e = oxgVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = aoinVar3;
        this.i = aoinVar4;
        this.j = new iyh(this, 11);
    }

    public final androidx.preference.ListPreference a() {
        defpackage.oxh oxhVar = this.c;
        androidx.preference.ListPreference listPreferenceEe = oxhVar.ee(oxhVar.Y(2132017327));
        if (listPreferenceEe != null) {
            return listPreferenceEe;
        }
        throw new java.lang.IllegalArgumentException("Preference not found!");
    }

    public final java.lang.String b() {
        java.lang.String strY = this.c.Y(2132017330);
        aooh.e(strY, "getString(...)");
        return strY;
    }

    public final java.lang.String c() {
        java.lang.String strY = this.c.Y(2132017331);
        aooh.e(strY, "getString(...)");
        return strY;
    }
}

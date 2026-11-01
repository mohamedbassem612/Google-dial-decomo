package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mmq extends defpackage.mmr {
    public static final aimz a = aimz.i("com/android/dialer/display/settings/impl/DisplayOptionsSettingsFragmentPeer");
    public static final java.lang.String[] b = {"1", "2", "-1"};
    public final android.content.Context c;
    public final defpackage.mmn d;
    public final urg e;
    public final rlv f;
    public final defpackage.mml g;
    public final agzc h;
    public final agtj i;
    public final agza j;
    public final defpackage.mmp k;
    public final ipc l;

    public mmq(android.content.Context context, defpackage.mmn mmnVar, urg urgVar, ipc ipcVar, rlv rlvVar, defpackage.mml mmlVar, agzc agzcVar, agtj agtjVar, defpackage.odo odoVar) {
        aooh.f(urgVar, "theme");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(agtjVar, "futuresMixin");
        this.c = context;
        this.d = mmnVar;
        this.e = urgVar;
        this.l = ipcVar;
        this.f = rlvVar;
        this.g = mmlVar;
        this.h = agzcVar;
        this.i = agtjVar;
        this.j = odoVar.b(new defpackage.iyh(this, 4), false);
        this.k = new defpackage.mmp();
    }

    public final androidx.preference.Preference a(int i) {
        defpackage.mmn mmnVar = this.d;
        androidx.preference.Preference preferenceEe = mmnVar.ee(mmnVar.Y(i));
        if (preferenceEe != null) {
            return preferenceEe;
        }
        throw new java.lang.IllegalStateException(a.bj(i, "preference is unavailable for key: "));
    }

    public final androidx.preference.SwitchPreference b() {
        return (androidx.preference.SwitchPreference) a(2132018756);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.String c(urf urfVar) throws aois {
        int iOrdinal = urfVar.ordinal();
        if (iOrdinal == 0) {
            return this.c.getString(2132019164);
        }
        if (iOrdinal == 1) {
            return this.c.getString(2132018206);
        }
        if (iOrdinal == 2) {
            return this.c.getString(2132020521);
        }
        throw new aois();
    }
}

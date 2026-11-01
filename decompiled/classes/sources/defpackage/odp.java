package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class odp {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/errors/fatal/CrashOnUnexpectedException");
    private final defpackage.aoin b;

    public odp(defpackage.aoin aoinVar) {
        this.b = aoinVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: odq */
    public final void a(java.lang.Throwable th) throws odq {
        odq odqVar = new odq(th);
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/errors/fatal/CrashOnUnexpectedException", "crash", '#', "CrashOnUnexpectedException.java")).v("Crash disabled by flag.");
        } else {
            if (defpackage.afec.g()) {
                throw odqVar;
            }
            defpackage.afec.e(new lye(odqVar, 4));
            throw odqVar;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class suf {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/preferredsim/impl/PreferredAccountWorkerImpl");
    public final defpackage.ajct b;
    public final defpackage.ajcu c;
    public final defpackage.zrw d;
    public final defpackage.zjs e;
    public final defpackage.ojo f;
    private final defpackage.rsr g;

    public suf(defpackage.ajct ajctVar, defpackage.ajcu ajcuVar, defpackage.zrw zrwVar, defpackage.zjs zjsVar, defpackage.ojo ojoVar, defpackage.rsr rsrVar) {
        this.b = ajctVar;
        this.c = ajcuVar;
        this.d = zrwVar;
        this.e = zjsVar;
        this.f = ojoVar;
        this.g = rsrVar;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq a(java.lang.String str, java.util.List list, boolean z) {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(843, "PreferredAccountWorkerImpl.selectAccount");
        try {
            defpackage.rsr rsrVar = this.g;
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.f(str, "phoneNumber");
            defpackage.aooh.f(list, "candidates");
            defpackage.aooh.f(optionalEmpty, "suggestionFromPhoneAccounts");
            defpackage.ajcq ajcqVarF = defpackage.aosv.F(rsrVar.a, 0, new sur(rsrVar, str, list, optionalEmpty, z, (defpackage.aoln) null, 0), 3);
            ahoqVarW.close();
            return ajcqVarF;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}

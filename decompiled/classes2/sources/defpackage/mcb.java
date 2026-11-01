package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mcb implements zas {
    private final java.lang.String a;
    private final mca b;

    public mcb(java.lang.String str, mca mcaVar) {
        aooh.f(mcaVar, "legacyLogger");
        this.a = str;
        this.b = mcaVar;
    }

    public final void a(zal zalVar) {
        ahoq ahoqVarW = ahvr.W(336, "InternalSemanticEventLogger_handleError");
        mca mcaVar = this.b;
        try {
            aazc aazcVar = mcaVar.j;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            aimw aimwVarL = mca.a.b().l("com/android/dialer/cui/impl/InternalSemanticEventLogger", "handleError$<anonymous>", 288, "InternalSemanticEventLogger.kt");
            java.lang.String str = this.a;
            aimwVarL.I("CUI error: %s; uniqueCallId: %s", zalVar, str == null ? "null" : str);
            mcaVar.e((java.lang.Enum) zalVar, new zbc(mcaVar, zalVar, str, jElapsedRealtime, (aoln) null, 1));
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    public final void b(mce mceVar) {
        ahoq ahoqVarW = ahvr.W(337, "InternalSemanticEventLogger_handleEvent");
        mca mcaVar = this.b;
        try {
            aazc aazcVar = mcaVar.j;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            aimw aimwVarL = mca.a.b().l("com/android/dialer/cui/impl/InternalSemanticEventLogger", "handleEvent$<anonymous>", 142, "InternalSemanticEventLogger.kt");
            java.lang.String str = this.a;
            aimwVarL.I("CUI event: %s; uniqueCallId: %s", mceVar, str == null ? "null" : str);
            mcaVar.e(mceVar, new defpackage.mbu(mcaVar, mceVar, str, jElapsedRealtime, null));
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }
}

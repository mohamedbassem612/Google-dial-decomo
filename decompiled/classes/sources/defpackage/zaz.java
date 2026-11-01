package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zaz implements defpackage.zas {
    private final java.lang.String a;
    private final defpackage.zbm b;

    public zaz(java.lang.String str, defpackage.zbm zbmVar) {
        if (zbmVar == null) {
            defpackage.aooh.i("internalSemanticEventLogger");
        }
        this.a = str;
        this.b = zbmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zas
    public final void a(defpackage.zal zalVar) throws java.io.IOException {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1209, "InternalSemanticEventLogger_handleError");
        defpackage.zbm zbmVar = this.b;
        try {
            defpackage.aazc aazcVar = zbmVar.g;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            defpackage.aimw aimwVar = (defpackage.aimw) defpackage.zbm.a.b().l("com/google/android/callingshared/cui/impl/InternalSemanticEventLogger", "handleError$<anonymous>", 281, "InternalSemanticEventLogger.kt");
            java.lang.String str = this.a;
            aimwVar.I("CUI error: %s; uniqueCallId: %s", zalVar, str == null ? "null" : str);
            zbmVar.c((java.lang.Enum) zalVar, new zbc(zbmVar, zalVar, str, jElapsedRealtime, (defpackage.aoln) null, 0));
            defpackage.ajsz.ak(ahoqVarW, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.zas
    public final void b(defpackage.mce mceVar) throws java.io.IOException {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1210, "InternalSemanticEventLogger_handleEvent", defpackage.ahot.a, true);
        defpackage.zbm zbmVar = this.b;
        try {
            defpackage.aazc aazcVar = zbmVar.g;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            defpackage.aimw aimwVar = (defpackage.aimw) defpackage.zbm.a.b().l("com/google/android/callingshared/cui/impl/InternalSemanticEventLogger", "handleEvent$<anonymous>", 132, "InternalSemanticEventLogger.kt");
            java.lang.String str = this.a;
            aimwVar.I("CUI event: %s; uniqueCallId: %s", mceVar, str == null ? "null" : str);
            zbmVar.c(mceVar, new defpackage.zbd(zbmVar, mceVar, str, jElapsedRealtime, null));
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahoqVarX.close();
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                    throw th2;
                }
            }
        }
    }
}

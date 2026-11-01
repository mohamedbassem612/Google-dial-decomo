package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sah {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/patrick/impl/checker/PatrickAvailabilityChecker");
    private final defpackage.sin b;

    public sah(defpackage.sin sinVar) {
        this.b = sinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object a(defpackage.aoln aolnVar) throws java.io.IOException {
        defpackage.sag sagVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.sag) {
            sagVar = (defpackage.sag) aolnVar;
            int i = sagVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sagVar.c = i - Integer.MIN_VALUE;
            } else {
                sagVar = new defpackage.sag(this, aolnVar);
            }
        } else {
            sagVar = new defpackage.sag(this, aolnVar);
        }
        java.lang.Object obj2 = sagVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sagVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (!defpackage.ahvr.R(sagVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(776, "PatrickAvailabilityChecker_isAvailable", defpackage.ahot.a, true);
            try {
                defpackage.sin sinVar = this.b;
                sagVar.d = ahoqVarX;
                sagVar.c = 1;
                java.lang.Object objD = sinVar.d(sagVar);
                obj = aoluVar;
                if (objD != aoluVar) {
                    obj2 = objD;
                    ahoqVar = ahoqVarX;
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarX;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = sagVar.d;
        try {
            defpackage.aooc.af(obj2);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        bool.booleanValue();
        ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/checker/PatrickAvailabilityChecker", "isAvailable$<anonymous>", 28, "PatrickAvailabilityChecker.kt")).y("isAvailable: %b", bool);
        defpackage.ajsz.ak(ahoqVar, null);
        obj = bool;
        return obj;
    }
}

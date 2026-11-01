package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mkj {
    private static final aimz c = aimz.i("com/android/dialer/dialpadview/simselector/service/SimSelectorService");
    public final defpackage.mki a;
    public final aozh b;
    private final aoss d;

    public mkj(defpackage.mki mkiVar, aoss aossVar) {
        aooh.f(mkiVar, "simSelectorFlow");
        aooh.f(aossVar, "lightweightScope");
        this.a = mkiVar;
        this.d = aossVar;
        aoxh aoxhVar = mkiVar.n;
        ipv ipvVar = new ipv((aoln) null, 16, (int[][][]) null);
        aooh.f(aoxhVar, "<this>");
        aooh.f(aossVar, "scope");
        aozj aozjVarA = aozk.a(new agws());
        aols aolsVar = aols.a;
        ahre.c(aossVar);
        aoov.al(aossVar, afsq.K(aolsVar), 4, new agwo((aoln) null, aoxhVar, ipvVar, aozjVarA));
        this.b = new aoys(aozjVarA, (aoub) null);
    }

    public final android.telecom.PhoneAccountHandle a() {
        defpackage.mki mkiVar = this.a;
        if (!((java.lang.Boolean) mkiVar.p.c()).booleanValue() || !((java.lang.Boolean) mkiVar.q.c()).booleanValue()) {
            c.b().l("com/android/dialer/dialpadview/simselector/service/SimSelectorService", "getCachedSelectedPhoneAccountHandle", 38, "SimSelectorService.kt").v("dialpad is not active");
            return null;
        }
        java.lang.Object objC = this.b.c();
        agwt agwtVar = objC instanceof agwt ? (agwt) objC : null;
        if (agwtVar == null) {
            c.b().l("com/android/dialer/dialpadview/simselector/service/SimSelectorService", "getCachedSelectedPhoneAccountHandle", 44, "SimSelectorService.kt").v("snapshot is null");
            return null;
        }
        defpackage.mjr mjrVar = (defpackage.mjr) agwtVar.a;
        if (mjrVar == null) {
            c.b().l("com/android/dialer/dialpadview/simselector/service/SimSelectorService", "getCachedSelectedPhoneAccountHandle", 50, "SimSelectorService.kt").v("model is null");
            return null;
        }
        int i = mkiVar.o.c() != null ? mjrVar.b : mjrVar.c;
        java.lang.Object objBH = ajsz.bH(mjrVar.a, i);
        if (objBH == null) {
            throw new java.lang.IllegalStateException(a.bj(i, "invalid index: "));
        }
        defpackage.mjq mjqVar = (defpackage.mjq) objBH;
        java.lang.String str = mjqVar.d;
        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
        if (componentNameUnflattenFromString != null) {
            return new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, mjqVar.e);
        }
        throw new java.lang.IllegalStateException("Invalid phoneAccountComponentName: ".concat(java.lang.String.valueOf(str)));
    }

    public final void b(boolean z) {
        this.a.q.e(java.lang.Boolean.valueOf(z));
    }

    public final void c(boolean z) {
        defpackage.mki mkiVar = this.a;
        aozj aozjVar = mkiVar.p;
        if (((java.lang.Boolean) aozjVar.c()).booleanValue() != z) {
            if (!z) {
                aozjVar.e(java.lang.Boolean.FALSE);
                return;
            }
            mkiVar.o.e((java.lang.Object) null);
            aozjVar.e(java.lang.Boolean.TRUE);
            mkiVar.k.d(aojh.a);
        }
    }
}

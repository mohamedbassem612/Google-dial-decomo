package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afak implements java.lang.Thread.UncaughtExceptionHandler {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ afak(java.lang.Object obj, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        if (this.$cid == 0) {
            ((defpackage.afal) this.b).b(this.a, thread, th);
            return;
        }
        java.lang.Object obj = this.b;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        try {
            try {
                uzx uzxVarC = ahnn.c(th);
                if (uzxVarC != null) {
                    java.lang.Object obj2 = uzxVarC.a;
                    defpackage.aesb aesbVarB = defpackage.aesb.b(((ahqg) obj2).b);
                    if (aesbVarB != null && aesbVarB.a() != null && !aesbVarB.c()) {
                        java.util.UUID uuid = ((ahqg) obj2).c;
                        long jZ = defpackage.ahvr.z(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
                        java.lang.Long lValueOf = java.lang.Long.valueOf(jZ);
                        defpackage.akzm akzmVarC = defpackage.aldf.c(((ahqg) obj2).d);
                        defpackage.aify aifyVar = (defpackage.aify) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(aesbVarB.b).map(new adci(9)), j$.util.Collection.-EL.stream(aesbVarB.a.entrySet()).map(new adci(10))).collect(defpackage.aido.a);
                        defpackage.akzx akzxVarM = defpackage.apeu.a.m();
                        akzxVarM.u();
                        defpackage.apeu apeuVar = (defpackage.apeu) akzxVarM.b;
                        apeuVar.b |= 1;
                        apeuVar.c = 0;
                        akzxVarM.u();
                        defpackage.apeu apeuVar2 = (defpackage.apeu) akzxVarM.b;
                        apeuVar2.f = 2;
                        apeuVar2.b |= 8;
                        akzxVarM.u();
                        defpackage.apeu apeuVar3 = (defpackage.apeu) akzxVarM.b;
                        defpackage.alat alatVar = apeuVar3.g;
                        if (!alatVar.c()) {
                            apeuVar3.g = defpackage.alad.J(alatVar);
                        }
                        defpackage.akyl.i(aifyVar, apeuVar3.g);
                        lValueOf.getClass();
                        akzxVarM.u();
                        defpackage.apeu apeuVar4 = (defpackage.apeu) akzxVarM.b;
                        apeuVar4.b |= 4;
                        apeuVar4.e = jZ;
                        if (akzmVarC != null) {
                            akzxVarM.u();
                            defpackage.apeu apeuVar5 = (defpackage.apeu) akzxVarM.b;
                            j$.util.Objects.requireNonNull(akzmVarC);
                            apeuVar5.d = akzmVarC;
                            apeuVar5.b |= 2;
                        }
                        defpackage.apeu apeuVar6 = (defpackage.apeu) akzxVarM.r();
                        defpackage.aequ aequVar = ((defpackage.aesc) obj).a;
                        defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                        aeqqVarA.d(true);
                        defpackage.akzx akzxVarM2 = defpackage.apgu.a.m();
                        akzxVarM2.u();
                        defpackage.apgu apguVar = (defpackage.apgu) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(apeuVar6);
                        apguVar.q = apeuVar6;
                        apguVar.b |= 524288;
                        aeqqVarA.f((defpackage.apgu) akzxVarM2.r());
                        aeqqVarA.b = null;
                        aequVar.a(aeqqVarA.a());
                    }
                }
            } catch (java.lang.Exception e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/cui/CuiMetricServiceImpl", "onApplicationStartup", 148, "CuiMetricServiceImpl.java")).v("Failed to end CUI.");
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}

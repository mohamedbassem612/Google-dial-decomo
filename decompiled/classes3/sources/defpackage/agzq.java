package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzq {
    public static final aimz a = aimz.i("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater");
    public final aifl b;
    public final java.util.concurrent.Executor c;
    public final java.util.concurrent.Executor d;
    public final agtg e;
    public final java.util.Set f = new acc(0);
    public java.util.Set g = new acc(0);
    public int h = 2;

    public agzq(aifl aiflVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, agtg agtgVar) {
        this.b = aiflVar;
        this.c = executor;
        this.d = executor2;
        this.e = agtgVar;
    }

    public static void a(defpackage.agza agzaVar, defpackage.agzu agzuVar) {
        afec.c();
        if (agzuVar.b()) {
            ahoq ahoqVarW = ahvr.W(1340, "LocalSubscription onLoaded()");
            try {
                agsv agsvVarA = agsw.a();
                try {
                    agzaVar.b(agzuVar.a());
                    agsvVarA.close();
                    ahoqVarW.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        agsvVarA.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        ahoq ahoqVarW2 = ahvr.W(1339, "LocalSubscription onLoadError()");
        try {
            agsv agsvVarA2 = agsw.a();
            try {
                agzaVar.a(agzuVar.c());
                agsvVarA2.close();
                ahoqVarW2.close();
            } catch (java.lang.Throwable th5) {
                try {
                    agsvVarA2.close();
                } catch (java.lang.Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (java.lang.Throwable th7) {
            try {
                ahoqVarW2.close();
            } catch (java.lang.Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    private final void e(ajcq ajcqVar) {
        afec.c();
        this.g.add(ajcqVar);
        ajcqVar.c(ahqx.h(new defpackage.agrz(this, ajcqVar, 4)), this.d);
    }

    public final void b(defpackage.amdx amdxVar, ajcq ajcqVar) {
        ajcq ajcqVarA = aiql.A(ajcqVar);
        defpackage.agnx agnxVar = new defpackage.agnx(this, amdxVar, 5);
        java.util.concurrent.Executor executor = this.d;
        e(ahvr.B(ahvr.H(ajcqVarA, agnxVar, executor), java.lang.Throwable.class, new defpackage.agnx(this, amdxVar, 6), executor));
    }

    public final void c(defpackage.amdx amdxVar) {
        afec.c();
        this.f.add(amdxVar);
        if (this.h == 2) {
            this.h = 1;
            e(ahvr.E(new defpackage.agdr(this, 13), this.e));
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [agyz, java.lang.Object] */
    public final void d(defpackage.amdx amdxVar) {
        agzo agzoVar = new agzo(this, amdxVar, 2);
        afec.c();
        ahvr.cj(amdxVar.a, "LocalSubscriptionStateReference used after free.");
        java.lang.Object obj = amdxVar.a;
        defpackage.achb achbVar = new defpackage.achb(amdxVar, 7);
        defpackage.agzr agzrVar = (defpackage.agzr) obj;
        ahyn ahynVar = agzrVar.b;
        if (ahynVar.f()) {
            ahynVar.b().cancel(false);
        }
        ahys ahysVar = agzrVar.a;
        ahoq ahoqVarW = ahvr.W(1341, "LocalSubscription newLoad");
        try {
            ajcq ajcqVarB = ahysVar.a.b();
            ahoqVarW.a(ajcqVarB);
            aa$.ExternalSyntheticApiModelOutline1.m(achbVar, new defpackage.agzr(ahysVar, ahyn.h(ajcqVarB), ((defpackage.agzr) obj).c, ((defpackage.agzr) obj).d));
            aa$.ExternalSyntheticApiModelOutline1.m(agzoVar, ajcqVarB);
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

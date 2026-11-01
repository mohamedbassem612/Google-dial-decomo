package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aevm {
    public volatile defpackage.aevp a;
    public volatile boolean b;
    public volatile defpackage.aevg c;

    public aevm(final android.content.Context context, final java.util.concurrent.Executor executor, final defpackage.aevo aevoVar, final defpackage.amwu amwuVar, boolean z, defpackage.ahyn ahynVar, final defpackage.aoin aoinVar, final defpackage.ahbm ahbmVar) {
        this.a = defpackage.aevo.a;
        this.b = true;
        this.c = new defpackage.aevi();
        if (!z || ahynVar.f()) {
            aoinVar = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: aevl
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.aevm aevmVar = this.a;
                defpackage.amwu amwuVar2 = amwuVar;
                defpackage.ahbm ahbmVar2 = ahbmVar;
                android.content.Context context2 = context;
                if (defpackage.abyl.i(context2)) {
                    aevmVar.c(amwuVar2, ahbmVar2);
                } else {
                    defpackage.abyl.d(context2, new abb(aevmVar, amwuVar2, ahbmVar2, executor, 11, (short[]) null));
                }
                if (aevmVar.b) {
                    aevmVar.b(aevoVar, aoinVar);
                }
            }
        });
    }

    public final defpackage.apga a(defpackage.aevn aevnVar) {
        boolean z = this.b;
        defpackage.aevp aevpVar = this.a;
        return z ? aevpVar.b(aevnVar) : aevpVar.e();
    }

    public final void b(defpackage.aevo aevoVar, defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.akzx akzxVarM = defpackage.apga.a.m();
            akzxVarM.u();
            defpackage.apga apgaVar = (defpackage.apga) akzxVarM.b;
            apgaVar.e = 2;
            apgaVar.b |= 2;
            this.a = aevoVar.a((defpackage.apga) akzxVarM.r());
            return;
        }
        try {
            this.a = aevoVar.a((defpackage.apga) aoinVar.a());
        } catch (java.lang.Throwable th) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(th)).l("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", (char) 145, "Sampler.java")).v("Couldn't get sampling strategy");
            defpackage.akzx akzxVarM2 = defpackage.apga.a.m();
            akzxVarM2.u();
            defpackage.apga apgaVar2 = (defpackage.apga) akzxVarM2.b;
            apgaVar2.c = 2;
            apgaVar2.d = 1;
            akzxVarM2.u();
            defpackage.apga apgaVar3 = (defpackage.apga) akzxVarM2.b;
            apgaVar3.e = 3;
            apgaVar3.b |= 2;
            this.a = aevoVar.a((defpackage.apga) akzxVarM2.r());
        }
    }

    public final void c(defpackage.amwu amwuVar, defpackage.ahbm ahbmVar) {
        try {
            defpackage.aepy aepyVar = (defpackage.aepy) amwuVar.a();
            this.b = aepyVar.b();
            final int iA = aepyVar.a();
            this.c = ahbmVar.a ? new defpackage.aevi() : new defpackage.aevj(new defpackage.aoin() { // from class: aevh
                @Override // defpackage.aoin, defpackage.aoim
                public final java.lang.Object a() {
                    return java.lang.Integer.valueOf(iA);
                }
            });
        } catch (java.lang.Throwable th) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(th)).l("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", '|', "Sampler.java")).v("Couldn't get config");
            this.b = false;
        }
    }

    public aevm(defpackage.aevo aevoVar, defpackage.aoin aoinVar) {
        this.a = defpackage.aevo.a;
        this.b = true;
        this.c = new aevk();
        this.b = true;
        b(aevoVar, aoinVar);
    }
}

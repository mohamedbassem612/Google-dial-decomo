package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kew {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/dataservice/CallLogFragmentDataService");
    public static final defpackage.agxj b = new defpackage.agxj("CALL_LOG_FRAGMENT");
    public final defpackage.aoss c;
    public final defpackage.uqz d;
    public final defpackage.aogc e;
    public final defpackage.agab f;
    private final defpackage.zrw g;
    private final defpackage.ahbv h;

    public kew(defpackage.ahbv ahbvVar, defpackage.uqz uqzVar, defpackage.aogc aogcVar, defpackage.zrw zrwVar, defpackage.agab agabVar, defpackage.aoss aossVar) {
        if (uqzVar == null) {
            defpackage.aooh.i("activityRetainedState");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("resultPropagator");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.h = ahbvVar;
        this.d = uqzVar;
        this.e = aogcVar;
        this.g = zrwVar;
        this.f = agabVar;
        this.c = aossVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [aoss, java.lang.Object] */
    public final java.lang.Object a(defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        ket ketVar;
        defpackage.kex kexVar;
        if (aolnVar instanceof ket) {
            ketVar = (ket) aolnVar;
            int i = ketVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ketVar.d = i - Integer.MIN_VALUE;
            } else {
                ketVar = new ket(this, aolnVar);
            }
        } else {
            ketVar = new ket(this, aolnVar);
        }
        java.lang.Object objA = ketVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ketVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aonjVar = (defpackage.aonj) ketVar.a;
                defpackage.aooc.af(objA);
            } else if (i2 == 2) {
                kexVar = ketVar.e;
                aonjVar = (defpackage.aonj) ketVar.a;
                defpackage.aooc.af(objA);
                if (!((java.lang.Boolean) objA).booleanValue()) {
                    return new kfd(kexVar.a, 2);
                }
                ketVar.a = kexVar;
                ketVar.e = null;
                ketVar.d = 3;
                objA = aonjVar.a(ketVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kexVar = (defpackage.kex) ketVar.a;
                defpackage.aooc.af(objA);
            }
            return new kfd(true, (kdf) objA, kexVar.a);
        }
        defpackage.aooc.af(objA);
        ((defpackage.aimw) a.b().l("com/android/dialer/calllog/dataservice/CallLogFragmentDataService", "loadUiModelWithProducer", 132, "CallLogFragmentDataService.kt")).v("loadUiModel");
        defpackage.uqz uqzVar = this.d;
        ketVar.a = aonjVar;
        ketVar.d = 1;
        objA = defpackage.ahvr.ag(uqzVar.b, (defpackage.ahda) uqzVar.d, new jrb(uqzVar, (defpackage.aoln) null, 5)).a(ketVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.zrw zrwVar = this.g;
        defpackage.kex kexVar2 = (defpackage.kex) objA;
        ketVar.a = aonjVar;
        ketVar.e = kexVar2;
        ketVar.d = 2;
        java.lang.Object objJ = zrwVar.j(ketVar);
        if (objJ == aoluVar) {
            return aoluVar;
        }
        objA = objJ;
        kexVar = kexVar2;
        if (!((java.lang.Boolean) objA).booleanValue()) {
            return new kfd(kexVar.a, 2);
        }
        ketVar.a = kexVar;
        ketVar.e = null;
        ketVar.d = 3;
        objA = aonjVar.a(ketVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        return new kfd(true, (kdf) objA, kexVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        keu keuVar;
        if (aolnVar instanceof keu) {
            keuVar = (keu) aolnVar;
            int i = keuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                keuVar.c = i - Integer.MIN_VALUE;
            } else {
                keuVar = new keu(this, aolnVar);
            }
        } else {
            keuVar = new keu(this, aolnVar);
        }
        java.lang.Object objD = keuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = keuVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ahbv ahbvVar = this.h;
            defpackage.ajcq ajcqVarX = ahbvVar.x();
            hky hkyVar = new hky(ahbvVar, 15);
            ?? r4 = ahbvVar.e;
            defpackage.agsm.i(192, defpackage.ahvr.I(ajcqVarX, hkyVar, r4), "failed to prewarm call log data", new java.lang.Object[0]);
            defpackage.ajcq ajcqVarH = defpackage.ahvr.H(defpackage.ahvr.I(ajcqVarX, new hky(ahbvVar, 16), r4), new jvq(7), r4);
            keuVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarH, keuVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        kde kdeVar = new kde((kdf) objD);
        kdeVar.c(true);
        return kdeVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Throwable {
        kev kevVar;
        if (aolnVar instanceof kev) {
            kevVar = (kev) aolnVar;
            int i = kevVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kevVar.c = i - Integer.MIN_VALUE;
            } else {
                kevVar = new kev(this, aolnVar);
            }
        } else {
            kevVar = new kev(this, aolnVar);
        }
        java.lang.Object objD = kevVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kevVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ahbv ahbvVar = this.h;
            java.lang.Object obj = ahbvVar.c;
            defpackage.ajcq ajcqVarX = ahbvVar.x();
            j$.util.Optional optionalG = ((defpackage.zjm) obj).g();
            if (true == optionalG.isPresent()) {
                optionalG = j$.util.Optional.ofNullable(((defpackage.tcv) ((defpackage.aogc) optionalG.get()).a).a());
            }
            defpackage.ajcq ajcqVar = (defpackage.ajcq) optionalG.orElse(defpackage.aiql.z(defpackage.tcp.UNSUPPORTED));
            ?? r13 = ahbvVar.a;
            java.lang.Object obj2 = ahbvVar.b;
            j$.util.Objects.requireNonNull(obj2);
            defpackage.ajcq ajcqVarSubmit = r13.submit(defpackage.ahqx.i(new jyr(obj2, 2)));
            ibe ibeVar = new ibe(5);
            ?? r14 = ahbvVar.e;
            defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ajcqVarSubmit, ibeVar, r14);
            defpackage.ajcq ajcqVarP = defpackage.ahvr.ak(ajcqVarX, ajcqVarI, ajcqVarSubmit).p(new kff(ahbvVar, ajcqVarX, ajcqVarI, ajcqVarSubmit, 1), r14);
            defpackage.agsm.i(191, defpackage.ahvr.I(ajcqVarX, new hky(ahbvVar, 17), r14), "failed to prewarm call log data", new java.lang.Object[0]);
            defpackage.ajcq ajcqVarI2 = defpackage.ahvr.I(ajcqVarX, new hky(ahbvVar, 18), r14);
            defpackage.ajcq ajcqVarO = defpackage.ahvr.ak(ajcqVarI2, ajcqVarP, ajcqVar).o(new hsl(ajcqVarI2, ajcqVarP, ajcqVar, 4, (byte[]) null), r14);
            kevVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarO, kevVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return objD;
    }

    public final void d() {
        ((defpackage.aimw) a.b().l("com/android/dialer/calllog/dataservice/CallLogFragmentDataService", "forceRefreshUi", 85, "CallLogFragmentDataService.kt")).v("forceRefreshUi");
        this.e.s(defpackage.aosv.F(this.c, 0, new jlk(this, (defpackage.aoln) null, 18), 3), b);
    }
}

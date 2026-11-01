package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqf {
    private static final aimz a = aimz.i("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerPreconditionCheckerImpl");
    private final defpackage.tqd b;
    private final defpackage.tnq c;
    private final defpackage.taq d;
    private final defpackage.zlr e;

    public tqf(defpackage.zlr zlrVar, defpackage.tqd tqdVar, defpackage.rai raiVar, defpackage.tnq tnqVar) {
        aooh.f(raiVar, "devicePreconditionDataProviderFactory");
        aooh.f(tnqVar, "aiCoreAvailabilityListener");
        this.e = zlrVar;
        this.b = tqdVar;
        this.c = tnqVar;
        this.d = new defpackage.taq((defpackage.ysb) ((hih) raiVar.a).a.lH.a(), tnqVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.tqe tqeVar;
        java.lang.Object tqhVar;
        defpackage.ywz ywzVar;
        java.lang.Object tqhVar2;
        java.lang.Object obj;
        defpackage.tqg tqgVar;
        boolean zN;
        aimz aimzVar;
        if (aolnVar instanceof defpackage.tqe) {
            tqeVar = (defpackage.tqe) aolnVar;
            int i = tqeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqeVar.c = i - Integer.MIN_VALUE;
            } else {
                tqeVar = new defpackage.tqe(this, aolnVar);
            }
        } else {
            tqeVar = new defpackage.tqe(this, aolnVar);
        }
        java.lang.Object objD = tqeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tqeVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            ywzVar = (defpackage.ywz) objD;
            j$.util.Objects.checkIndex(0, 4);
            if (ywzVar != null) {
                if (ywzVar instanceof defpackage.ywy) {
                    tqhVar2 = new defpackage.tql(new defpackage.tqn((defpackage.ywy) ywzVar));
                } else if (ywzVar instanceof defpackage.yww) {
                    tqhVar2 = new defpackage.tqh(new defpackage.tqj((defpackage.yww) ywzVar));
                } else if (ywzVar instanceof defpackage.ywv) {
                    tqhVar2 = defpackage.tqg.a;
                }
                obj = tqhVar2;
                tqgVar = defpackage.tqg.a;
                zN = aooh.n(obj, tqgVar);
                aimzVar = a;
                if (zN) {
                    aimzVar.b().l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerPreconditionCheckerImpl", "check", 62, "SharpieDialerPreconditionCheckerImpl.kt").v("All preconditions are met.");
                    return tqgVar;
                }
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerPreconditionCheckerImpl", "check", 58, "SharpieDialerPreconditionCheckerImpl.kt").y("Device precondition is not met: %s", obj);
                return obj;
            }
            throw new aois();
        }
        aooc.af(objD);
        defpackage.tqd tqdVar = this.b;
        tqdVar.c = new aiuo(new defpackage.sbm(tqdVar, (aoln) null, 18, (byte[]) null));
        defpackage.zlr zlrVar = this.e;
        tqeVar.c = 1;
        objD = zlrVar.d(tqdVar, tqeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        defpackage.ywr ywrVar = (defpackage.ywr) objD;
        j$.util.Objects.checkIndex(0, 4);
        if (ywrVar != null) {
            if (ywrVar instanceof defpackage.ywq) {
                tqhVar = new defpackage.tql(new defpackage.tqm((defpackage.ywq) ywrVar));
            } else if (ywrVar instanceof defpackage.ywp) {
                tqhVar = new defpackage.tqh(new defpackage.tqi((defpackage.ywp) ywrVar));
            } else if (ywrVar instanceof defpackage.ywo) {
                tqhVar = defpackage.tqg.a;
            }
            if (!aooh.n(tqhVar, defpackage.tqg.a)) {
                a.b().l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerPreconditionCheckerImpl", "check", 51, "SharpieDialerPreconditionCheckerImpl.kt").y("Call precondition is not met: %s", tqhVar);
                return tqhVar;
            }
            defpackage.zlr zlrVar2 = this.e;
            defpackage.taq taqVar = this.d;
            tqeVar.c = 2;
            objD = zlrVar2.e(taqVar, tqeVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            ywzVar = (defpackage.ywz) objD;
            j$.util.Objects.checkIndex(0, 4);
            if (ywzVar != null) {
                if (ywzVar instanceof defpackage.ywy) {
                    tqhVar2 = new defpackage.tql(new defpackage.tqn((defpackage.ywy) ywzVar));
                } else if (ywzVar instanceof defpackage.yww) {
                    tqhVar2 = new defpackage.tqh(new defpackage.tqj((defpackage.yww) ywzVar));
                } else if (ywzVar instanceof defpackage.ywv) {
                    tqhVar2 = defpackage.tqg.a;
                }
                obj = tqhVar2;
                tqgVar = defpackage.tqg.a;
                zN = aooh.n(obj, tqgVar);
                aimzVar = a;
                if (zN) {
                    aimzVar.b().l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerPreconditionCheckerImpl", "check", 58, "SharpieDialerPreconditionCheckerImpl.kt").y("Device precondition is not met: %s", obj);
                    return obj;
                }
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerPreconditionCheckerImpl", "check", 62, "SharpieDialerPreconditionCheckerImpl.kt").v("All preconditions are met.");
                return tqgVar;
            }
            throw new aois();
        }
        throw new aois();
    }
}

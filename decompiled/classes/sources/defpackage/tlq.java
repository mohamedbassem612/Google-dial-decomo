package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tlq implements defpackage.ecs {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sharpie/impl/joyball/SharpieJoyballMigration");
    private final defpackage.rlv b;
    private final defpackage.ecx c;
    private final defpackage.ipo d;

    public tlq(defpackage.ipo ipoVar, defpackage.rlv rlvVar, defpackage.ecx ecxVar) {
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aooh.f(ecxVar, "dataStore");
        this.d = ipoVar;
        this.b = rlvVar;
        this.c = ecxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        tln tlnVar;
        if (aolnVar instanceof tln) {
            tlnVar = (tln) aolnVar;
            int i = tlnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlnVar.c = i - Integer.MIN_VALUE;
            } else {
                tlnVar = new tln(this, aolnVar);
            }
        } else {
            tlnVar = new tln(this, aolnVar);
        }
        java.lang.Object obj = tlnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tlnVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.c;
            bbf bbfVar = new bbf((defpackage.aoln) null, 16, (int[][][]) null);
            tlnVar.c = 1;
            if (ecxVar.a(bbfVar, tlnVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.ecs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return e(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object b(defpackage.tru truVar, defpackage.aoln aolnVar) {
        tlo tloVar;
        defpackage.tvn tvnVarI;
        defpackage.tvn tvnVar;
        if (aolnVar instanceof tlo) {
            tloVar = (tlo) aolnVar;
            int i = tloVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tloVar.c = i - Integer.MIN_VALUE;
            } else {
                tloVar = new tlo(this, aolnVar);
            }
        } else {
            tloVar = new tlo(this, aolnVar);
        }
        java.lang.Object objAu = tloVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tloVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            tvnVarI = defpackage.ttj.i(truVar.L());
            defpackage.rlv rlvVar = this.b;
            rlvVar.o(defpackage.rmx.SHARPIE_JOYBALL_MIGRATE_START);
            java.lang.Object obj = tvnVarI.a;
            trv trvVar = trv.a;
            trt trtVarB = trt.b(((defpackage.tru) ((defpackage.akzx) obj).b).c);
            if (trtVarB == null) {
                trtVarB = trt.f;
            }
            if (trvVar.b(trtVarB)) {
                rlvVar.o(defpackage.rmx.SHARPIE_JOYBALL_ALREADY_OPTED_IN);
            } else {
                defpackage.aoxh aoxhVarB = this.c.b();
                tloVar.d = tvnVarI;
                tloVar.e = tvnVarI;
                tloVar.c = 1;
                objAu = defpackage.aoov.au(aoxhVarB, tloVar);
                if (objAu == aoluVar) {
                    return aoluVar;
                }
                tvnVar = tvnVarI;
            }
            return tvnVarI.d();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tvnVarI = tloVar.e;
        tvnVar = tloVar.d;
        defpackage.aooc.af(objAu);
        if (((tlf) objAu).c) {
            tvnVarI.e(trt.e);
            this.b.o(defpackage.rmx.SHARPIE_JOYBALL_OPT_IN);
        }
        tvnVarI = tvnVar;
        return tvnVarI.d();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        tlp tlpVar;
        boolean zBooleanValue;
        defpackage.aimz aimzVar;
        if (aolnVar instanceof tlp) {
            tlpVar = (tlp) aolnVar;
            int i = tlpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlpVar.c = i - Integer.MIN_VALUE;
            } else {
                tlpVar = new tlp(this, aolnVar);
            }
        } else {
            tlpVar = new tlp(this, aolnVar);
        }
        java.lang.Object objAu = tlpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tlpVar.c;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objAu);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAu);
            }
            zBooleanValue = ((java.lang.Boolean) objAu).booleanValue();
            aimzVar = a;
            if (zBooleanValue) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sharpie/impl/joyball/SharpieJoyballMigration", "shouldMigrate", 34, "SharpieJoyballMigration.kt")).v("pending backup; should not migrate");
            } else {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sharpie/impl/joyball/SharpieJoyballMigration", "shouldMigrate", 38, "SharpieJoyballMigration.kt")).v("should migrate");
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        defpackage.aooc.af(objAu);
        defpackage.aoxh aoxhVarB = this.c.b();
        tlpVar.c = 1;
        objAu = defpackage.aoov.au(aoxhVarB, tlpVar);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        if (defpackage.aooh.n(objAu, defpackage.wsc.cx(tlf.a.m()).ah())) {
            ((defpackage.aimw) a.b().l("com/android/dialer/sharpie/impl/joyball/SharpieJoyballMigration", "shouldMigrate", 30, "SharpieJoyballMigration.kt")).v("nothing to migrate; should not migrate");
        } else {
            defpackage.ipo ipoVar = this.d;
            defpackage.iot iotVar = defpackage.tsc.b;
            tlpVar.c = 2;
            objAu = ipoVar.a(iotVar, tlpVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            zBooleanValue = ((java.lang.Boolean) objAu).booleanValue();
            aimzVar = a;
            if (zBooleanValue) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sharpie/impl/joyball/SharpieJoyballMigration", "shouldMigrate", 34, "SharpieJoyballMigration.kt")).v("pending backup; should not migrate");
            } else {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sharpie/impl/joyball/SharpieJoyballMigration", "shouldMigrate", 38, "SharpieJoyballMigration.kt")).v("should migrate");
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}

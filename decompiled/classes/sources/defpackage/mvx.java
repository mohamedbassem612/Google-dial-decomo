package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mvx implements defpackage.ecs {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/dobby/impl/joyball/DobbyJoyballMigration");
    public final defpackage.uhs a;
    private final defpackage.ajct c;
    private final defpackage.rlv d;
    private final defpackage.ecx e;
    private final defpackage.ipo f;

    public mvx(defpackage.ipo ipoVar, defpackage.ajct ajctVar, defpackage.rlv rlvVar, defpackage.ecx ecxVar, defpackage.uhs uhsVar) {
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        if (uhsVar == null) {
            defpackage.aooh.i("spamSettings");
        }
        this.f = ipoVar;
        this.c = ajctVar;
        this.d = rlvVar;
        this.e = ecxVar;
        this.a = uhsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        mvs mvsVar;
        if (aolnVar instanceof mvs) {
            mvsVar = (mvs) aolnVar;
            int i = mvsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvsVar.c = i - Integer.MIN_VALUE;
            } else {
                mvsVar = new mvs(this, aolnVar);
            }
        } else {
            mvsVar = new mvs(this, aolnVar);
        }
        java.lang.Object obj = mvsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mvsVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.e;
            bbf bbfVar = new bbf((defpackage.aoln) null, 8, (char[][]) null);
            mvsVar.c = 1;
            if (ecxVar.a(bbfVar, mvsVar) == aoluVar) {
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
        return g(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object b(defpackage.nok nokVar, defpackage.aoln aolnVar) {
        mvt mvtVar;
        defpackage.kaw kawVarAO;
        java.lang.Object obj;
        defpackage.kaw kawVar;
        defpackage.kaw kawVar2;
        if (aolnVar instanceof mvt) {
            mvtVar = (mvt) aolnVar;
            int i = mvtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvtVar.c = i - Integer.MIN_VALUE;
            } else {
                mvtVar = new mvt(this, aolnVar);
            }
        } else {
            mvtVar = new mvt(this, aolnVar);
        }
        java.lang.Object obj2 = mvtVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mvtVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.kaw kawVar3 = mvtVar.e;
                defpackage.kaw kawVar4 = mvtVar.d;
                defpackage.aooc.af(obj2);
                kawVar = kawVar3;
                kawVarAO = kawVar4;
                obj = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kawVar2 = mvtVar.d;
                defpackage.aooc.af(obj2);
            }
            return kawVar2.D();
        }
        defpackage.aooc.af(obj2);
        kawVarAO = defpackage.gus.aO(nokVar.L());
        defpackage.rlv rlvVar = this.d;
        rlvVar.o(defpackage.rmx.DOBBY_JOYBALL_MIGRATE_START);
        noh nohVarB = noh.b(((defpackage.nok) ((defpackage.akzx) kawVarAO.a).b).c);
        if (nohVarB == null) {
            nohVarB = noh.k;
        }
        if (defpackage.mni.D(nohVarB)) {
            rlvVar.o(defpackage.rmx.DOBBY_JOYBALL_ALREADY_OPTED_IN);
        } else {
            defpackage.aoxh aoxhVarB = this.e.b();
            mvtVar.d = kawVarAO;
            mvtVar.e = kawVarAO;
            mvtVar.c = 1;
            java.lang.Object objAu = defpackage.aoov.au(aoxhVarB, mvtVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            obj = objAu;
            kawVar = kawVarAO;
        }
        kawVar2 = kawVarAO;
        return kawVar2.D();
        if (((defpackage.mvm) obj).c) {
            kawVar.F(noh.i);
            if (kawVar.C() == noi.a) {
                kawVar.G(noi.c);
                this.d.o(defpackage.rmx.DOBBY_JOYBALL_OPT_IN_WITHOUT_EXISTING_PROTECTION_LEVEL);
            } else {
                this.d.o(defpackage.rmx.DOBBY_JOYBALL_OPT_IN_WITH_EXISTING_PROTECTION_LEVEL);
            }
            if (this.a.e()) {
                mvtVar.d = kawVarAO;
                mvtVar.e = null;
                mvtVar.c = 2;
                if (f(true, mvtVar) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        kawVar2 = kawVarAO;
        return kawVar2.D();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) throws java.lang.Throwable {
        mvv mvvVar;
        if (aolnVar instanceof mvv) {
            mvvVar = (mvv) aolnVar;
            int i = mvvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvvVar.c = i - Integer.MIN_VALUE;
            } else {
                mvvVar = new mvv(this, aolnVar);
            }
        } else {
            mvvVar = new mvv(this, aolnVar);
        }
        java.lang.Object objD = mvvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mvvVar.c;
        boolean z = false;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.uhs uhsVar = this.a;
            if (uhsVar.e()) {
                defpackage.ajcq ajcqVarB = uhsVar.b();
                defpackage.aooh.e(ajcqVarB, "isSpamBlockingEnabledByUser(...)");
                mvvVar.c = 1;
                objD = defpackage.aosv.D(ajcqVarB, mvvVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objD);
        if (((java.lang.Boolean) objD).booleanValue()) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(boolean z, defpackage.aoln aolnVar) throws java.lang.Throwable {
        mvw mvwVar;
        if (aolnVar instanceof mvw) {
            mvwVar = (mvw) aolnVar;
            int i = mvwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvwVar.d = i - Integer.MIN_VALUE;
            } else {
                mvwVar = new mvw(this, aolnVar);
            }
        } else {
            mvwVar = new mvw(this, aolnVar);
        }
        java.lang.Object objE = mvwVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mvwVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objE);
            mvwVar.a = z;
            mvwVar.d = 1;
            objE = e(mvwVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = mvwVar.a;
            defpackage.aooc.af(objE);
        }
        if (((java.lang.Boolean) objE).booleanValue() != z) {
            this.c.execute(defpackage.ahqx.h(new gql(this, z, 3)));
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.aoln aolnVar) {
        mvu mvuVar;
        boolean zBooleanValue;
        defpackage.aimz aimzVar;
        if (aolnVar instanceof mvu) {
            mvuVar = (mvu) aolnVar;
            int i = mvuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvuVar.c = i - Integer.MIN_VALUE;
            } else {
                mvuVar = new mvu(this, aolnVar);
            }
        } else {
            mvuVar = new mvu(this, aolnVar);
        }
        java.lang.Object objAu = mvuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mvuVar.c;
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
            aimzVar = b;
            if (zBooleanValue) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dobby/impl/joyball/DobbyJoyballMigration", "shouldMigrate", 44, "DobbyJoyballMigration.kt")).v("pending backup; should not migrate");
            } else {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dobby/impl/joyball/DobbyJoyballMigration", "shouldMigrate", 48, "DobbyJoyballMigration.kt")).v("should migrate");
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        defpackage.aooc.af(objAu);
        defpackage.aoxh aoxhVarB = this.e.b();
        mvuVar.c = 1;
        objAu = defpackage.aoov.au(aoxhVarB, mvuVar);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        if (defpackage.aooh.n(objAu, defpackage.gus.aP(defpackage.mvm.a.m()).K())) {
            ((defpackage.aimw) b.b().l("com/android/dialer/dobby/impl/joyball/DobbyJoyballMigration", "shouldMigrate", 40, "DobbyJoyballMigration.kt")).v("nothing to migrate; should not migrate");
        } else {
            defpackage.ipo ipoVar = this.f;
            defpackage.iot iotVar = defpackage.nni.a;
            mvuVar.c = 2;
            objAu = ipoVar.a(iotVar, mvuVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            zBooleanValue = ((java.lang.Boolean) objAu).booleanValue();
            aimzVar = b;
            if (zBooleanValue) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dobby/impl/joyball/DobbyJoyballMigration", "shouldMigrate", 44, "DobbyJoyballMigration.kt")).v("pending backup; should not migrate");
            } else {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/dobby/impl/joyball/DobbyJoyballMigration", "shouldMigrate", 48, "DobbyJoyballMigration.kt")).v("should migrate");
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}

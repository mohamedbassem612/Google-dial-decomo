package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nni implements defpackage.iox {
    public static final defpackage.iot a = new defpackage.iot(defpackage.nnb.a, defpackage.nnc.a, new defpackage.kxd(2), defpackage.nnd.a);
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/dobby/impl/settings/service/DobbyBackup");
    public final defpackage.iqe c;
    public final defpackage.rlv d;
    private final defpackage.aoin e;
    private final nox f;

    public nni(nox noxVar, defpackage.iqe iqeVar, defpackage.aoin aoinVar, defpackage.rlv rlvVar) {
        if (iqeVar == null) {
            defpackage.aooh.i("backupMigrationFactory");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("dataStore");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.f = noxVar;
        this.c = iqeVar;
        this.e = aoinVar;
        this.d = rlvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.nok nokVar, defpackage.aoln aolnVar) {
        nnh nnhVar;
        if (aolnVar instanceof nnh) {
            nnhVar = (nnh) aolnVar;
            int i = nnhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnhVar.c = i - Integer.MIN_VALUE;
            } else {
                nnhVar = new nnh(this, aolnVar);
            }
        } else {
            nnhVar = new nnh(this, aolnVar);
        }
        java.lang.Object objAu = nnhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nnhVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                nokVar = nnhVar.d;
                defpackage.aooc.af(objAu);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAu);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objAu);
        defpackage.aoxh aoxhVarB = ((defpackage.ecx) this.e.a()).b();
        nnhVar.d = nokVar;
        nnhVar.c = 1;
        objAu = defpackage.aoov.au(aoxhVarB, nnhVar);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        defpackage.nok nokVar2 = (defpackage.nok) objAu;
        noh nohVarB = noh.b(nokVar.c);
        if (nohVarB == null) {
            nohVarB = noh.k;
        }
        if (defpackage.mni.D(nohVarB)) {
            noh nohVarB2 = noh.b(nokVar2.c);
            if (nohVarB2 == null) {
                nohVarB2 = noh.k;
            }
            if (defpackage.mni.D(nohVarB2)) {
                nox noxVar = this.f;
                nnhVar.d = null;
                nnhVar.c = 2;
                objAu = noxVar.a(nnhVar);
                if (objAu == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.iox
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        nne nneVar;
        if (aolnVar instanceof nne) {
            nneVar = (nne) aolnVar;
            int i = nneVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nneVar.c = i - Integer.MIN_VALUE;
            } else {
                nneVar = new nne(this, aolnVar);
            }
        } else {
            nneVar = new nne(this, aolnVar);
        }
        java.lang.Object objAu = nneVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nneVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            defpackage.aoxh aoxhVarB = ((defpackage.ecx) this.e.a()).b();
            nneVar.c = 1;
            objAu = defpackage.aoov.au(aoxhVarB, nneVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAu);
        }
        defpackage.kaw kawVarAO = defpackage.gus.aO(((defpackage.nok) objAu).L());
        this.d.o(defpackage.rmx.BACKUP_DOBBY_BACKED_UP);
        defpackage.akzx akzxVar = (defpackage.akzx) kawVarAO.a;
        akzxVar.u();
        defpackage.nok nokVar = (defpackage.nok) akzxVar.b;
        nokVar.e = null;
        nokVar.b &= -3;
        return kawVarAO.D();
    }

    @Override // defpackage.iox
    public final defpackage.iot c() {
        return a;
    }
}

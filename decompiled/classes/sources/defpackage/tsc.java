package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tsc implements defpackage.iox {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sharpie/impl/settings/service/SharpieBackup");
    public static final defpackage.iot b = new defpackage.iot(defpackage.trw.a, defpackage.trx.a, new defpackage.kxd(3), defpackage.nnd.c);
    public final defpackage.iqe c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;

    public tsc(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.iqe iqeVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("settings");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("settingsDataService");
        }
        if (iqeVar == null) {
            defpackage.aooh.i("backupMigrationFactory");
        }
        this.d = aoinVar;
        this.e = aoinVar2;
        this.c = iqeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.tru truVar, defpackage.aoln aolnVar) {
        try tryVar;
        if (aolnVar instanceof try) {
            tryVar = (try) aolnVar;
            int i = tryVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tryVar.c = i - Integer.MIN_VALUE;
            } else {
                tryVar = new try(this, aolnVar);
            }
        } else {
            tryVar = new try(this, aolnVar);
        }
        java.lang.Object objAu = tryVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tryVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                truVar = tryVar.d;
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
        defpackage.aogc aogcVar = (defpackage.aogc) this.d.a();
        tryVar.d = truVar;
        tryVar.c = 1;
        objAu = aogcVar.au(tryVar);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        if (defpackage.aooh.n(objAu, truVar)) {
            ((defpackage.aimw) a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieBackup", "applySideEffect", 70, "SharpieBackup.kt")).v("Backup ignored, skipping side effect.");
            return defpackage.aojh.a;
        }
        defpackage.tsg tsgVar = (defpackage.tsg) this.e.a();
        trt trtVarB = trt.b(truVar.c);
        if (trtVarB == null) {
            trtVarB = trt.f;
        }
        defpackage.ajcq ajcqVarA = tsgVar.a(trtVarB);
        tryVar.d = null;
        tryVar.c = 2;
        if (defpackage.aosv.D(ajcqVarA, tryVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.iox
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        trz trzVar;
        if (aolnVar instanceof trz) {
            trzVar = (trz) aolnVar;
            int i = trzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                trzVar.c = i - Integer.MIN_VALUE;
            } else {
                trzVar = new trz(this, aolnVar);
            }
        } else {
            trzVar = new trz(this, aolnVar);
        }
        java.lang.Object objAu = trzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = trzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            defpackage.aogc aogcVar = (defpackage.aogc) this.d.a();
            trzVar.c = 1;
            objAu = aogcVar.au(trzVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAu);
        }
        defpackage.tvn tvnVarI = defpackage.ttj.i(((defpackage.tru) objAu).L());
        defpackage.akzx akzxVar = (defpackage.akzx) tvnVarI.a;
        akzxVar.u();
        defpackage.tru truVar = (defpackage.tru) akzxVar.b;
        truVar.d = null;
        truVar.b &= -2;
        return tvnVarI.d();
    }

    @Override // defpackage.iox
    public final defpackage.iot c() {
        return b;
    }
}

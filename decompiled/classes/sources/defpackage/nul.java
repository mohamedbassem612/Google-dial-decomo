package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nul {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/wear/bam/modelavailabilitychecker/BamDuplexModelAvailabilityChecker");
    private final defpackage.mvz b;
    private final defpackage.rsr c;

    public nul(defpackage.mvz mvzVar, defpackage.rsr rsrVar) {
        this.b = mvzVar;
        this.c = rsrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        nuk nukVar;
        defpackage.acux acuxVar;
        java.lang.String str;
        if (aolnVar instanceof nuk) {
            nukVar = (nuk) aolnVar;
            int i = nukVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nukVar.c = i - Integer.MIN_VALUE;
            } else {
                nukVar = new nuk(this, aolnVar);
            }
        } else {
            nukVar = new nuk(this, aolnVar);
        }
        java.lang.Object obj = nukVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nukVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.acux acuxVarA = this.b.a();
            java.lang.String str2 = acuxVarA.c;
            defpackage.aooh.e(str2, "getGroupName(...)");
            acvm acvmVarA = acvn.a();
            acvmVarA.b(str2);
            acvn acvnVarA = acvmVarA.a();
            defpackage.rsr rsrVar = this.c;
            nukVar.d = acuxVarA;
            nukVar.e = str2;
            nukVar.c = 1;
            java.lang.Object objJ = rsrVar.J(acvnVarA, nukVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
            acuxVar = acuxVarA;
            obj = objJ;
            str = str2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = nukVar.e;
            acuxVar = nukVar.d;
            defpackage.aooc.af(obj);
        }
        acui acuiVar = (acui) obj;
        if (acuiVar == null) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/wear/bam/modelavailabilitychecker/BamDuplexModelAvailabilityChecker", "isBamDuplexModelAvailable", 27, "BamDuplexModelAvailabilityChecker.kt")).G("No Duplex Model for group '%s' Available, request version (%d)", str, acuxVar.e);
            return java.lang.Boolean.FALSE;
        }
        if (acuiVar.f < 1715067751) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/wear/bam/modelavailabilitychecker/BamDuplexModelAvailabilityChecker", "isBamDuplexModelAvailable", 39, "BamDuplexModelAvailabilityChecker.kt")).M("Downloaded Duplex Model (%d) does NOT meet minimum version (%d), request version (%d)", new java.lang.Integer(acuiVar.f), new java.lang.Integer(1715067751), new java.lang.Integer(acuxVar.e));
            return java.lang.Boolean.FALSE;
        }
        boolean zContains = acuiVar.k.contains("en-US");
        defpackage.aimz aimzVar = a;
        if (zContains) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/wear/bam/modelavailabilitychecker/BamDuplexModelAvailabilityChecker", "isBamDuplexModelAvailable", 64, "BamDuplexModelAvailabilityChecker.kt")).N("Downloaded Duplex Model (%d) meets minimum version (%d) and supports language code (%s), request version(%d)", new java.lang.Integer(acuiVar.f), new java.lang.Integer(1715067751), "en-US", new java.lang.Integer(acuxVar.e));
            return java.lang.Boolean.TRUE;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/wear/bam/modelavailabilitychecker/BamDuplexModelAvailabilityChecker", "isBamDuplexModelAvailable", 52, "BamDuplexModelAvailabilityChecker.kt")).M("Downloaded Duplex Model (%d) does NOT support language code (%s), request version (%d)", new java.lang.Integer(acuiVar.f), "en-US", new java.lang.Integer(acuxVar.e));
        return java.lang.Boolean.FALSE;
    }
}

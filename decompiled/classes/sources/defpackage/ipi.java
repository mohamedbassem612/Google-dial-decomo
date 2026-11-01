package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ipi extends defpackage.aomh implements defpackage.aonj {
    long a;
    int b;
    final /* synthetic */ defpackage.ipo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipi(defpackage.ipo ipoVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.c = ipoVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ipi(this.c, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        long j;
        long jLongValue;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                long j2 = this.a;
                defpackage.aooc.af(obj);
                j = j2;
            } else {
                defpackage.aooc.af(obj);
            }
            jLongValue = ((java.lang.Number) obj).longValue();
            if (jLongValue < j) {
                return java.lang.Boolean.TRUE;
            }
            ((defpackage.aimw) ((defpackage.aimw) defpackage.ipo.a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/backup/impl/BackupImpl", "canRestore$<anonymous>", 172, "BackupImpl.kt")).D("Current dialer version %d is less than backed up version %d, delaying restore until Dialer updated.", jLongValue, j);
            this.c.g.o(defpackage.rmx.RESTORE_SKIPPED_DIALER_OLDER_THAN_BACKUP);
            return java.lang.Boolean.FALSE;
        }
        defpackage.aooc.af(obj);
        defpackage.aoxh aoxhVarB = this.c.c.b();
        this.b = 1;
        obj = defpackage.aoov.au(aoxhVarB, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.ioy ioyVar = ((defpackage.ipb) obj).c;
        if (ioyVar == null) {
            ioyVar = defpackage.ioy.a;
        }
        defpackage.ipo ipoVar = this.c;
        long j3 = ioyVar.c;
        icr icrVar = new icr(ipoVar, (defpackage.aoln) null, 7);
        this.a = j3;
        this.b = 2;
        obj = defpackage.aoov.aj(ipoVar.f, icrVar, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        j = j3;
        jLongValue = ((java.lang.Number) obj).longValue();
        if (jLongValue < j) {
            return java.lang.Boolean.TRUE;
        }
        ((defpackage.aimw) ((defpackage.aimw) defpackage.ipo.a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/backup/impl/BackupImpl", "canRestore$<anonymous>", 172, "BackupImpl.kt")).D("Current dialer version %d is less than backed up version %d, delaying restore until Dialer updated.", jLongValue, j);
        this.c.g.o(defpackage.rmx.RESTORE_SKIPPED_DIALER_OLDER_THAN_BACKUP);
        return java.lang.Boolean.FALSE;
    }
}

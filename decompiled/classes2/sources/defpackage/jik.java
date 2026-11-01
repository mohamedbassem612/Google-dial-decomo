package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jik {
    private static final aimz c = aimz.i("com/android/dialer/beesly/logging/BeeslyLoggingCoordinator");
    public final long a;
    public final defpackage.jhw b;
    private final tvn d;
    private final kgl e;

    public jik(long j, kgl kglVar, tvn tvnVar, defpackage.jhw jhwVar) {
        aooh.f(kglVar, "beeslySot");
        aooh.f(jhwVar, "beeslyVerdictNotifier");
        this.a = j;
        this.e = kglVar;
        this.d = tvnVar;
        this.b = jhwVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5 A[Catch: all -> 0x012e, TRY_ENTER, TryCatch #0 {all -> 0x012e, blocks: (B:12:0x002d, B:35:0x00c8, B:38:0x00d5, B:40:0x00e3, B:42:0x00e7, B:44:0x00f0, B:46:0x0109, B:48:0x0112, B:24:0x006d, B:26:0x007b, B:28:0x007f, B:30:0x0088, B:32:0x00a1, B:33:0x00a4), top: B:54:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.jij jijVar;
        long j;
        java.lang.Object obj;
        defpackage.aixl aixlVar;
        defpackage.aixl aixlVar2;
        taq taqVarJ;
        java.lang.Object obj2;
        if (aolnVar instanceof defpackage.jij) {
            jijVar = (defpackage.jij) aolnVar;
            int i = jijVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jijVar.c = i - Integer.MIN_VALUE;
            } else {
                jijVar = new defpackage.jij(this, aolnVar);
            }
        } else {
            jijVar = new defpackage.jij(this, aolnVar);
        }
        java.lang.Object objP = jijVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jijVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(objP);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objP);
                }
                aixlVar2 = (defpackage.aixl) objP;
                if (aixlVar2 != null) {
                    this.b.e(this.a);
                    return aixlVar2;
                }
                tvn tvnVar = this.d;
                j = this.a;
                taqVarJ = tvnVar.j(java.lang.String.valueOf(j));
                if (taqVarJ != null || (obj2 = taqVarJ.a) == null || (((ucu) obj2).b & 8192) == 0) {
                    c.d().l("com/android/dialer/beesly/logging/BeeslyLoggingCoordinator", "getScoobyClearcutLogs", 61, "BeeslyLoggingCoordinator.kt").x("Timed out waiting for Beesly verdict for call %d", j);
                    this.b.e(this.a);
                    return null;
                }
                c.b().l("com/android/dialer/beesly/logging/BeeslyLoggingCoordinator", "getScoobyClearcutLogs", 57, "BeeslyLoggingCoordinator.kt").x("Found Beesly verdict in fallback DB check for call %d", j);
                aixlVar = ((ucu) obj2).o;
                if (aixlVar == null) {
                    aixlVar = defpackage.aixl.a;
                }
                defpackage.aixl aixlVar3 = aixlVar;
                this.b.e(j);
                return aixlVar3;
            }
            aooc.af(objP);
            defpackage.ity ityVar = new defpackage.ity(this.a);
            kgl kglVar = this.e;
            jijVar.c = 1;
            objP = kglVar.p(ityVar, jijVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
            if (((defpackage.itc) objP) != null) {
                tvn tvnVar2 = this.d;
                j = this.a;
                taq taqVarJ2 = tvnVar2.j(java.lang.String.valueOf(j));
                if (taqVarJ2 == null || (obj = taqVarJ2.a) == null || (((ucu) obj).b & 8192) == 0) {
                    c.b().l("com/android/dialer/beesly/logging/BeeslyLoggingCoordinator", "getScoobyClearcutLogs", 46, "BeeslyLoggingCoordinator.kt").x("Beesly was active for call %d, waiting for verdict notification", j);
                    defpackage.jeb jebVar = new defpackage.jeb(this, (aoln) null, 20);
                    jijVar.c = 2;
                    objP = aooh.M(5000L, jebVar, jijVar);
                    if (objP == aoluVar) {
                        return aoluVar;
                    }
                    aixlVar2 = (defpackage.aixl) objP;
                    if (aixlVar2 != null) {
                        this.b.e(this.a);
                        return aixlVar2;
                    }
                    tvn tvnVar3 = this.d;
                    j = this.a;
                    taqVarJ = tvnVar3.j(java.lang.String.valueOf(j));
                    if (taqVarJ != null) {
                    }
                    c.d().l("com/android/dialer/beesly/logging/BeeslyLoggingCoordinator", "getScoobyClearcutLogs", 61, "BeeslyLoggingCoordinator.kt").x("Timed out waiting for Beesly verdict for call %d", j);
                    this.b.e(this.a);
                } else {
                    c.b().l("com/android/dialer/beesly/logging/BeeslyLoggingCoordinator", "getScoobyClearcutLogs", 40, "BeeslyLoggingCoordinator.kt").x("Found Beesly verdict in DB immediately for call %d", j);
                    aixlVar = ((ucu) obj).o;
                    if (aixlVar == null) {
                        aixlVar = defpackage.aixl.a;
                    }
                }
                defpackage.aixl aixlVar4 = aixlVar;
                this.b.e(j);
                return aixlVar4;
            }
            c.b().l("com/android/dialer/beesly/logging/BeeslyLoggingCoordinator", "getScoobyClearcutLogs", 32, "BeeslyLoggingCoordinator.kt").x("Beesly was not active for call %d, not waiting for verdict", this.a);
            return null;
        } catch (java.lang.Throwable th) {
            this.b.e(this.a);
            throw th;
        }
    }
}

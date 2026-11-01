package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahed implements ahlb {
    public static final aimz a = aimz.i("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLoggerSyncletImpl");
    public final aoin b;
    private final aoin c;
    private final aoss d;
    private final j$.util.Optional e;
    private final apdi f;

    public ahed(apdi apdiVar, aoin aoinVar, aoin aoinVar2, aoss aossVar, j$.util.Optional optional) {
        aooh.f(apdiVar, "streamz");
        aooh.f(aoinVar, "walFileDoneSubdirectory");
        aooh.f(aoinVar2, "enableTimedProcessReaperLogging");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(optional, "checkboxChecker");
        this.f = apdiVar;
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aossVar;
        this.e = optional;
    }

    public final ajcq a() {
        return ((java.lang.Boolean) this.c.a()).booleanValue() ? aosv.F(this.d, 0, new defpackage.aheb(this, null), 3) : aiql.x();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ahzi, java.lang.Object] */
    public final java.lang.Object b(java.util.List list, aoln aolnVar) {
        defpackage.ahec ahecVar;
        boolean zN;
        ?? r13;
        j$.nio.file.Path path;
        alcf alcfVar;
        boolean zDeleteIfExists;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.ahec) {
            ahecVar = (defpackage.ahec) aolnVar;
            int i = ahecVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahecVar.d = i - Integer.MIN_VALUE;
            } else {
                ahecVar = new defpackage.ahec(this, aolnVar);
            }
        } else {
            ahecVar = new defpackage.ahec(this, aolnVar);
        }
        java.lang.Object objD = ahecVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ahecVar.d;
        if (i2 == 0) {
            aooc.af(objD);
            if (!list.isEmpty()) {
                defpackage.ahid ahidVar = (defpackage.ahid) aooh.q(this.e);
                if (ahidVar != null) {
                    ajcq ajcqVarA = ahidVar.a();
                    ahecVar.a = list;
                    ahecVar.d = 1;
                    objD = aosv.D(ajcqVarA, ahecVar);
                    if (objD == aoluVar) {
                        obj = list;
                        return aoluVar;
                    }
                } else {
                    zN = false;
                    r13 = list;
                }
                for (aoiu aoiuVar : r13) {
                    path = (j$.nio.file.Path) aoiuVar.a;
                    defpackage.ahbd ahbdVar = (defpackage.ahbd) aoiuVar.b;
                    j$.nio.file.attribute.FileTime lastModifiedTime = j$.nio.file.Files.getLastModifiedTime(path, (j$.nio.file.LinkOption[]) java.util.Arrays.copyOf(new j$.nio.file.LinkOption[0], 0));
                    aooh.e(lastModifiedTime, "getLastModifiedTime(...)");
                    j$.time.Instant instant = lastModifiedTime.toInstant();
                    aooh.e(instant, "toInstant(...)");
                    alcfVar = ahbdVar.e;
                    if (alcfVar == null) {
                        alcfVar = alcf.a;
                    }
                    aooh.e(alcfVar, "getProcessStartTime(...)");
                    j$.time.Duration durationB = ajee.b(instant, aooc.aw(alcfVar));
                    try {
                        zDeleteIfExists = j$.nio.file.Files.deleteIfExists(path);
                        if (!zDeleteIfExists) {
                            a.b().l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLoggerSyncletImpl", "tryDeleteLogging", 140, "TimedProcessReaperLoggerSyncletImpl.kt").y("Could not delete WAL log file %s that doesn't exist ", path);
                        }
                    } catch (java.io.IOException e) {
                        a.d().k(e).l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLoggerSyncletImpl", "tryDeleteLogging", 134, "TimedProcessReaperLoggerSyncletImpl.kt").y("Could not delete WAL log file %s", path);
                        zDeleteIfExists = false;
                    }
                    if (!zDeleteIfExists && zN) {
                        apdi apdiVar = this.f;
                        aooh.f(apdiVar, "<this>");
                        aooh.f(durationB, "processAge");
                        aooh.f(ahbdVar, "reaperEvent");
                        double minutes = durationB.toMinutes();
                        java.lang.String str = ahbdVar.c;
                        java.lang.String str2 = ahbdVar.d;
                        defpackage.ahbe ahbeVarB = defpackage.ahbe.b(ahbdVar.f);
                        if (ahbeVarB == null) {
                            ahbeVarB = defpackage.ahbe.REAPER_EVENT_STRATEGY_UNSPECIFIED;
                        }
                        int iOrdinal = ahbeVarB.ordinal();
                        ((afim) apdiVar.b.eZ()).b(minutes, new java.lang.Object[]{str, str2, iOrdinal != 1 ? iOrdinal != 2 ? "unknown" : "component_callbacks" : "polling"});
                    }
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj2 = ahecVar.a;
        aooc.af(objD);
        obj = obj2;
        obj = list;
        zN = aooh.n(objD, java.lang.Boolean.TRUE);
        r13 = obj;
        while (r13.hasNext()) {
            path = (j$.nio.file.Path) aoiuVar.a;
            defpackage.ahbd ahbdVar2 = (defpackage.ahbd) aoiuVar.b;
            j$.nio.file.attribute.FileTime lastModifiedTime2 = j$.nio.file.Files.getLastModifiedTime(path, (j$.nio.file.LinkOption[]) java.util.Arrays.copyOf(new j$.nio.file.LinkOption[0], 0));
            aooh.e(lastModifiedTime2, "getLastModifiedTime(...)");
            j$.time.Instant instant2 = lastModifiedTime2.toInstant();
            aooh.e(instant2, "toInstant(...)");
            alcfVar = ahbdVar2.e;
            if (alcfVar == null) {
                alcfVar = alcf.a;
            }
            aooh.e(alcfVar, "getProcessStartTime(...)");
            j$.time.Duration durationB2 = ajee.b(instant2, aooc.aw(alcfVar));
            zDeleteIfExists = j$.nio.file.Files.deleteIfExists(path);
            if (!zDeleteIfExists) {
                a.b().l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLoggerSyncletImpl", "tryDeleteLogging", 140, "TimedProcessReaperLoggerSyncletImpl.kt").y("Could not delete WAL log file %s that doesn't exist ", path);
            }
            if (!zDeleteIfExists) {
            }
        }
        return aojh.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aheb extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.ahed b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aheb(defpackage.ahed ahedVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = ahedVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objAe;
        java.util.List list;
        java.util.ArrayList<j$.nio.file.Path> arrayList;
        defpackage.ahbd ahbdVar;
        aoiu aoiuVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.ahed ahedVar = this.b;
            java.lang.Object objA = ahedVar.b.a();
            aooh.e(objA, "get(...)");
            j$.nio.file.Path path = (j$.nio.file.Path) objA;
            int i2 = 0;
            java.lang.Throwable th = null;
            if (true != j$.nio.file.Files.exists(path, (j$.nio.file.LinkOption[]) java.util.Arrays.copyOf(new j$.nio.file.LinkOption[0], 0))) {
                path = null;
            }
            if (path != null) {
                try {
                    objAe = aoog.b(path);
                } catch (java.lang.Throwable th2) {
                    objAe = aooc.ae(th2);
                }
                java.lang.Throwable thC = aoiw.c(objAe);
                if (thC != null) {
                    if (!(thC instanceof java.io.IOException)) {
                        throw thC;
                    }
                    defpackage.ahed.a.c().k(thC).l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLoggerSyncletImpl", "getFilesToVacuum$<anonymous>", 115, "TimedProcessReaperLoggerSyncletImpl.kt").v("Could not read WAL files");
                    objAe = null;
                }
                list = (java.util.List) objAe;
            } else {
                list = null;
            }
            if (list == null) {
                arrayList = aokc.a;
            } else {
                if (true == list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        if (j$.nio.file.Files.isRegularFile((j$.nio.file.Path) obj2, (j$.nio.file.LinkOption[]) java.util.Arrays.copyOf(new j$.nio.file.LinkOption[0], 0))) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = aokc.a;
                }
            }
            if (arrayList.isEmpty()) {
                defpackage.ahed.a.b().l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLoggerSyncletImpl", "getFilesToVacuum", 124, "TimedProcessReaperLoggerSyncletImpl.kt").v("No log files to process.");
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (j$.nio.file.Path path2 : arrayList) {
                try {
                    java.io.InputStream inputStreamNewInputStream = j$.nio.file.Files.newInputStream(path2, (j$.nio.file.OpenOption[]) java.util.Arrays.copyOf(new j$.nio.file.OpenOption[i2], i2));
                    aooh.e(inputStreamNewInputStream, "newInputStream(...)");
                    try {
                        defpackage.ahbd ahbdVar2 = (defpackage.ahbd) alad.x(defpackage.ahbd.a, inputStreamNewInputStream);
                        ajsz.ak(inputStreamNewInputStream, th);
                        ahbdVar = ahbdVar2;
                    } catch (java.lang.Throwable th3) {
                        try {
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            ajsz.ak(inputStreamNewInputStream, th3);
                            throw th4;
                        }
                    }
                } catch (java.io.IOException e) {
                    defpackage.ahed.a.d().k(e).l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLoggerSyncletImpl", "readAll$<anonymous>", 79, "TimedProcessReaperLoggerSyncletImpl.kt").y("Could not read WAL log file %s", path2);
                    ahbdVar = th;
                }
                if (ahbdVar != 0) {
                    java.lang.String str = ahbdVar.c;
                    java.lang.String str2 = ahbdVar.d;
                    alcf alcfVar = ahbdVar.e;
                    if (alcfVar == null) {
                        alcfVar = alcf.a;
                    }
                    aooh.e(alcfVar, "getProcessStartTime(...)");
                    j$.time.Instant instantAw = aooc.aw(alcfVar);
                    defpackage.ahbe ahbeVarB = defpackage.ahbe.b(ahbdVar.f);
                    if (ahbeVarB == null) {
                        ahbeVarB = defpackage.ahbe.REAPER_EVENT_STRATEGY_UNSPECIFIED;
                    }
                    aoov.l("\n    {\n      app_package=" + str + "\n      process_name=" + str2 + "\n      process_start_time=" + instantAw + "\n      strategy=" + ahbeVarB + "\n    }\n    ");
                    aoiuVar = new aoiu(path2, ahbdVar);
                } else {
                    aoiuVar = null;
                }
                if (aoiuVar != null) {
                    arrayList2.add(aoiuVar);
                }
                i2 = 0;
                th = null;
            }
            this.a = 1;
            if (ahedVar.b(arrayList2, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.aheb(this.b, aolnVar);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahdy extends aomh implements aonn {
    final /* synthetic */ ahea a;
    final /* synthetic */ defpackage.ahbe b;
    final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdy(ahea aheaVar, defpackage.ahbe ahbeVar, java.lang.String str, aoln aolnVar) {
        super(2, aolnVar);
        this.a = aheaVar;
        this.b = ahbeVar;
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x029d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16, types: [int] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ahbe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objAe;
        ?? r6;
        j$.nio.file.Path pathResolve;
        j$.nio.file.Path path;
        java.lang.String string;
        java.lang.String strC;
        ?? r2;
        aooc.af(obj);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String lowerCase = aoov.z(this.b.name(), "REAPER_EVENT_STRATEGY_").toLowerCase(java.util.Locale.ROOT);
        aooh.e(lowerCase, "toLowerCase(...)");
        sb.append(java.lang.String.valueOf(lowerCase).concat("_"));
        java.lang.String str = this.c;
        if (str != null) {
            sb.append(java.lang.String.valueOf(aoov.P(str, '.', '_')).concat("_"));
        }
        sb.append("reaper_wal.pb");
        java.lang.String string2 = sb.toString();
        java.lang.Object objA = this.a.d.a();
        aooh.e(objA, "get(...)");
        j$.nio.file.Path path2 = (j$.nio.file.Path) objA;
        try {
            objAe = j$.nio.file.Files.createDirectories(path2, (j$.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(new j$.nio.file.attribute.FileAttribute[0], 0));
            aooh.e(objAe, "createDirectories(...)");
        } catch (java.lang.Throwable th) {
            objAe = aooc.ae(th);
        }
        java.lang.Throwable thC = aoiw.c(objAe);
        if (thC != null) {
            if (!(thC instanceof java.io.IOException)) {
                throw thC;
            }
            ahea.a.c().k(thC).l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLogger", "createDirectoriesOrNull$<anonymous>", 251, "TimedProcessReaperLogger.kt").y("Could create directories for %s", path2);
            objAe = null;
        }
        j$.nio.file.Path path3 = (j$.nio.file.Path) objAe;
        if (path3 == null || (pathResolve = path3.resolve(string2)) == null) {
            r6 = 0;
        } else {
            j$.nio.file.Path parent = pathResolve.getParent();
            if (parent == null) {
                java.util.Objects.toString(pathResolve);
                throw new java.lang.IllegalStateException(pathResolve.toString().concat(" does not have a parent!"));
            }
            java.util.List listB = aoog.b(parent);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : listB) {
                if (j$.nio.file.Files.isRegularFile((j$.nio.file.Path) obj2, (j$.nio.file.LinkOption[]) java.util.Arrays.copyOf(new j$.nio.file.LinkOption[0], 0))) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() >= 36) {
                ahea.a.b().l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLogger", "getNextCounterFile", 277, "TimedProcessReaperLogger.kt").w("WAL queue limit reached (%d files). Dropping new log.", 36);
                path = null;
            } else {
                if (j$.nio.file.Files.exists(pathResolve, (j$.nio.file.LinkOption[]) java.util.Arrays.copyOf(new j$.nio.file.LinkOption[0], 0))) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String strA = aoog.a((j$.nio.file.Path) it.next());
                        java.lang.Integer numO = aoov.o(aoov.C(strA, '_', strA));
                        if (numO != null) {
                            arrayList2.add(numO);
                        }
                    }
                    java.lang.Integer num = (java.lang.Integer) ajsz.bA(arrayList2);
                    int iIntValue = num != null ? num.intValue() + 1 : 1;
                    java.lang.String strA2 = aoog.a(pathResolve);
                    j$.nio.file.Path fileName = pathResolve.getFileName();
                    java.lang.String str2 = "";
                    if (fileName != null && (string = fileName.toString()) != null && (strC = aoov.C(string, '.', "")) != null) {
                        str2 = strC;
                    }
                    pathResolve = parent.resolve(strA2 + '_' + iIntValue + '.' + str2);
                    aooh.e(pathResolve, "resolve(...)");
                }
                path = pathResolve;
            }
            if (path != null) {
                ahea aheaVar = this.a;
                java.lang.String str3 = this.c;
                defpackage.uzx uzxVarV = defpackage.agwm.v(defpackage.ahbd.a.m());
                java.lang.String packageName = aheaVar.b.getPackageName();
                aooh.e(packageName, "getPackageName(...)");
                aooh.f(packageName, "value");
                akzx akzxVar = (akzx) uzxVarV.a;
                akzxVar.u();
                defpackage.ahbd ahbdVar = (defpackage.ahbd) akzxVar.b;
                j$.util.Objects.requireNonNull(packageName);
                ahbdVar.b |= 1;
                ahbdVar.c = packageName;
                if (str3 != null) {
                    akzxVar.u();
                    defpackage.ahbd ahbdVar2 = (defpackage.ahbd) akzxVar.b;
                    j$.util.Objects.requireNonNull(str3);
                    ahbdVar2.b |= 2;
                    ahbdVar2.d = str3;
                }
                j$.time.Instant instantPlusMillis = aheaVar.e.plusMillis(aa$.ExternalSyntheticApiModelOutline1.m());
                aooh.e(instantPlusMillis, "plusMillis(...)");
                alcf alcfVarAu = aooc.au(instantPlusMillis);
                aooh.f(alcfVarAu, "value");
                akzxVar.u();
                defpackage.ahbd ahbdVar3 = (defpackage.ahbd) akzxVar.b;
                j$.util.Objects.requireNonNull(alcfVarAu);
                ahbdVar3.e = alcfVarAu;
                ahbdVar3.b |= 4;
                defpackage.ahbd ahbdVarAU = uzxVarV.aU();
                ?? r7 = this.b;
                java.lang.Object objA2 = aheaVar.c.a();
                aooh.e(objA2, "get(...)");
                j$.nio.file.Path pathResolve2 = ((j$.nio.file.Path) objA2).resolve(string2);
                aooh.e(pathResolve2, "resolve(...)");
                try {
                    java.io.OutputStream outputStreamNewOutputStream = j$.nio.file.Files.newOutputStream(pathResolve2, (j$.nio.file.OpenOption[]) java.util.Arrays.copyOf(new j$.nio.file.OpenOption[0], 0));
                    aooh.e(outputStreamNewOutputStream, "newOutputStream(...)");
                    try {
                        try {
                            defpackage.uzx uzxVarV2 = defpackage.agwm.v(ahbdVarAU.p());
                            aooh.f((java.lang.Object) r7, "value");
                            java.lang.Object obj3 = uzxVarV2.a;
                            ((akzx) obj3).u();
                            defpackage.ahbd ahbdVar4 = (defpackage.ahbd) ((akzx) obj3).b;
                            ahbdVar4.f = r7.d;
                            r7 = ahbdVar4.b | 8;
                            ahbdVar4.b = r7;
                            uzxVarV2.aU().h(outputStreamNewOutputStream);
                            r6 = 0;
                            ajsz.ak(outputStreamNewOutputStream, (java.lang.Throwable) null);
                            alcf alcfVar = ahbdVarAU.e;
                            if (alcfVar == null) {
                                alcfVar = alcf.a;
                            }
                            aooh.e(alcfVar, "getProcessStartTime(...)");
                            aooc.aw(alcfVar);
                            r2 = pathResolve2;
                        } catch (java.lang.Throwable th2) {
                            r7 = 0;
                            r7 = 0;
                            try {
                                throw th2;
                            } catch (java.lang.Throwable th3) {
                                ajsz.ak(outputStreamNewOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (java.io.IOException e) {
                        e = e;
                        ahea.a.c().k(e).l("com/google/apps/tiktok/experiments/phenotype/log/TimedProcessReaperLogger", "toTempFiles", 238, "TimedProcessReaperLogger.kt").y("Could not write initial WAL log file %s", pathResolve2);
                        r2 = r7;
                        r6 = r7;
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    r7 = 0;
                }
                if (r2 != 0) {
                    return new defpackage.ajxi(this.a, (java.lang.Object) r2, path);
                }
            } else {
                r6 = 0;
            }
        }
        return r6;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ahdy(this.a, this.b, this.c, aolnVar);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gat {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public gat(defpackage.aoxh aoxhVar) {
        java.util.List list;
        this.e = aoxhVar;
        defpackage.aolr aolrVar = defpackage.gdw.a;
        this.a = aolrVar;
        defpackage.aoyt aoytVar = ((defpackage.aoyr) aoxhVar).a;
        synchronized (aoytVar) {
            int iE = ((defpackage.aoyw) aoytVar).e();
            if (iE == 0) {
                list = defpackage.aokc.a;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(iE);
                java.lang.Object[] objArr = ((defpackage.aoyw) aoytVar).a;
                if (objArr == null) {
                    defpackage.aooh.g();
                }
                for (int i = 0; i < iE; i++) {
                    arrayList.add(objArr[((int) (((defpackage.aoyw) aoytVar).b + ((long) i))) & (objArr.length - 1)]);
                }
                list = arrayList;
            }
        }
        defpackage.gdt gdtVar = new defpackage.gdt(this, aolrVar, (defpackage.kgl) (list.isEmpty() ? null : list.get(0)));
        this.b = gdtVar;
        defpackage.fzt fztVarB = gdtVar.b();
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(fztVarB, cduVar);
        defpackage.fzd fzdVar = (defpackage.fzd) gdtVar.h.c();
        if (fzdVar == null) {
            defpackage.gab gabVar = defpackage.gdu.a;
            fzdVar = new defpackage.fzd(gabVar.b, gabVar.c, gabVar.d, gabVar);
        }
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(fzdVar, cduVar);
    }

    public static void F(aajq aajqVar, defpackage.aagp aagpVar, defpackage.zzx zzxVar) {
        try {
            zzxVar.i(aajqVar.a(aagpVar));
        } catch (defpackage.aacw e) {
            zzxVar.h(e);
        }
    }

    private final defpackage.ajcq H(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, java.io.File file, defpackage.adhw adhwVar, defpackage.ajxw ajxwVar) {
        return ((defpackage.adjz) this.e).a(adhwVar) > 2 ? defpackage.aiql.y(new defpackage.adiq(java.lang.String.format(java.util.Locale.US, "Validation for pack %s has failed more times than maximum allowed of %d", packManifest.p(), 2))) : E(((defpackage.adld) ajxwVar.b).e().entrySet().iterator(), packManifest, file, adhwVar, ajxwVar);
    }

    public static final defpackage.ajcq u(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        defpackage.aiof aiofVar = defpackage.adhn.c;
        packManifest.p();
        return defpackage.aiql.z(null);
    }

    public final j$.util.Optional A(defpackage.vcs vcsVar) {
        defpackage.zzx zzxVar = (defpackage.zzx) this.c;
        return zzxVar.k().containsKey(vcsVar) ? j$.util.Optional.of((vja) ((defpackage.aoin) zzxVar.k().get(vcsVar)).a()) : j$.util.Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoin, java.lang.Object] */
    public final boolean B() {
        return ((java.lang.Boolean) this.b.a()).booleanValue() || ((java.lang.Boolean) this.e.a()).booleanValue() || ((java.lang.Boolean) this.c.a()).booleanValue() || ((java.lang.Boolean) this.a.a()).booleanValue() || ((java.lang.Boolean) this.d.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq C(defpackage.adhw adhwVar, defpackage.adhw adhwVar2, defpackage.adhw adhwVar3, defpackage.ajxw ajxwVar) {
        defpackage.adld adldVar = (defpackage.adld) ajxwVar.b;
        com.google.android.libraries.micore.superpacks.common.PackManifest packManifestF = adldVar.d().f();
        java.io.File fileE = ((defpackage.adjz) this.e).e(adhwVar);
        if (adldVar.b().b != null) {
            return defpackage.ajan.g(H(packManifestF, fileE, adhwVar, ajxwVar), new adle(this, adhwVar, adhwVar2, ajxwVar, packManifestF, adhwVar3, 2), this.d);
        }
        defpackage.aiof aiofVar = defpackage.adhn.c;
        return defpackage.ajan.g(H(packManifestF, fileE, adhwVar, ajxwVar), new defpackage.adlf(this, packManifestF, adhwVar, adhwVar3, 0), this.d);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adli */
    /* JADX WARN: Code duplicated, block: B:16:0x0092  */
    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:24:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:30:0x0118  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq D(defpackage.ajxw ajxwVar) throws java.io.IOException, adli {
        defpackage.ajcq ajcqVarU;
        defpackage.adhw adhwVarB;
        java.io.File fileE;
        defpackage.adhw adhwVarA;
        java.io.File fileE2;
        long jA;
        long jCh;
        long jA2;
        defpackage.adld adldVar = (defpackage.adld) ajxwVar.b;
        com.google.android.libraries.micore.superpacks.common.PackManifest packManifestF = adldVar.d().f();
        defpackage.adhw adhwVarP = packManifestF.p();
        defpackage.adim adimVarB = adldVar.b();
        int i = defpackage.adho.a;
        defpackage.adjz adjzVar = (defpackage.adjz) this.e;
        java.io.File fileE3 = adjzVar.e(adhwVarP);
        long jD = packManifestF.d();
        boolean zN = packManifestF.n();
        if (zN) {
            long jA3 = adjzVar.e.a(fileE3);
            if (jD == jA3) {
                defpackage.aiof aiofVar = defpackage.adhn.c;
                ajcqVarU = u(packManifestF);
            } else {
                if (fileE3.exists()) {
                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.d()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 365, "FetchPipeline.java")).M("Final file %s is found with %d bytes, expected: %d", adhwVarP.e(true), java.lang.Long.valueOf(jA3), java.lang.Long.valueOf(jD));
                }
                adhwVarB = defpackage.adho.b(adhwVarP);
                fileE = adjzVar.e(adhwVarB);
                if (zN != 0) {
                    jA2 = adjzVar.e.a(fileE);
                    if (jA2 == jD) {
                        defpackage.aiof aiofVar2 = defpackage.adhn.c;
                        s(packManifestF, adhwVarB, adhwVarP);
                        ajcqVarU = u(packManifestF);
                    } else {
                        if (fileE.exists()) {
                            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.b()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 395, "FetchPipeline.java")).M("Staged file %s is found with %d bytes, expected: %d, will ignore it and re-fetch it.", adhwVarB.e(true), java.lang.Long.valueOf(jA2), java.lang.Long.valueOf(jD));
                        }
                        adhwVarA = defpackage.adho.a(adhwVarP, adimVarB.b);
                        fileE2 = adjzVar.e(adhwVarA);
                        if (zN != 0) {
                            jA = adjzVar.e.a(fileE2);
                            jCh = defpackage.agab.ch(packManifestF);
                            if (jA == jCh) {
                                defpackage.aiof aiofVar3 = defpackage.adhn.c;
                                ajcqVarU = C(adhwVarA, adhwVarB, adhwVarP, ajxwVar);
                            } else {
                                if (fileE2.exists()) {
                                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.b()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 419, "FetchPipeline.java")).M("Fetched file %s is found with %d bytes, expected: %d, will resume fetching with  partial file.", adhwVarA.e(true), java.lang.Long.valueOf(jA), java.lang.Long.valueOf(jCh));
                                }
                                defpackage.adip adipVarC = adldVar.c();
                                defpackage.aiof aiofVar4 = defpackage.adhn.c;
                                defpackage.adik.d(fileE2);
                                defpackage.agab.cl(adipVarC);
                                defpackage.ajcq ajcqVarA = defpackage.aiql.A(adipVarC.d(packManifestF, adldVar.g(), fileE2));
                                defpackage.adlu adluVar = new defpackage.adlu(this, ajxwVar, adhwVarA, packManifestF, zN, fileE2, adhwVarB, adhwVarP, 1);
                                ?? r3 = this.d;
                                int i2 = defpackage.ajan.c;
                                defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarA, adluVar);
                                ajcqVarA.c(ajalVar, defpackage.aiql.t(r3, ajalVar));
                                ajcqVarU = ajalVar;
                            }
                        } else {
                            defpackage.adip adipVarC2 = adldVar.c();
                            defpackage.aiof aiofVar5 = defpackage.adhn.c;
                            defpackage.adik.d(fileE2);
                            defpackage.agab.cl(adipVarC2);
                            defpackage.ajcq ajcqVarA2 = defpackage.aiql.A(adipVarC2.d(packManifestF, adldVar.g(), fileE2));
                            defpackage.adlu adluVar2 = new defpackage.adlu(this, ajxwVar, adhwVarA, packManifestF, zN, fileE2, adhwVarB, adhwVarP, 1);
                            ?? r4 = this.d;
                            int i3 = defpackage.ajan.c;
                            defpackage.ajal ajalVar2 = new defpackage.ajal(ajcqVarA2, adluVar2);
                            ajcqVarA2.c(ajalVar2, defpackage.aiql.t(r4, ajalVar2));
                            ajcqVarU = ajalVar2;
                        }
                    }
                } else {
                    adhwVarA = defpackage.adho.a(adhwVarP, adimVarB.b);
                    fileE2 = adjzVar.e(adhwVarA);
                    if (zN != 0) {
                        jA = adjzVar.e.a(fileE2);
                        jCh = defpackage.agab.ch(packManifestF);
                        if (jA == jCh) {
                            defpackage.aiof aiofVar6 = defpackage.adhn.c;
                            ajcqVarU = C(adhwVarA, adhwVarB, adhwVarP, ajxwVar);
                        } else {
                            if (fileE2.exists()) {
                                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.b()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 419, "FetchPipeline.java")).M("Fetched file %s is found with %d bytes, expected: %d, will resume fetching with  partial file.", adhwVarA.e(true), java.lang.Long.valueOf(jA), java.lang.Long.valueOf(jCh));
                            }
                            defpackage.adip adipVarC3 = adldVar.c();
                            defpackage.aiof aiofVar7 = defpackage.adhn.c;
                            defpackage.adik.d(fileE2);
                            defpackage.agab.cl(adipVarC3);
                            defpackage.ajcq ajcqVarA3 = defpackage.aiql.A(adipVarC3.d(packManifestF, adldVar.g(), fileE2));
                            defpackage.adlu adluVar3 = new defpackage.adlu(this, ajxwVar, adhwVarA, packManifestF, zN, fileE2, adhwVarB, adhwVarP, 1);
                            ?? r5 = this.d;
                            int i4 = defpackage.ajan.c;
                            defpackage.ajal ajalVar3 = new defpackage.ajal(ajcqVarA3, adluVar3);
                            ajcqVarA3.c(ajalVar3, defpackage.aiql.t(r5, ajalVar3));
                            ajcqVarU = ajalVar3;
                        }
                    } else {
                        defpackage.adip adipVarC4 = adldVar.c();
                        defpackage.aiof aiofVar8 = defpackage.adhn.c;
                        defpackage.adik.d(fileE2);
                        defpackage.agab.cl(adipVarC4);
                        defpackage.ajcq ajcqVarA4 = defpackage.aiql.A(adipVarC4.d(packManifestF, adldVar.g(), fileE2));
                        defpackage.adlu adluVar4 = new defpackage.adlu(this, ajxwVar, adhwVarA, packManifestF, zN, fileE2, adhwVarB, adhwVarP, 1);
                        ?? r6 = this.d;
                        int i5 = defpackage.ajan.c;
                        defpackage.ajal ajalVar4 = new defpackage.ajal(ajcqVarA4, adluVar4);
                        ajcqVarA4.c(ajalVar4, defpackage.aiql.t(r6, ajalVar4));
                        ajcqVarU = ajalVar4;
                    }
                }
            }
        } else if (fileE3.exists()) {
            defpackage.aiof aiofVar9 = defpackage.adhn.c;
            ajcqVarU = u(packManifestF);
        } else {
            adhwVarB = defpackage.adho.b(adhwVarP);
            fileE = adjzVar.e(adhwVarB);
            if (zN != 0) {
                jA2 = adjzVar.e.a(fileE);
                if (jA2 == jD) {
                    defpackage.aiof aiofVar10 = defpackage.adhn.c;
                    s(packManifestF, adhwVarB, adhwVarP);
                    ajcqVarU = u(packManifestF);
                } else {
                    if (fileE.exists()) {
                        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.b()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 395, "FetchPipeline.java")).M("Staged file %s is found with %d bytes, expected: %d, will ignore it and re-fetch it.", adhwVarB.e(true), java.lang.Long.valueOf(jA2), java.lang.Long.valueOf(jD));
                    }
                    adhwVarA = defpackage.adho.a(adhwVarP, adimVarB.b);
                    fileE2 = adjzVar.e(adhwVarA);
                    if (zN != 0) {
                        jA = adjzVar.e.a(fileE2);
                        jCh = defpackage.agab.ch(packManifestF);
                        if (jA == jCh) {
                            defpackage.aiof aiofVar11 = defpackage.adhn.c;
                            ajcqVarU = C(adhwVarA, adhwVarB, adhwVarP, ajxwVar);
                        } else {
                            if (fileE2.exists()) {
                                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.b()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 419, "FetchPipeline.java")).M("Fetched file %s is found with %d bytes, expected: %d, will resume fetching with  partial file.", adhwVarA.e(true), java.lang.Long.valueOf(jA), java.lang.Long.valueOf(jCh));
                            }
                            defpackage.adip adipVarC5 = adldVar.c();
                            defpackage.aiof aiofVar12 = defpackage.adhn.c;
                            defpackage.adik.d(fileE2);
                            defpackage.agab.cl(adipVarC5);
                            defpackage.ajcq ajcqVarA5 = defpackage.aiql.A(adipVarC5.d(packManifestF, adldVar.g(), fileE2));
                            defpackage.adlu adluVar5 = new defpackage.adlu(this, ajxwVar, adhwVarA, packManifestF, zN, fileE2, adhwVarB, adhwVarP, 1);
                            ?? r7 = this.d;
                            int i6 = defpackage.ajan.c;
                            defpackage.ajal ajalVar5 = new defpackage.ajal(ajcqVarA5, adluVar5);
                            ajcqVarA5.c(ajalVar5, defpackage.aiql.t(r7, ajalVar5));
                            ajcqVarU = ajalVar5;
                        }
                    } else {
                        defpackage.adip adipVarC6 = adldVar.c();
                        defpackage.aiof aiofVar13 = defpackage.adhn.c;
                        defpackage.adik.d(fileE2);
                        defpackage.agab.cl(adipVarC6);
                        defpackage.ajcq ajcqVarA6 = defpackage.aiql.A(adipVarC6.d(packManifestF, adldVar.g(), fileE2));
                        defpackage.adlu adluVar6 = new defpackage.adlu(this, ajxwVar, adhwVarA, packManifestF, zN, fileE2, adhwVarB, adhwVarP, 1);
                        ?? r8 = this.d;
                        int i7 = defpackage.ajan.c;
                        defpackage.ajal ajalVar6 = new defpackage.ajal(ajcqVarA6, adluVar6);
                        ajcqVarA6.c(ajalVar6, defpackage.aiql.t(r8, ajalVar6));
                        ajcqVarU = ajalVar6;
                    }
                }
            } else {
                adhwVarA = defpackage.adho.a(adhwVarP, adimVarB.b);
                fileE2 = adjzVar.e(adhwVarA);
                if (zN != 0) {
                    jA = adjzVar.e.a(fileE2);
                    jCh = defpackage.agab.ch(packManifestF);
                    if (jA == jCh) {
                        defpackage.aiof aiofVar14 = defpackage.adhn.c;
                        ajcqVarU = C(adhwVarA, adhwVarB, adhwVarP, ajxwVar);
                    } else {
                        if (fileE2.exists()) {
                            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.b()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePack", 419, "FetchPipeline.java")).M("Fetched file %s is found with %d bytes, expected: %d, will resume fetching with  partial file.", adhwVarA.e(true), java.lang.Long.valueOf(jA), java.lang.Long.valueOf(jCh));
                        }
                        defpackage.adip adipVarC7 = adldVar.c();
                        defpackage.aiof aiofVar15 = defpackage.adhn.c;
                        defpackage.adik.d(fileE2);
                        defpackage.agab.cl(adipVarC7);
                        defpackage.ajcq ajcqVarA7 = defpackage.aiql.A(adipVarC7.d(packManifestF, adldVar.g(), fileE2));
                        defpackage.adlu adluVar7 = new defpackage.adlu(this, ajxwVar, adhwVarA, packManifestF, zN, fileE2, adhwVarB, adhwVarP, 1);
                        ?? r9 = this.d;
                        int i8 = defpackage.ajan.c;
                        defpackage.ajal ajalVar7 = new defpackage.ajal(ajcqVarA7, adluVar7);
                        ajcqVarA7.c(ajalVar7, defpackage.aiql.t(r9, ajalVar7));
                        ajcqVarU = ajalVar7;
                    }
                } else {
                    defpackage.adip adipVarC8 = adldVar.c();
                    defpackage.aiof aiofVar16 = defpackage.adhn.c;
                    defpackage.adik.d(fileE2);
                    defpackage.agab.cl(adipVarC8);
                    defpackage.ajcq ajcqVarA8 = defpackage.aiql.A(adipVarC8.d(packManifestF, adldVar.g(), fileE2));
                    defpackage.adlu adluVar8 = new defpackage.adlu(this, ajxwVar, adhwVarA, packManifestF, zN, fileE2, adhwVarB, adhwVarP, 1);
                    ?? r10 = this.d;
                    int i9 = defpackage.ajan.c;
                    defpackage.ajal ajalVar8 = new defpackage.ajal(ajcqVarA8, adluVar8);
                    ajcqVarA8.c(ajalVar8, defpackage.aiql.t(r10, ajalVar8));
                    ajcqVarU = ajalVar8;
                }
            }
        }
        defpackage.kjs kjsVar = new defpackage.kjs(this, ajxwVar, 20);
        ?? r1 = this.d;
        int i10 = defpackage.aizu.d;
        defpackage.aizs aizsVar = new defpackage.aizs(ajcqVarU, defpackage.adiq.class, kjsVar);
        ajcqVarU.c(aizsVar, defpackage.aiql.t(r1, aizsVar));
        return aizsVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq E(final java.util.Iterator it, final com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, final java.io.File file, final defpackage.adhw adhwVar, final defpackage.ajxw ajxwVar) {
        if (!it.hasNext()) {
            return defpackage.aiql.z(null);
        }
        defpackage.adhw adhwVarP = packManifest.p();
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        defpackage.adkm adkmVar = (defpackage.adkm) entry.getValue();
        java.lang.String str = (java.lang.String) entry.getKey();
        defpackage.aiof aiofVar = defpackage.adhn.c;
        defpackage.adik.d(file);
        defpackage.agab.cl(adkmVar);
        defpackage.ahvr.ci(str);
        defpackage.aiof aiofVar2 = defpackage.adhn.a;
        packManifest.p().e(true);
        defpackage.ajcq ajcqVarAh = adkmVar.a.ah(packManifest.p(), new defpackage.adkl(packManifest, str, file, 0));
        defpackage.adlf adlfVar = new defpackage.adlf(this, adhwVar, adhwVarP, packManifest, 2);
        ?? r2 = this.d;
        return defpackage.aiql.A(defpackage.ajan.g(defpackage.aizu.g(ajcqVarAh, java.lang.Throwable.class, adlfVar, r2), new defpackage.ajat() { // from class: adlg
            @Override // defpackage.ajat
            public final defpackage.ajcq a(java.lang.Object obj) {
                defpackage.ajxw ajxwVar2 = ajxwVar;
                ((defpackage.adhh) ajxwVar2.a).a();
                java.util.Iterator it2 = it;
                if (!it2.hasNext()) {
                    return defpackage.aiql.z(null);
                }
                defpackage.adhw adhwVar2 = adhwVar;
                java.io.File file2 = file;
                return this.f.E(it2, packManifest, file2, adhwVar2, ajxwVar2);
            }
        }, r2));
    }

    public final void G(aajq aajqVar, defpackage.zzx zzxVar) {
        ((defpackage.aajt) this.e).a.add(new ffz(this, aajqVar, zzxVar, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(defpackage.gcp gcpVar, defpackage.aoln aolnVar) {
        defpackage.gas gasVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (aolnVar instanceof defpackage.gas) {
            gasVar = (defpackage.gas) aolnVar;
            int i = gasVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gasVar.d = i - Integer.MIN_VALUE;
            } else {
                gasVar = new defpackage.gas(this, aolnVar);
            }
        } else {
            gasVar = new defpackage.gas(this, aolnVar);
        }
        java.lang.Object objA = gasVar.b;
        java.lang.Object obj3 = defpackage.aolu.a;
        int i2 = gasVar.d;
        boolean z = true;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            ?? r8 = this.a;
            gasVar.a = gcpVar;
            gasVar.d = 1;
            objA = r8.a(gasVar);
            if (objA != obj3) {
            }
            obj2 = gcpVar;
            obj = obj3;
            return obj;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj4 = gasVar.a;
        defpackage.aooc.af(objA);
        obj2 = obj4;
        obj2 = gcpVar;
        obj = obj3;
        defpackage.gcp gcpVar2 = (defpackage.gcp) objA;
        if (gcpVar2 instanceof defpackage.fze) {
            ((defpackage.fze) gcpVar2).a();
        }
        if (gcpVar2 == obj2) {
            throw new java.lang.IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
        }
        defpackage.ded dedVar = new defpackage.ded((java.lang.Object) this, 2, (char[]) null);
        defpackage.apkl apklVar = gcpVar2.a;
        if (apklVar.a) {
            apklVar.b.a(dedVar);
        } else {
            synchronized (apklVar.c) {
                if (!apklVar.a) {
                    apklVar.d.add(dedVar);
                    z = false;
                }
            }
            if (z) {
                apklVar.b.a(dedVar);
            }
        }
        if (obj2 != null) {
            defpackage.ded dedVar2 = new defpackage.ded((java.lang.Object) this, 3, (char[]) null);
            defpackage.apkl apklVar2 = ((defpackage.gcp) obj2).a;
            synchronized (apklVar2.c) {
                apklVar2.d.remove(dedVar2);
            }
            ((defpackage.gcp) obj2).c();
        }
        obj = gcpVar2;
        if (defpackage.dzn.j(3)) {
            java.util.Objects.toString(gcpVar2);
            defpackage.dzn.k(3, "Generated new PagingSource ".concat(java.lang.String.valueOf(gcpVar2)));
            obj = gcpVar2;
        }
        obj2 = gcpVar;
        obj = obj3;
        return obj;
    }

    public final void b() {
        ((defpackage.enr) this.c).g(new defpackage.gaj(false, defpackage.gam.a));
    }

    public final void c() {
        ((defpackage.enr) this.c).g(new defpackage.gaj(true, defpackage.gam.a));
    }

    public final int d() {
        return e().a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cer, java.lang.Object] */
    public final defpackage.fzt e() {
        return (defpackage.fzt) this.c.a();
    }

    public final java.lang.Object f(defpackage.aoln aolnVar) {
        java.lang.Object objFM = new defpackage.fzh(((defpackage.gcf) this.b).h, 14).fM(new defpackage.fzv(this, 3), aolnVar);
        return objFM != defpackage.aolu.a ? defpackage.aojh.a : objFM;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoxh, java.lang.Object] */
    public final java.lang.Object g(defpackage.aoln aolnVar) {
        java.lang.Object objAF = defpackage.aoov.aF(this.e, new defpackage.eee(this, (defpackage.aoln) null, 4, (byte[]) null), aolnVar);
        return objAF != defpackage.aolu.a ? defpackage.aojh.a : objAF;
    }

    public final java.lang.Object h(int i) {
        return e().get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq i(long j, jxn jxnVar) {
        jxm jxmVar = (jxm) this.b.get(java.lang.Long.valueOf(j));
        return jxmVar == null ? defpackage.ajcm.a : defpackage.ahvr.I(defpackage.ahvr.F(new jxk(jxmVar, jxnVar), jxmVar.f), new jwi(this, j, 2), this.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.ajcq j(long j) {
        jxm jxmVar = (jxm) this.b.remove(java.lang.Long.valueOf(j));
        return jxmVar == null ? defpackage.ajcm.a : defpackage.ahvr.E(new ioi(jxmVar, 9), jxmVar.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void k(java.lang.String str, java.lang.Object obj) {
        defpackage.aooh.f(str, "key");
        this.d.put(str, obj);
        defpackage.aozj aozjVar = (defpackage.aozj) this.e.get(str);
        if (aozjVar != null) {
            aozjVar.e(obj);
        }
        defpackage.aozj aozjVar2 = (defpackage.aozj) this.b.get(str);
        if (aozjVar2 != null) {
            aozjVar2.e(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void l(java.lang.String str) {
        defpackage.aooh.f(str, "key");
        this.d.remove(str);
        this.e.remove(str);
        this.b.remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [dnm] */
    /* JADX WARN: Type inference failed for: r4v5, types: [dnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [cer] */
    /* JADX WARN: Type inference failed for: r6v7, types: [add] */
    public final defpackage.cer m(final defpackage.dnj dnjVar) {
        ?? A;
        java.lang.Object obj;
        defpackage.aonj aonjVar = new defpackage.aonj() { // from class: dmr
            /* JADX WARN: Code duplicated, block: B:224:0x03b1  */
            /* JADX WARN: Code duplicated, block: B:225:0x03b3  */
            /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
            @Override // defpackage.aonj
            public final java.lang.Object a(java.lang.Object obj2) {
                java.lang.Object obj3;
                java.lang.Object obj4;
                defpackage.aoiu aoiuVar;
                defpackage.dnl dnkVar;
                java.lang.Object objA;
                java.lang.Object objA2;
                defpackage.dmj dmjVar;
                java.lang.Object aoivVar;
                java.lang.Object obj5;
                java.lang.Object objI;
                defpackage.dnl dnlVar;
                defpackage.aonj aonjVar2 = (defpackage.aonj) obj2;
                defpackage.dnj dnjVar2 = dnjVar;
                defpackage.dmq dmqVar = dnjVar2.a;
                if (dmqVar instanceof defpackage.dmt) {
                    java.util.List list = ((defpackage.dmt) dmqVar).f;
                    defpackage.dnd dndVar = dnjVar2.b;
                    int i = dnjVar2.c;
                    java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        java.lang.Object obj6 = list.get(i2);
                        defpackage.dmp dmpVar = (defpackage.dmp) obj6;
                        if (defpackage.aooh.n(dmpVar.b(), dndVar)) {
                            dmpVar.c();
                            if (i == 0) {
                                arrayList.add(obj6);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                        int size2 = list.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            java.lang.Object obj7 = list.get(i3);
                            ((defpackage.dmp) obj7).c();
                            if (i == 0) {
                                arrayList2.add(obj7);
                            }
                        }
                        if (true != arrayList2.isEmpty()) {
                            list = arrayList2;
                        }
                        if (dndVar.compareTo(defpackage.dnd.a) < 0) {
                            int size3 = list.size();
                            defpackage.dnd dndVar2 = null;
                            defpackage.dnd dndVar3 = null;
                            for (int i4 = 0; i4 < size3; i4++) {
                                defpackage.dnd dndVarB = ((defpackage.dmp) list.get(i4)).b();
                                if (dndVarB.compareTo(dndVar) >= 0) {
                                    if (dndVarB.compareTo(dndVar) <= 0) {
                                        dndVar2 = dndVarB;
                                        dndVar3 = dndVar2;
                                        break;
                                    }
                                    if (dndVar3 == null || dndVarB.compareTo(dndVar3) < 0) {
                                        dndVar3 = dndVarB;
                                    }
                                } else if (dndVar2 == null || dndVarB.compareTo(dndVar2) > 0) {
                                    dndVar2 = dndVarB;
                                }
                            }
                            arrayList = new java.util.ArrayList(list.size());
                            int size4 = list.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                defpackage.dnd dndVar4 = dndVar2 == null ? dndVar3 : dndVar2;
                                java.lang.Object obj8 = list.get(i5);
                                if (defpackage.aooh.n(((defpackage.dmp) obj8).b(), dndVar4)) {
                                    arrayList.add(obj8);
                                }
                            }
                        } else {
                            defpackage.dnd dndVar5 = defpackage.dnd.b;
                            if (dndVar.compareTo(dndVar5) > 0) {
                                int size5 = list.size();
                                defpackage.dnd dndVar6 = null;
                                defpackage.dnd dndVar7 = null;
                                for (int i6 = 0; i6 < size5; i6++) {
                                    defpackage.dnd dndVarB2 = ((defpackage.dmp) list.get(i6)).b();
                                    if (dndVarB2.compareTo(dndVar) >= 0) {
                                        if (dndVarB2.compareTo(dndVar) <= 0) {
                                            dndVar6 = dndVarB2;
                                            dndVar7 = dndVar6;
                                            break;
                                        }
                                        if (dndVar7 == null || dndVarB2.compareTo(dndVar7) < 0) {
                                            dndVar7 = dndVarB2;
                                        }
                                    } else if (dndVar6 == null || dndVarB2.compareTo(dndVar6) > 0) {
                                        dndVar6 = dndVarB2;
                                    }
                                }
                                arrayList = new java.util.ArrayList(list.size());
                                int size6 = list.size();
                                for (int i7 = 0; i7 < size6; i7++) {
                                    defpackage.dnd dndVar8 = dndVar7 == null ? dndVar6 : dndVar7;
                                    java.lang.Object obj9 = list.get(i7);
                                    if (defpackage.aooh.n(((defpackage.dmp) obj9).b(), dndVar8)) {
                                        arrayList.add(obj9);
                                    }
                                }
                            } else {
                                int size7 = list.size();
                                defpackage.dnd dndVar9 = null;
                                defpackage.dnd dndVar10 = null;
                                for (int i8 = 0; i8 < size7; i8++) {
                                    defpackage.dnd dndVarB3 = ((defpackage.dmp) list.get(i8)).b();
                                    if (dndVar5 == null || dndVarB3.compareTo(dndVar5) <= 0) {
                                        if (dndVarB3.compareTo(dndVar) >= 0) {
                                            if (dndVarB3.compareTo(dndVar) <= 0) {
                                                dndVar9 = dndVarB3;
                                                dndVar10 = dndVar9;
                                                break;
                                            }
                                            if (dndVar10 == null || dndVarB3.compareTo(dndVar10) < 0) {
                                                dndVar10 = dndVarB3;
                                            }
                                        } else if (dndVar9 == null || dndVarB3.compareTo(dndVar9) > 0) {
                                            dndVar9 = dndVarB3;
                                        }
                                    }
                                }
                                arrayList = new java.util.ArrayList(list.size());
                                int size8 = list.size();
                                for (int i9 = 0; i9 < size8; i9++) {
                                    defpackage.dnd dndVar11 = dndVar10 == null ? dndVar9 : dndVar10;
                                    java.lang.Object obj10 = list.get(i9);
                                    if (defpackage.aooh.n(((defpackage.dmp) obj10).b(), dndVar11)) {
                                        arrayList.add(obj10);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    int size9 = list.size();
                                    defpackage.dnd dndVar12 = null;
                                    defpackage.dnd dndVar13 = null;
                                    for (int i10 = 0; i10 < size9; i10++) {
                                        defpackage.dnd dndVarB4 = ((defpackage.dmp) list.get(i10)).b();
                                        if (dndVar5 == null || dndVarB4.compareTo(dndVar5) >= 0) {
                                            if (dndVarB4.compareTo(dndVar) >= 0) {
                                                if (dndVarB4.compareTo(dndVar) <= 0) {
                                                    dndVar12 = dndVarB4;
                                                    dndVar13 = dndVar12;
                                                    break;
                                                }
                                                if (dndVar13 == null || dndVarB4.compareTo(dndVar13) < 0) {
                                                    dndVar13 = dndVarB4;
                                                }
                                            } else if (dndVar12 == null || dndVarB4.compareTo(dndVar12) > 0) {
                                                dndVar12 = dndVarB4;
                                            }
                                        }
                                    }
                                    arrayList = new java.util.ArrayList(list.size());
                                    int size10 = list.size();
                                    for (int i11 = 0; i11 < size10; i11++) {
                                        defpackage.dnd dndVar14 = dndVar13 == null ? dndVar12 : dndVar13;
                                        java.lang.Object obj11 = list.get(i11);
                                        if (defpackage.aooh.n(((defpackage.dmp) obj11).b(), dndVar14)) {
                                            arrayList.add(obj11);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    defpackage.gat gatVar = this.b;
                    int size11 = arrayList.size();
                    int i12 = 0;
                    java.util.ArrayList arrayList3 = null;
                    while (true) {
                        obj3 = gatVar.e;
                        ?? r0 = gatVar.b;
                        obj4 = gatVar.c;
                        if (i12 >= size11) {
                            aoiuVar = new defpackage.aoiu(arrayList3, r0.a(dnjVar2));
                            break;
                        }
                        defpackage.aogc aogcVar = ((defpackage.dmv) obj3).b;
                        defpackage.dmp dmpVar2 = (defpackage.dmp) arrayList.get(i12);
                        int iA = dmpVar2.a();
                        if (iA == 0) {
                            synchronized (aogcVar.b) {
                                defpackage.dmk dmkVar = new defpackage.dmk(dmpVar2);
                                defpackage.dmj dmjVar2 = (defpackage.dmj) ((defpackage.add) aogcVar.a).a(dmkVar);
                                if (dmjVar2 == null) {
                                    dmjVar2 = (defpackage.dmj) ((defpackage.adw) aogcVar.c).a(dmkVar);
                                }
                                if (dmjVar2 != null) {
                                    objA2 = dmjVar2.a;
                                } else {
                                    try {
                                        objA = ((defpackage.ipc) obj4).aa(dmpVar2);
                                    } catch (java.lang.Exception unused) {
                                        objA = r0.a(dnjVar2);
                                    }
                                    objA2 = objA;
                                    aogcVar.bv(dmpVar2, objA2);
                                }
                            }
                            if (objA2 == null) {
                                objA2 = r0.a(dnjVar2);
                            }
                            aoiuVar = new defpackage.aoiu(arrayList3, defpackage.dfa.j(dnjVar2.d, objA2, dmpVar2, dnjVar2.b, dnjVar2.c));
                            break;
                        }
                        if (iA == 1) {
                            synchronized (aogcVar.b) {
                                defpackage.dmk dmkVar2 = new defpackage.dmk(dmpVar2);
                                defpackage.dmj dmjVar3 = (defpackage.dmj) ((defpackage.add) aogcVar.a).a(dmkVar2);
                                if (dmjVar3 == null) {
                                    dmjVar3 = (defpackage.dmj) ((defpackage.adw) aogcVar.c).a(dmkVar2);
                                }
                                if (dmjVar3 != null) {
                                    obj5 = dmjVar3.a;
                                } else {
                                    try {
                                        aoivVar = ((defpackage.ipc) obj4).aa(dmpVar2);
                                    } catch (java.lang.Throwable th) {
                                        aoivVar = new defpackage.aoiv(th);
                                    }
                                    if (true == (aoivVar instanceof defpackage.aoiv)) {
                                        aoivVar = null;
                                    }
                                    aogcVar.bv(dmpVar2, aoivVar);
                                    obj5 = aoivVar;
                                }
                            }
                            if (obj5 != null) {
                                aoiuVar = new defpackage.aoiu(arrayList3, defpackage.dfa.j(dnjVar2.d, obj5, dmpVar2, dnjVar2.b, dnjVar2.c));
                                break;
                            }
                            i12++;
                        } else {
                            defpackage.dmk dmkVar3 = new defpackage.dmk(dmpVar2);
                            synchronized (aogcVar.b) {
                                dmjVar = (defpackage.dmj) ((defpackage.add) aogcVar.a).a(dmkVar3);
                                if (dmjVar == null) {
                                    dmjVar = (defpackage.dmj) ((defpackage.adw) aogcVar.c).a(dmkVar3);
                                }
                            }
                            if (dmjVar != null) {
                                if (dmjVar.a != null) {
                                    aoiuVar = new defpackage.aoiu(arrayList3, defpackage.dfa.j(dnjVar2.d, dmjVar.a, dmpVar2, dnjVar2.b, dnjVar2.c));
                                    break;
                                }
                            } else if (arrayList3 == null) {
                                arrayList3 = new java.util.ArrayList(new defpackage.aojv(new defpackage.dmp[]{dmpVar2}, true));
                            } else {
                                arrayList3.add(dmpVar2);
                            }
                            i12++;
                        }
                    }
                    java.util.List list2 = (java.util.List) aoiuVar.a;
                    java.lang.Object obj12 = aoiuVar.b;
                    if (list2 == null) {
                        dnkVar = new defpackage.dnl(obj12, true);
                    } else {
                        defpackage.dmv dmvVar = (defpackage.dmv) obj3;
                        dmi dmiVar = new dmi(list2, obj12, dnjVar2, dmvVar.b, aonjVar2, (defpackage.ipc) obj4);
                        defpackage.aoov.an(dmvVar.a, null, 4, new defpackage.dmu(dmiVar, (defpackage.aoln) null, 0), 1);
                        dnkVar = new dnk(dmiVar);
                    }
                } else {
                    dnkVar = null;
                }
                if (dnkVar != null) {
                    return dnkVar;
                }
                dng dngVar = dnjVar2.a;
                if (dngVar == null || (dngVar instanceof defpackage.dmm)) {
                    objI = defpackage.dfa.i(null, dnjVar2.b, dnjVar2.c);
                } else {
                    if (!(dngVar instanceof defpackage.dnf)) {
                        if (dngVar instanceof dng) {
                            objI = dngVar.f.a;
                        } else {
                            dnlVar = null;
                        }
                        if (dnlVar != null) {
                            return dnlVar;
                        }
                        throw new java.lang.IllegalStateException("Could not load font");
                    }
                    objI = defpackage.dfa.i(((defpackage.dnf) dngVar).f, dnjVar2.b, dnjVar2.c);
                }
                dnlVar = new defpackage.dnl(objI, true);
                if (dnlVar != null) {
                    return dnlVar;
                }
                throw new java.lang.IllegalStateException("Could not load font");
            }
        };
        java.lang.Object obj2 = this.d;
        defpackage.enr enrVar = (defpackage.enr) obj2;
        synchronized (enrVar.a) {
            java.lang.Object obj3 = ((defpackage.enr) obj2).b;
            A = (defpackage.dnm) ((defpackage.add) obj3).a(dnjVar);
            if (A == 0) {
                try {
                    A = aonjVar.a(new defpackage.bet(obj2, dnjVar, 9, null));
                    synchronized (enrVar.a) {
                        obj = ((defpackage.enr) obj2).b;
                        if (((defpackage.add) obj).a(dnjVar) == null && A.b()) {
                            ((defpackage.add) obj).b(dnjVar, A);
                        }
                    }
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalStateException("Could not load font", e);
                }
            } else if (!A.b()) {
                A = aonjVar.a(new defpackage.bet(obj2, dnjVar, 9, null));
                synchronized (enrVar.a) {
                    obj = ((defpackage.enr) obj2).b;
                    if (((defpackage.add) obj).a(dnjVar) == null) {
                        ((defpackage.add) obj).b(dnjVar, A);
                    }
                }
            }
        }
        return A;
    }

    public final defpackage.cer n(defpackage.dmq dmqVar, defpackage.dnd dndVar, int i, int i2) {
        int i3 = ((defpackage.dmf) this.a).a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            dndVar = new defpackage.dnd(defpackage.aooc.w(dndVar.h + i3, 1, 1000));
        }
        return m(new defpackage.dnj(dmqVar, dndVar, i, i2));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [aedq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [aefe, java.lang.Object] */
    public final adxn o(java.lang.Throwable th) {
        return new adxp((defpackage.aazc) this.b, 0, 0, 0, th, (defpackage.aduu) this.e, (defpackage.adxz) this.c, (defpackage.aedq) this.d, (defpackage.aefe) this.a);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [aedq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [aefe, java.lang.Object] */
    public final adxn p(int i) {
        return new adxp((defpackage.aazc) this.b, 0, i, 0, (java.lang.Throwable) null, (defpackage.aduu) this.e, (defpackage.adxz) this.c, (defpackage.aedq) this.d, (defpackage.aefe) this.a);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [aedq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [aefe, java.lang.Object] */
    public final adxn q(int i) {
        return new adxp((defpackage.aazc) this.b, i, 0, 0, (java.lang.Throwable) null, (defpackage.aduu) this.e, (defpackage.adxz) this.c, (defpackage.aedq) this.d, (defpackage.aefe) this.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adli */
    public final void r(defpackage.adhw adhwVar, defpackage.adhw adhwVar2, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) throws adli {
        defpackage.adjz adjzVar = (defpackage.adjz) this.e;
        java.io.File fileE = adjzVar.e(adhwVar);
        java.io.File fileE2 = adjzVar.e(adhwVar2);
        adjzVar.l(adhwVar2, adjzVar.h(adhwVar));
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameE = packManifest.e();
        if (versionedNameE != null) {
            adjzVar.m(adhwVar2, versionedNameE);
        }
        if (packManifest.n()) {
            t(fileE2, packManifest.d());
        }
        if (adhwVar.equals(adhwVar2) || !fileE.exists()) {
            return;
        }
        adjzVar.e.b(((defpackage.adhb) adhwVar).a, adjzVar.f(adhwVar), defpackage.adme.DELETE_FETCHED);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adli */
    public final void s(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, defpackage.adhw adhwVar, defpackage.adhw adhwVar2) throws java.io.IOException, adli {
        defpackage.adjz adjzVar = (defpackage.adjz) this.e;
        java.io.File fileE = adjzVar.e(adhwVar2);
        java.io.File fileE2 = adjzVar.e(adhwVar);
        r(defpackage.adho.a(packManifest.p(), packManifest.l()), adhwVar, packManifest);
        defpackage.aiof aiofVar = defpackage.adhn.c;
        packManifest.p();
        defpackage.adik.d(fileE2);
        defpackage.adik.d(fileE);
        adjzVar.o(adhwVar2, defpackage.adme.INVALID_UNSTAGED_FILE, false);
        adjzVar.l(adhwVar2, adjzVar.h(adhwVar));
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameE = packManifest.e();
        if (versionedNameE != null) {
            adjzVar.m(adhwVar2, versionedNameE);
        }
        if (!fileE2.renameTo(fileE)) {
            throw new java.io.IOException(defpackage.a.bK(fileE, fileE2, "Failed to rename staged file ", " to "));
        }
        synchronized (this) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adli */
    public final void t(java.io.File file, long j) throws adli {
        if (!file.exists()) {
            throw new adli(defpackage.a.bJ(file, "File ", " does not exist"));
        }
        long jA = ((defpackage.adjz) this.e).e.a(file);
        if (jA == j) {
            return;
        }
        throw new adli("File " + file.toString() + " does not have the expected size: " + j + ", actual: " + jA);
    }

    public final int v() {
        return ((java.util.concurrent.atomic.AtomicInteger) this.d).get();
    }

    public final defpackage.aaum w(int i, int i2, aajq aajqVar) {
        ((java.util.concurrent.atomic.AtomicInteger) this.a).incrementAndGet();
        defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        java.lang.Runnable elVar = new el(this, i, aajqVar, zzxVar, 2);
        java.lang.Object obj = this.c;
        android.os.Handler handler = (android.os.Handler) obj;
        if (android.os.Looper.myLooper() == handler.getLooper()) {
            elVar.run();
        } else {
            handler.post(elVar);
        }
        java.lang.Object obj2 = zzxVar.a;
        j$.util.Objects.requireNonNull(obj);
        defpackage.aaum aaumVar = (defpackage.aaum) obj2;
        aaumVar.n(new fbk(obj, 5), new aajp(this, i2));
        return aaumVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq x(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(phoneAccountHandle, "phoneAccountHandle");
        return defpackage.aosv.F(this.d, 0, new bus(this, context, phoneAccountHandle, z, (defpackage.aoln) null, 4, (byte[]) null), 3);
    }

    public final boolean y(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(phoneAccountHandle, "account");
        if (defpackage.zjm.s((defpackage.zjm) this.e, phoneAccountHandle).isPresent()) {
            return new jyn(((defpackage.vth) this.b).b, phoneAccountHandle).k("transcribe_voicemails");
        }
        return false;
    }

    public final j$.util.Optional z(defpackage.vcs vcsVar) {
        defpackage.zzx zzxVar = (defpackage.zzx) this.e;
        return zzxVar.k().containsKey(vcsVar) ? j$.util.Optional.of((viz) ((defpackage.aoin) zzxVar.k().get(vcsVar)).a()) : j$.util.Optional.empty();
    }

    public gat(defpackage.aazc aazcVar, defpackage.aduu aduuVar, defpackage.adxz adxzVar, defpackage.aedq aedqVar, defpackage.aefe aefeVar) {
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(adxzVar, "gnpEnvironment");
        defpackage.aooh.f(aedqVar, "targetCreatorHelper");
        defpackage.aooh.f(aefeVar, "requestUtil");
        this.b = aazcVar;
        this.e = aduuVar;
        this.c = adxzVar;
        this.d = aedqVar;
        this.a = aefeVar;
    }

    public gat(defpackage.ipc ipcVar, defpackage.dmf dmfVar, defpackage.enr enrVar, defpackage.dmv dmvVar) {
        this.c = ipcVar;
        this.a = dmfVar;
        this.d = enrVar;
        this.e = dmvVar;
        this.b = new defpackage.ddz(this, 10);
    }

    public gat(defpackage.zzx zzxVar, defpackage.zzx zzxVar2, defpackage.zzx zzxVar3, defpackage.zzx zzxVar4, defpackage.zzx zzxVar5) {
        this.b = zzxVar;
        this.e = zzxVar2;
        this.a = zzxVar3;
        this.d = zzxVar4;
        this.c = zzxVar5;
    }

    public gat(defpackage.aonn aonnVar, defpackage.aosi aosiVar, defpackage.efd efdVar, defpackage.aolr aolrVar, defpackage.gjy gjyVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("callerContext");
        }
        this.d = aonnVar;
        this.b = aosiVar;
        this.c = efdVar;
        this.e = aolrVar;
        this.a = gjyVar;
    }

    public gat(java.util.Map map) {
        if (map == null) {
            defpackage.aooh.i("initialState");
        }
        if (map == null) {
            defpackage.aooh.i("<this>");
        }
        this.d = new java.util.LinkedHashMap(map);
        this.c = new java.util.LinkedHashMap();
        this.e = new java.util.LinkedHashMap();
        this.b = new java.util.LinkedHashMap();
        this.a = new defpackage.bf(this, 5);
    }

    public gat(defpackage.zjm zjmVar, defpackage.zjm zjmVar2, defpackage.vth vthVar, defpackage.aolr aolrVar, defpackage.aoss aossVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.e = zjmVar;
        this.c = zjmVar2;
        this.b = vthVar;
        this.a = aolrVar;
        this.d = aossVar;
    }

    public gat(android.os.Handler handler, defpackage.aagp aagpVar, defpackage.aajt aajtVar) {
        this.d = new java.util.concurrent.atomic.AtomicInteger();
        this.a = new java.util.concurrent.atomic.AtomicInteger();
        if (aagpVar.c == handler.getLooper()) {
            this.c = handler;
            this.b = aagpVar;
            this.e = aajtVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("GmsClient invokes callbacks is on an unexpected worker thread");
    }

    public gat(android.content.Context context, defpackage.ahyn ahynVar) {
        defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(new defpackage.rwp(ahynVar, 17));
        this.c = ahziVarBI;
        this.e = new defpackage.aakn(context, ahziVarBI);
        this.a = defpackage.ahvr.bI(new defpackage.rwp(context, 18));
        this.b = context;
        byte[] bArr = null;
        defpackage.ahvr.bI(new defpackage.jvu(this, context, 4, bArr));
        this.d = defpackage.ahvr.bI(new defpackage.jvu(this, context, 5, bArr));
        defpackage.ahvr.bI(new defpackage.jvu(this, context, 6, bArr));
        int i = defpackage.aaki.a;
        defpackage.ahvr.bI(new defpackage.rwp(context, 16));
    }

    public gat(defpackage.aoxh aoxhVar, defpackage.aoss aossVar) {
        this.a = new defpackage.afab((byte[]) null);
        defpackage.aoyw aoywVar = new defpackage.aoyw(1, Integer.MAX_VALUE, 1);
        this.c = aoywVar;
        this.d = new defpackage.aozp(aoywVar, new defpackage.fyx(this, (defpackage.aoln) null, 0));
        defpackage.aoub aoubVarAn = defpackage.aoov.an(aossVar, null, 2, new defpackage.bur(aoxhVar, this, (defpackage.aoln) null, 5), 1);
        aoubVarAn.p(new defpackage.ddz(this, 12));
        this.e = aoubVarAn;
        this.b = new defpackage.aowy(new defpackage.eee(this, (defpackage.aoln) null, 2, (char[]) null));
    }

    public gat(defpackage.aonj aonjVar, defpackage.gbr gbrVar) {
        this.a = aonjVar;
        this.b = gbrVar;
        this.c = new defpackage.enr((char[]) null);
        this.d = new defpackage.enr((char[]) null);
        this.e = defpackage.gfz.f(new defpackage.eee(this, (defpackage.aoln) null, 3));
    }

    public gat(defpackage.adjz adjzVar, defpackage.ajct ajctVar, defpackage.apnt apntVar) {
        this.a = new java.util.HashMap();
        this.b = new defpackage.tvn((char[]) null);
        this.e = adjzVar;
        this.d = ajctVar;
        this.c = apntVar;
    }

    public gat() {
        throw null;
    }

    public gat(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5) {
        aoinVar.getClass();
        this.e = aoinVar;
        aoinVar2.getClass();
        this.c = aoinVar2;
        aoinVar3.getClass();
        this.b = aoinVar3;
        aoinVar4.getClass();
        this.d = aoinVar4;
        aoinVar5.getClass();
        this.a = aoinVar5;
    }

    public gat(defpackage.aoin aoinVar, defpackage.ajcu ajcuVar, defpackage.gat gatVar, defpackage.rlv rlvVar) {
        this.b = new j$.util.concurrent.ConcurrentHashMap();
        this.e = aoinVar;
        this.d = ajcuVar;
        this.c = gatVar;
        this.a = rlvVar;
    }

    public gat(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, byte[] bArr) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableSharpieHatsSurveyOnPixel6Pb");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableSharpieHatsSurveyOnPixel7Pb");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("enableSharpieHatsSurveyOnPixel8Pb");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("enableSharpieHatsSurveyOnPixel9Pb");
        }
        if (aoinVar5 == null) {
            defpackage.aooh.i("enableSharpieHatsSurveyOnPixel9Prod");
        }
        this.b = aoinVar;
        this.e = aoinVar2;
        this.c = aoinVar3;
        this.a = aoinVar4;
        this.d = aoinVar5;
    }
}

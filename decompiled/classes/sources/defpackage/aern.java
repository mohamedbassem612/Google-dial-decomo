package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aern implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ defpackage.aero a;
    private final java.lang.Thread.UncaughtExceptionHandler b;

    public aern(defpackage.aero aeroVar, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        j$.util.Objects.requireNonNull(aeroVar);
        this.a = aeroVar;
        this.b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r7v1, types: [amwu, java.lang.Object] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        boolean z;
        ?? r2;
        uzx uzxVarC;
        defpackage.aesb aesbVarB;
        uzx uzxVarC2;
        int i;
        defpackage.akzx akzxVarM;
        java.util.Iterator it;
        aiwi aiwiVar;
        try {
            try {
                defpackage.aero aeroVar = this.a;
                java.lang.String name = thread.getName();
                android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
                android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                defpackage.aevd aevdVar = aeroVar.g;
                defpackage.aenj aenjVar = aeroVar.a;
                defpackage.akzx akzxVarM2 = defpackage.apgi.a.m();
                akzxVarM2.u();
                defpackage.apgi apgiVar = (defpackage.apgi) akzxVarM2.b;
                apgiVar.b |= 1;
                apgiVar.c = true;
                java.lang.String strD = defpackage.aenj.d(aenjVar);
                if (strD != null) {
                    akzxVarM2.u();
                    defpackage.apgi apgiVar2 = (defpackage.apgi) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(strD);
                    apgiVar2.b |= 4;
                    apgiVar2.e = strD;
                }
                try {
                    defpackage.akzx akzxVarM3 = defpackage.apfy.a.m();
                    defpackage.apfx apfxVarQ = ((defpackage.adao) aevdVar.a).q();
                    akzxVarM3.u();
                    defpackage.apfy apfyVar = (defpackage.apfy) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(apfxVarQ);
                    apfyVar.c = apfxVarQ;
                    apfyVar.b |= 1;
                    akzxVarM2.u();
                    defpackage.apgi apgiVar3 = (defpackage.apgi) akzxVarM2.b;
                    defpackage.apfy apfyVar2 = (defpackage.apfy) akzxVarM3.r();
                    j$.util.Objects.requireNonNull(apfyVar2);
                    apgiVar3.d = apfyVar2;
                    apgiVar3.b |= 2;
                    z = true;
                } catch (java.lang.RuntimeException e) {
                    z = true;
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricFactory", "newCrash", 'W', "CrashMetricFactory.java")).v("Failed to get process stats.");
                }
                java.lang.String name2 = th.getClass().getName();
                for (java.lang.Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                defpackage.akzx akzxVarR = ajee.r(th, z);
                java.util.Iterator it2 = ((java.util.Set) aevdVar.b.a()).iterator();
                while (it2.hasNext()) {
                    aers aersVar = (aers) it2.next();
                    aiwh aiwhVar = akzxVarR.b.e;
                    if (aiwhVar == null) {
                        aiwhVar = aiwh.a;
                    }
                    if ((aiwhVar.b & 2) != 0) {
                        java.lang.String str = aiwhVar.d;
                        java.lang.String strA = aersVar.a();
                        if (!str.equals(strA)) {
                            defpackage.akzx akzxVarL = aiwhVar.L();
                            akzxVarL.u();
                            aiwh aiwhVar2 = akzxVarL.b;
                            j$.util.Objects.requireNonNull(strA);
                            aiwhVar2.b |= 2;
                            aiwhVar2.d = strA;
                            aiwh aiwhVarR = akzxVarL.r();
                            akzxVarR.u();
                            aiwk aiwkVar = akzxVarR.b;
                            j$.util.Objects.requireNonNull(aiwhVarR);
                            aiwkVar.e = aiwhVarR;
                            aiwkVar.b |= 1;
                        }
                    }
                    aiwk aiwkVar2 = akzxVarR.b;
                    int i2 = aiwkVar2.c;
                    if (i2 == 4) {
                        aiwi aiwiVar2 = i2 == 4 ? (aiwi) aiwkVar2.d : aiwi.a;
                        defpackage.akzx akzxVarL2 = null;
                        int i3 = 0;
                        while (i3 < aiwiVar2.b.size()) {
                            aiwj aiwjVar = (aiwj) aiwiVar2.b.get(i3);
                            aiwh aiwhVar3 = aiwjVar.c;
                            if (aiwhVar3 == null) {
                                aiwhVar3 = aiwh.a;
                            }
                            if ((aiwhVar3.b & 2) != 0) {
                                java.lang.String str2 = aiwhVar3.d;
                                aiwiVar = aiwiVar2;
                                java.lang.String strA2 = aersVar.a();
                                if (!str2.equals(strA2)) {
                                    if (akzxVarL2 == null) {
                                        akzxVarL2 = aiwiVar.L();
                                    }
                                    defpackage.akzx akzxVarL3 = aiwjVar.L();
                                    defpackage.akzx akzxVarL4 = aiwhVar3.L();
                                    akzxVarL4.u();
                                    aiwh aiwhVar4 = akzxVarL4.b;
                                    j$.util.Objects.requireNonNull(strA2);
                                    aiwhVar4.b |= 2;
                                    aiwhVar4.d = strA2;
                                    aiwh aiwhVarR2 = akzxVarL4.r();
                                    akzxVarL3.u();
                                    aiwj aiwjVar2 = akzxVarL3.b;
                                    j$.util.Objects.requireNonNull(aiwhVarR2);
                                    aiwjVar2.c = aiwhVarR2;
                                    aiwjVar2.b |= 1;
                                    aiwj aiwjVarR = akzxVarL3.r();
                                    akzxVarL2.u();
                                    aiwi aiwiVar3 = akzxVarL2.b;
                                    j$.util.Objects.requireNonNull(aiwjVarR);
                                    aiwiVar3.b();
                                    aiwiVar3.b.set(i3, aiwjVarR);
                                }
                                i3++;
                                aiwiVar2 = aiwiVar;
                                it2 = it2;
                            } else {
                                aiwiVar = aiwiVar2;
                            }
                            i3++;
                            aiwiVar2 = aiwiVar;
                            it2 = it2;
                        }
                        it = it2;
                        if (akzxVarL2 != null) {
                            aiwi aiwiVarR = akzxVarL2.r();
                            akzxVarR.u();
                            aiwk aiwkVar3 = akzxVarR.b;
                            j$.util.Objects.requireNonNull(aiwiVarR);
                            aiwkVar3.d = aiwiVarR;
                            aiwkVar3.c = 4;
                        }
                    } else {
                        it = it2;
                        for (int i4 = 0; i4 < akzxVarR.b.f.size(); i4++) {
                            aiwh aiwhVar5 = (aiwh) akzxVarR.b.f.get(i4);
                            if ((aiwhVar5.b & 2) != 0) {
                                java.lang.String str3 = aiwhVar5.d;
                                java.lang.String strA3 = aersVar.a();
                                if (!str3.equals(strA3)) {
                                    defpackage.akzx akzxVarL5 = aiwhVar5.L();
                                    akzxVarL5.u();
                                    aiwh aiwhVar6 = akzxVarL5.b;
                                    j$.util.Objects.requireNonNull(strA3);
                                    aiwhVar6.b |= 2;
                                    aiwhVar6.d = strA3;
                                    aiwh aiwhVarR3 = akzxVarL5.r();
                                    akzxVarR.u();
                                    aiwk aiwkVar4 = akzxVarR.b;
                                    j$.util.Objects.requireNonNull(aiwhVarR3);
                                    aiwkVar4.b();
                                    aiwkVar4.f.set(i4, aiwhVarR3);
                                }
                            }
                        }
                    }
                    z = z;
                    it2 = it;
                }
                boolean z2 = z;
                akzxVarM2.u();
                defpackage.apgi apgiVar4 = (defpackage.apgi) akzxVarM2.b;
                j$.util.Objects.requireNonNull(name);
                apgiVar4.b |= 8;
                apgiVar4.f = name;
                java.lang.Class<?> cls = th.getClass();
                if (cls == java.lang.OutOfMemoryError.class) {
                    r2 = 3;
                } else if (java.lang.NullPointerException.class.isAssignableFrom(cls)) {
                    r2 = 2;
                } else if (java.lang.RuntimeException.class.isAssignableFrom(cls)) {
                    r2 = 4;
                } else {
                    r2 = java.lang.Error.class.isAssignableFrom(cls) ? 5 : z2;
                }
                akzxVarM2.u();
                defpackage.apgi apgiVar5 = (defpackage.apgi) akzxVarM2.b;
                apgiVar5.g = r2 - 1;
                apgiVar5.b |= 16;
                akzxVarM2.u();
                defpackage.apgi apgiVar6 = (defpackage.apgi) akzxVarM2.b;
                j$.util.Objects.requireNonNull(name2);
                apgiVar6.b |= 128;
                apgiVar6.h = name2;
                aiwk aiwkVarR = akzxVarR.r();
                akzxVarM2.u();
                defpackage.apgi apgiVar7 = (defpackage.apgi) akzxVarM2.b;
                j$.util.Objects.requireNonNull(aiwkVarR);
                apgiVar7.i = aiwkVarR;
                apgiVar7.b |= 256;
                int i5 = ahnn.a;
                defpackage.aerq aerqVar = (defpackage.aerq) aeroVar.d.a();
                if (aerqVar.b && (uzxVarC2 = ahnn.c(th)) != null) {
                    defpackage.aify aifyVar = ((ahqg) uzxVarC2.a).a;
                    int i6 = aerqVar.c;
                    int i7 = aerqVar.d;
                    int i8 = aerqVar.e;
                    java.util.List listAN = defpackage.ahvr.aN(aifyVar);
                    int iMin = java.lang.Math.min(((defpackage.aike) aifyVar).d, i7);
                    defpackage.ahvr.bC(iMin, "initialArraySize");
                    java.util.ArrayList arrayList = new java.util.ArrayList(iMin);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    int i9 = 0;
                    int length = 0;
                    while (true) {
                        if (i9 >= listAN.size()) {
                            i = 0;
                            akzxVarM = null;
                            break;
                        }
                        int i10 = i9 + 1;
                        if (i10 > i7) {
                            akzxVarM = apgg.a.m();
                            int size = listAN.size() - i9;
                            akzxVarM.u();
                            apgg apggVar = akzxVarM.b;
                            apggVar.b |= 1;
                            apggVar.c = size;
                        } else {
                            java.lang.String str4 = (java.lang.String) listAN.get(i9);
                            int i11 = i7;
                            if (java.lang.Math.min(str4.length(), i6) + length > i8) {
                                akzxVarM = apgg.a.m();
                                int size2 = listAN.size() - i9;
                                akzxVarM.u();
                                apgg apggVar2 = akzxVarM.b;
                                apggVar2.b |= 2;
                                apggVar2.d = size2;
                            } else {
                                java.util.List list = listAN;
                                if (str4.length() > i6) {
                                    arrayList.add(str4.substring(0, i6));
                                    arrayList2.add(java.lang.Integer.valueOf(i9));
                                    arrayList3.add(java.lang.Integer.valueOf(str4.length() - i6));
                                    length += i6;
                                } else {
                                    arrayList.add(str4);
                                    length += str4.length();
                                }
                                i9 = i10;
                                i7 = i11;
                                listAN = list;
                            }
                        }
                        i = 0;
                        break;
                    }
                    if (!arrayList2.isEmpty()) {
                        if (akzxVarM == null) {
                            akzxVarM = apgg.a.m();
                        }
                        int size3 = arrayList2.size();
                        for (int i12 = i; i12 < size3; i12++) {
                            int size4 = (arrayList.size() - ((java.lang.Integer) arrayList2.get(i12)).intValue()) - 1;
                            akzxVarM.u();
                            apgg apggVar3 = akzxVarM.b;
                            apgg apggVar4 = apgg.a;
                            defpackage.alak alakVar = apggVar3.e;
                            if (!alakVar.c()) {
                                apggVar3.e = defpackage.alad.H(alakVar);
                            }
                            apggVar3.e.g(size4);
                        }
                        akzxVarM.u();
                        apgg apggVar5 = akzxVarM.b;
                        apgg apggVar6 = apgg.a;
                        defpackage.alak alakVar2 = apggVar5.f;
                        if (!alakVar2.c()) {
                            apggVar5.f = defpackage.alad.H(alakVar2);
                        }
                        defpackage.akyl.i(arrayList3, apggVar5.f);
                    }
                    defpackage.akzx akzxVarM4 = apgh.a.m();
                    java.util.List listAN2 = defpackage.ahvr.aN(arrayList);
                    akzxVarM4.u();
                    apgh apghVar = akzxVarM4.b;
                    defpackage.alat alatVar = apghVar.c;
                    if (!alatVar.c()) {
                        apghVar.c = defpackage.alad.J(alatVar);
                    }
                    defpackage.akyl.i(listAN2, apghVar.c);
                    if (akzxVarM != null) {
                        apgg apggVarR = akzxVarM.r();
                        akzxVarM4.u();
                        apgh apghVar2 = akzxVarM4.b;
                        j$.util.Objects.requireNonNull(apggVarR);
                        apghVar2.d = apggVarR;
                        apghVar2.b |= 1;
                    }
                    apgh apghVarR = akzxVarM4.r();
                    akzxVarM2.u();
                    defpackage.apgi apgiVar8 = (defpackage.apgi) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(apghVarR);
                    apgiVar8.j = apghVarR;
                    apgiVar8.b |= 1024;
                }
                defpackage.apgi apgiVar9 = (defpackage.apgi) akzxVarM2.r();
                defpackage.ahyn ahynVarG = (!((java.lang.Boolean) aeroVar.h.a.a()).booleanValue() || (uzxVarC = ahnn.c(th)) == null || (aesbVarB = defpackage.aesb.b(((ahqg) uzxVarC.a).b)) == null) ? defpackage.ahwt.a : defpackage.ahyn.g(aesbVarB.a());
                aeroVar.l(apgiVar9, (aerz) ahynVarG.e());
            } finally {
                java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (java.lang.Exception e2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e2)).l("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl$PrimesUncaughtExceptionHandler", "uncaughtException", 180, "CrashMetricServiceImpl.java")).v("Failed to record crash.");
        }
    }
}

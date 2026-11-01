package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adjz {
    static final defpackage.ahyp a = new defpackage.adjv();
    public static final /* synthetic */ int i = 0;
    public final defpackage.adjd d;
    public final defpackage.adhk e;
    public final defpackage.adgy f;
    private final java.io.File j;
    public final java.lang.Object b = new java.lang.Object();
    public final java.util.Map c = new java.util.HashMap();
    private final java.util.Map k = new java.util.HashMap();
    public final defpackage.tvn h = new defpackage.tvn((char[]) null);
    public final defpackage.adai g = new defpackage.adai(new defpackage.apnt(this));

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
    }

    public adjz(java.io.File file, defpackage.adjd adjdVar, defpackage.adhk adhkVar, defpackage.adgy adgyVar) {
        this.e = adhkVar;
        this.j = file;
        this.d = adjdVar;
        this.f = adgyVar;
    }

    private static void q(defpackage.adki adkiVar) {
        defpackage.ahym ahymVar = new defpackage.ahym("");
        ahymVar.f("reserved all", adkiVar.a());
        ahymVar.f("reserved ns", adkiVar.b());
        ahymVar.f("used all", adkiVar.c());
        ahymVar.f("used ns", adkiVar.d());
        ahymVar.f("cum. used", adkiVar.h);
        ahymVar.f("cum. deleted", adkiVar.i);
        ahymVar.toString();
    }

    public final int a(defpackage.adhw adhwVar) {
        return java.lang.Math.max(0, ((defpackage.adiw) this.d.a(adhwVar)).g);
    }

    public final com.google.android.libraries.micore.superpacks.base.BasePriority b(java.lang.String str) {
        com.google.android.libraries.micore.superpacks.base.BasePriority basePriority;
        synchronized (this.b) {
            basePriority = (com.google.android.libraries.micore.superpacks.base.BasePriority) this.k.get(str);
            if (basePriority == null) {
                basePriority = com.google.android.libraries.micore.superpacks.base.BasePriority.a;
            }
        }
        return basePriority;
    }

    public final com.google.android.libraries.micore.superpacks.base.VersionedName c(defpackage.adhw adhwVar) {
        return ((defpackage.adiw) this.d.a(adhwVar)).a;
    }

    public final defpackage.adkh d(java.lang.String str) {
        defpackage.adkh adkhVar = (defpackage.adkh) this.c.get(str);
        if (adkhVar != null) {
            return adkhVar;
        }
        throw new java.lang.IllegalArgumentException("Namespace is not registered: ".concat(str));
    }

    public final java.io.File e(defpackage.adhw adhwVar) {
        java.io.File fileF = f(adhwVar);
        java.io.File parentFile = fileF.getParentFile();
        parentFile.getClass();
        parentFile.mkdirs();
        if (parentFile.exists() && parentFile.isDirectory()) {
            return fileF;
        }
        throw new java.io.IOException("Failed to make directories for path: ".concat(parentFile.toString()));
    }

    public final java.io.File f(defpackage.adhw adhwVar) {
        return new java.io.File(g(adhwVar.b()), adhwVar.a());
    }

    public final java.io.File g(java.lang.String str) {
        return new java.io.File(this.j, str);
    }

    public final java.lang.String h(defpackage.adhw adhwVar) {
        return ((defpackage.adiw) this.d.a(adhwVar)).f;
    }

    public final java.lang.String i(defpackage.adhw adhwVar) {
        try {
            return h(adhwVar);
        } catch (java.io.IOException e) {
            ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(e)).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "getSourceOrLog", 485, "FileManager.java")).y("Failed to get source for %s", adhwVar.e(true));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x0013, B:13:0x002a, B:8:0x0018, B:9:0x001a, B:11:0x0022, B:12:0x0027), top: B:19:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x0013, B:13:0x002a, B:8:0x0018, B:9:0x001a, B:11:0x0022, B:12:0x0027), top: B:19:0x000b }] */
    public final void j(defpackage.adhw adhwVar, boolean z, defpackage.adme admeVar) {
        boolean zExists;
        defpackage.adjd adjdVar;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        java.io.File fileF = f(adhwVar);
        synchronized (this.b) {
            if (!z) {
                zExists = fileF.exists();
                adjdVar = this.d;
                if (zExists) {
                    adjdVar.c(adhwVar, 0);
                } else {
                    adjdVar.b(adhwVar);
                }
            } else if (this.g.b(fileF)) {
                defpackage.aiof aiofVar2 = defpackage.adhn.a;
                zExists = fileF.exists();
                adjdVar = this.d;
                if (zExists) {
                    adjdVar.c(adhwVar, 0);
                } else {
                    adjdVar.b(adhwVar);
                }
            } else {
                o(adhwVar, admeVar, true);
            }
            throw th;
        }
    }

    public final void k(java.util.List list) throws java.lang.Throwable {
        int i2;
        long availableBytes;
        java.util.Iterator it;
        char[] cArr;
        long j;
        defpackage.adkg adkgVar;
        if (list.isEmpty()) {
            return;
        }
        int i3 = 0;
        java.lang.String str = ((defpackage.adhb) ((defpackage.adkd) list.get(0)).e()).a;
        try {
            synchronized (this.b) {
                try {
                    defpackage.adkh adkhVarD = d(str);
                    adkhVarD.a();
                    java.util.Collections.sort(list, new defpackage.beg(14));
                    java.lang.String str2 = adkhVarD.a;
                    java.util.Iterator it2 = list.iterator();
                    char[] cArr2 = null;
                    defpackage.adhw adhwVar = null;
                    while (true) {
                        int i4 = 2;
                        int i5 = 1;
                        if (!it2.hasNext()) {
                            java.util.Collections.sort(list, new defpackage.beg(15));
                            try {
                                availableBytes = new android.os.StatFs(this.j.getPath()).getAvailableBytes();
                            } catch (java.lang.IllegalArgumentException unused) {
                                availableBytes = 0;
                            }
                            defpackage.adki adkiVar = new defpackage.adki(this, adkhVarD, list, availableBytes);
                            java.util.Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                defpackage.adkd adkdVar = (defpackage.adkd) it3.next();
                                defpackage.adhw adhwVarE = adkdVar.e();
                                java.lang.String str3 = ((defpackage.adhb) adhwVarE).a;
                                defpackage.ajje ajjeVar = new defpackage.ajje(cArr2);
                                ajjeVar.e = adhwVarE;
                                ajjeVar.d = f(adhwVarE);
                                ajjeVar.a = b(str3);
                                ajjeVar.f = this.d;
                                ajjeVar.b = this.e;
                                defpackage.adju adjuVarI = ajjeVar.i();
                                defpackage.adjc adjcVarC = adjuVarI.c();
                                long jC = adkdVar.c();
                                i2 = i3;
                                try {
                                    int iB = adjcVarC.b();
                                    if (iB == i5 || iB == i4) {
                                        it = it3;
                                        cArr = cArr2;
                                        long jE = adjcVarC.e();
                                        if (jC != jE) {
                                            java.util.Locale locale = java.util.Locale.US;
                                            java.lang.Long lValueOf = java.lang.Long.valueOf(jE);
                                            java.lang.Long lValueOf2 = java.lang.Long.valueOf(jC);
                                            java.lang.Object[] objArr = new java.lang.Object[3];
                                            objArr[i2] = adhwVarE;
                                            objArr[1] = lValueOf;
                                            objArr[2] = lValueOf2;
                                            throw new java.lang.IllegalArgumentException(java.lang.String.format(locale, "File %s is already reserved with a different size of %d, new size: %d", objArr));
                                        }
                                        defpackage.aiof aiofVar = defpackage.adhn.a;
                                    } else {
                                        long j2 = d(str3).b;
                                        defpackage.aiof aiofVar2 = defpackage.adhn.a;
                                        defpackage.adik.b(j2);
                                        defpackage.adik.b(Long.MAX_VALUE);
                                        q(adkiVar);
                                        long jC2 = adkdVar.c();
                                        long jB = (adkiVar.b() + jC2) - j2;
                                        if (jB > 0) {
                                            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkNamespaceQuota", 1291, "FileManager.java")).M("An extra %d bytes are needed to stay under namespace reservation quota for  %s, quota: %d", java.lang.Long.valueOf(jB), adkdVar, java.lang.Long.valueOf(j2));
                                            adkiVar.e(jB, adkdVar, 1, 1);
                                            if ((adkiVar.b() + jC2) - j2 > 0) {
                                                throw new adhr("Not enough namespace quota (" + j2 + ") for " + java.lang.String.valueOf(adkdVar));
                                            }
                                        }
                                        long jC3 = adkdVar.c();
                                        long jA = (adkiVar.a() + jC3) - Long.MAX_VALUE;
                                        int i6 = i2;
                                        while (jA > 0 && i6 <= i5) {
                                            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkGlobalQuota", 1318, "FileManager.java")).M("An extra %d bytes are needed to stay under global quota for %s, quota: %d", java.lang.Long.valueOf(jA), adkdVar, java.lang.Long.valueOf((long) r13));
                                            defpackage.adkd adkdVar2 = adkdVar;
                                            int i7 = i6;
                                            adkiVar.e(jA, adkdVar2, 3, i7);
                                            jA = (adkiVar.a() + jC3) - Long.MAX_VALUE;
                                            i6 = i7 + 1;
                                            it3 = it3;
                                            adkdVar = adkdVar2;
                                            i5 = 1;
                                        }
                                        it = it3;
                                        defpackage.adkd adkdVar3 = adkdVar;
                                        if (jA > 0) {
                                            throw new adhr("Not enough global quota (9223372036854775807) for " + java.lang.String.valueOf(adkdVar3));
                                        }
                                        long jC4 = adkdVar3.c() - adjuVarI.b();
                                        if (jC4 > 0) {
                                            long jD = adkiVar.d();
                                            long j3 = (jD + jC4) - j2;
                                            if (j3 > 0) {
                                                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkActualSizeAgainstNamespaceQuota", 1348, "FileManager.java")).N("An extra %d bytes are needed to stay under actual usage quota, total used: %d, namespace quota: %d, requested: %d", java.lang.Long.valueOf(j3), java.lang.Long.valueOf(jD), java.lang.Long.valueOf(j2), java.lang.Long.valueOf(jC4));
                                                adkiVar.e(j3, adkdVar3, 2, 0);
                                                long jD2 = (adkiVar.d() + jC4) - j2;
                                                if (jD2 > 0) {
                                                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkActualSizeAgainstNamespaceQuota", 1363, "FileManager.java")).x("Extra space needed is still needed for namespace, this should not happen: %d", jD2);
                                                }
                                            }
                                        }
                                        long jC5 = adkdVar3.c();
                                        long jB2 = jC5 - adjuVarI.b();
                                        if (jB2 <= 0) {
                                            j = j2;
                                        } else {
                                            long jC6 = adkiVar.c();
                                            long jA2 = (jC6 + jB2) - Long.MAX_VALUE;
                                            int i8 = i2;
                                            while (jA2 > 0 && i8 <= 1) {
                                                int i9 = i8;
                                                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkActualSizeAgainstGlobalQuota", 1389, "FileManager.java")).N("An extra %d bytes are needed to stay under actual usage quota, total used: %d, quota: %d, requested: %d", java.lang.Long.valueOf(jA2), java.lang.Long.valueOf(jC6), java.lang.Long.valueOf((long) r13), java.lang.Long.valueOf(jB2));
                                                adkiVar.e(jA2, adkdVar3, 3, i9);
                                                jA2 = (adkiVar.a() + jC5) - Long.MAX_VALUE;
                                                i8 = i9 + 1;
                                                j2 = j2;
                                            }
                                            j = j2;
                                            long j4 = jA2;
                                            if (jA2 > 0) {
                                                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkActualSizeAgainstGlobalQuota", 1405, "FileManager.java")).x("Extra space needed is still needed for all namespaces, this should not happen: %d", j4);
                                            }
                                        }
                                        long jC7 = adkdVar3.c();
                                        long j5 = (jC7 - adkiVar.g) + adkiVar.h;
                                        int i10 = i2;
                                        while (j5 > 0 && i10 <= 1) {
                                            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "checkDiskSpace", 1423, "FileManager.java")).x("An extra %d bytes are needed to fit within disk space", j5);
                                            int i11 = i10;
                                            adkiVar.e(j5, adkdVar3, 3, i11);
                                            j5 = (jC7 - adkiVar.g) + adkiVar.h;
                                            i10 = i11 + 1;
                                        }
                                        if (j5 > 0) {
                                            java.util.Locale locale2 = java.util.Locale.US;
                                            java.lang.Long lValueOf3 = java.lang.Long.valueOf(adkiVar.g);
                                            java.lang.Long lValueOf4 = java.lang.Long.valueOf(jC7);
                                            java.lang.Object[] objArr2 = new java.lang.Object[2];
                                            objArr2[i2] = lValueOf3;
                                            objArr2[1] = lValueOf4;
                                            throw new adhs(java.lang.String.format(locale2, "Not enough available space (%d) for reservation of %d bytes.", objArr2));
                                        }
                                        defpackage.adhw adhwVarE2 = adkdVar3.e();
                                        defpackage.adkf adkfVar = adkiVar.f;
                                        defpackage.adhw adhwVarE3 = adkdVar3.e();
                                        int iF = adkdVar3.f();
                                        int iB2 = adkdVar3.b();
                                        long jC8 = adkdVar3.c();
                                        java.util.Map map = adkfVar.b;
                                        synchronized (map) {
                                            try {
                                                adkgVar = (defpackage.adkg) map.get(adhwVarE3);
                                                if (adkgVar == null) {
                                                    defpackage.adjc adjcVar = defpackage.adkf.a;
                                                    adkgVar = new defpackage.adkg(adhwVarE3, ((defpackage.adiw) adjcVar).b, ((defpackage.adiw) adjcVar).c, ((defpackage.adiw) adjcVar).d, ((defpackage.adiw) adjcVar).e, ((defpackage.adiw) adjcVar).f, ((defpackage.adiw) adjcVar).a, ((defpackage.adiw) adjcVar).g);
                                                    map.put(adhwVarE3, adkgVar);
                                                }
                                            } catch (java.lang.Throwable th) {
                                                throw th;
                                            }
                                        }
                                        if (iF != adkgVar.c) {
                                            adkgVar.c = iF;
                                            adkgVar.a();
                                        }
                                        if (iB2 != adkgVar.d) {
                                            adkgVar.d = iB2;
                                            adkgVar.a();
                                        }
                                        if (jC8 != adkgVar.b) {
                                            adkgVar.b = jC8;
                                            adkgVar.a();
                                        }
                                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                                        if (jCurrentTimeMillis != adkgVar.e) {
                                            adkgVar.e = jCurrentTimeMillis;
                                            adkgVar.a();
                                        }
                                        cArr = null;
                                        defpackage.ajje ajjeVar2 = new defpackage.ajje((char[]) null);
                                        ajjeVar2.e = adhwVarE2;
                                        defpackage.adjz adjzVar = adkiVar.a;
                                        ajjeVar2.d = adjzVar.f(adhwVarE2);
                                        ajjeVar2.a = adjzVar.b(((defpackage.adhb) adhwVarE2).a);
                                        ajjeVar2.f = adkfVar;
                                        ajjeVar2.b = adjzVar.e;
                                        defpackage.adju adjuVarI2 = ajjeVar2.i();
                                        adkiVar.e.put(adhwVarE2, adjuVarI2);
                                        adkiVar.d.put(adhwVarE2, adjuVarI2);
                                        adkiVar.h += java.lang.Math.max(0L, adkdVar3.c() - adjuVarI2.b());
                                        defpackage.aiof aiofVar3 = defpackage.adhn.a;
                                        defpackage.adik.b(adkiVar.d());
                                        defpackage.adik.b(adkiVar.b());
                                        defpackage.adik.b(j);
                                        defpackage.adik.b(r13);
                                    }
                                    it3 = it;
                                    cArr2 = cArr;
                                    i3 = i2;
                                    i4 = 2;
                                    i5 = 1;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                            }
                            java.util.List<defpackage.adju> list2 = adkiVar.c;
                            long jB3 = 0;
                            for (defpackage.adju adjuVar : list2) {
                                jB3 += adjuVar.b();
                                o(adjuVar.a, defpackage.adme.CHILL_GC, true);
                            }
                            if (!list2.isEmpty()) {
                                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "commitReservation", 1183, "FileManager.java")).A("%d files were deleted to commit the reservation, total size: %d bytes", list2.size(), jB3);
                            }
                            defpackage.aiof aiofVar4 = defpackage.adhn.a;
                            q(adkiVar);
                            for (defpackage.adkd adkdVar4 : adkiVar.b) {
                                defpackage.adjd adjdVar = this.d;
                                defpackage.adhw adhwVarE4 = adkdVar4.e();
                                int iF2 = adkdVar4.f();
                                int iB3 = adkdVar4.b();
                                long jC9 = adkdVar4.c();
                                android.content.ContentValues contentValues = new android.content.ContentValues(6);
                                contentValues.put("namespace", ((defpackage.adhb) adhwVarE4).a);
                                contentValues.put("name", ((defpackage.adhb) adhwVarE4).b);
                                contentValues.put("gc_priority", java.lang.Integer.valueOf(iF2));
                                contentValues.put("reservation_state", java.lang.Integer.valueOf(iB3));
                                contentValues.put("reserved_size", java.lang.Long.valueOf(jC9));
                                contentValues.put("last_access_millis", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                                ((defpackage.adjo) adjdVar).d(adhwVarE4, contentValues);
                            }
                            return;
                        }
                        defpackage.adhw adhwVarE5 = ((defpackage.adkd) it2.next()).e();
                        if (adhwVarE5.equals(adhwVar)) {
                            throw new java.lang.IllegalArgumentException("Found duplicate reservation for ".concat(adhwVarE5.toString()));
                        }
                        java.lang.String str4 = ((defpackage.adhb) adhwVarE5).a;
                        if (adhwVar != null && !android.text.TextUtils.equals(str4, str2)) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "All files in the reservation block need to be in the same namespace. Found: %s, other: %s", str4, str2));
                        }
                        adhwVar = adhwVarE5;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    i2 = 0;
                }
            }
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                th = th4;
                this.h.P(new adjw(str, th, i2));
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            i2 = 0;
        }
    }

    public final void l(defpackage.adhw adhwVar, java.lang.String str) {
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put("source", str);
        ((defpackage.adjo) this.d).d(adhwVar, contentValues);
    }

    public final void m(defpackage.adhw adhwVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName) {
        android.content.ContentValues contentValues = new android.content.ContentValues(2);
        contentValues.put("superpack_name", versionedName.b());
        contentValues.put("superpack_version", java.lang.Integer.valueOf(versionedName.a()));
        ((defpackage.adjo) this.d).d(adhwVar, contentValues);
    }

    public final boolean n(java.lang.String str) {
        boolean z;
        synchronized (this.b) {
            defpackage.adkh adkhVar = (defpackage.adkh) this.c.get(str);
            z = false;
            if (adkhVar != null && adkhVar.c) {
                z = true;
            }
        }
        return z;
    }

    public final void o(defpackage.adhw adhwVar, defpackage.adme admeVar, boolean z) {
        java.io.File file = new java.io.File(g(adhwVar.b()), adhwVar.a());
        if (this.g.b(file)) {
            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "deleteFile", 835, "FileManager.java")).y("Deleting referenced file %s!", defpackage.adik.f(adhwVar.b(), defpackage.adik.d(file)));
        }
        if (file.exists() && this.e.b(adhwVar.b(), file, admeVar)) {
            this.h.P(new adgv(this, adhwVar, admeVar, 2));
        }
        if (z) {
            this.d.b(adhwVar);
        }
    }

    public final void p(defpackage.adhw adhwVar) {
        j(adhwVar, false, defpackage.adme.AGGRESSIVE_GC);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adna implements defpackage.adip {
    public static final long a;
    private final defpackage.adni b;
    private final boolean c;
    private final long d;
    private final defpackage.tvn e;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        a = 86400000L;
    }

    public adna(defpackage.admz admzVar) {
        this.b = admzVar.b;
        this.e = admzVar.e;
        this.c = admzVar.c;
        this.d = admzVar.d;
    }

    @Override // defpackage.adhp
    public final java.lang.String a() {
        return "ScheduledDownloadFetcher";
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d4 A[Catch: adnh | IOException -> 0x00e9, IOException -> 0x00eb, all -> 0x00f6, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0003, B:6:0x0019, B:7:0x001b, B:31:0x00d4, B:32:0x00da, B:36:0x00df, B:39:0x00e3, B:40:0x00e8, B:45:0x00ed), top: B:53:0x0001 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.adhi
    public final synchronized defpackage.ajcq b(defpackage.adhw adhwVar) {
        defpackage.ajcq ajddVar;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        try {
            defpackage.adni adniVar = this.b;
            defpackage.tvn tvnVar = this.e;
            java.lang.String string = adhwVar.toString();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object obj = defpackage.adnd.a;
            if (jCurrentTimeMillis <= 0) {
                throw new java.lang.IllegalArgumentException();
            }
            synchronized (defpackage.adnd.a) {
                try {
                    java.util.Map map = defpackage.adnd.c;
                    ajddVar = (defpackage.ajcq) map.get(string);
                    if (ajddVar == null) {
                        defpackage.adjg adjgVarM = tvnVar.M(string);
                        boolean z = false;
                        if (adjgVarM == null) {
                            if (z) {
                                defpackage.adnd.b(adniVar, tvnVar, null, jCurrentTimeMillis, "download cancelled");
                            }
                            ajddVar = defpackage.ajcm.a;
                        } else {
                            if (adjgVarM.c) {
                                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "cancel", 258, "ScheduledDownloadManager.java")).y("Canceling completed download: %s", adjgVarM.d().e(true));
                                tvnVar.N(string);
                            } else {
                                defpackage.aogc aogcVar = defpackage.adnd.e;
                                if (aogcVar.ae(string)) {
                                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "cancel", 224, "ScheduledDownloadManager.java")).y("Canceling active download: %s", adjgVarM.d().e(true));
                                    defpackage.admg admgVar = (defpackage.admg) aogcVar.b.get(string);
                                    if (admgVar != null) {
                                        admgVar.b(3, (defpackage.tvn) aogcVar.c);
                                    }
                                    ajddVar = new defpackage.ajdd();
                                    map.put(string, ajddVar);
                                } else {
                                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadManager", "cancel", 241, "ScheduledDownloadManager.java")).y("Canceling inactive download: %s", adjgVarM.d().e(true));
                                    defpackage.ajdd ajddVar2 = (defpackage.ajdd) defpackage.adnd.b.remove(string);
                                    if (ajddVar2 != null) {
                                        ajddVar2.cancel(false);
                                    }
                                    tvnVar.N(string);
                                    z = true;
                                }
                            }
                            if (z) {
                                defpackage.adnd.b(adniVar, tvnVar, null, jCurrentTimeMillis, "download cancelled");
                            }
                            ajddVar = defpackage.ajcm.a;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (defpackage.adnh | java.io.IOException e) {
            ajddVar = new defpackage.ajdd(e);
        }
        return ajddVar;
    }

    @Override // defpackage.adip
    public final defpackage.adim c(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        if (packManifest.g().isEmpty()) {
            defpackage.aiof aiofVar = defpackage.adhn.a;
            return null;
        }
        long jC = packManifest.c();
        java.lang.String strL = packManifest.l();
        int i = defpackage.adho.a;
        if (strL != null) {
            defpackage.adho.e(strL);
        }
        defpackage.adik.k("compressedSize", jC);
        return new defpackage.adim(jC, strL);
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [adiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [adiz, java.lang.Object] */
    @Override // defpackage.adip
    public final defpackage.ajcq d(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, defpackage.adin adinVar, java.io.File file) {
        defpackage.ajdd ajddVar;
        defpackage.ajcq ajcqVarA;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        packManifest.p();
        if (packManifest.g().isEmpty()) {
            throw new java.lang.IllegalArgumentException("The pack manifest has no download URLs.");
        }
        defpackage.adin adinVar2 = adinVar == null ? defpackage.adin.f : adinVar;
        java.lang.String string = packManifest.p().toString();
        defpackage.adjh adjhVarN = defpackage.adji.n();
        adjhVarN.c(string);
        adjhVarN.a = packManifest.e();
        defpackage.adil adilVar = (defpackage.adil) adinVar2;
        adjhVarN.d(adilVar.a.c(packManifest.a()));
        adjhVarN.l(packManifest.g());
        adjhVarN.j(java.lang.System.currentTimeMillis());
        adjhVarN.h(adinVar2.g(this.c));
        adjhVarN.f(adilVar.b == 1);
        adjhVarN.g(adilVar.c == 1);
        adjhVarN.e(adilVar.d == 1);
        adjhVarN.k(this.d);
        adjhVarN.b(file.getAbsolutePath());
        int i = adilVar.e;
        if (i == 0) {
            i = 2;
        }
        adjhVarN.i(i);
        defpackage.adjg adjgVar = new defpackage.adjg(adjhVarN.a(), false, null, 0L, 0L);
        try {
            synchronized (this) {
                defpackage.adni adniVar = this.b;
                defpackage.tvn tvnVar = this.e;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.Object obj = defpackage.adnd.a;
                if (jCurrentTimeMillis <= 0) {
                    throw new java.lang.IllegalArgumentException();
                }
                java.lang.String strI = adjgVar.i();
                synchronized (defpackage.adnd.a) {
                    try {
                        defpackage.adjg adjgVarM = tvnVar.M(strI);
                        if (adjgVarM != null) {
                            boolean z = adjgVarM.c;
                            defpackage.aiof aiofVar2 = defpackage.adhn.a;
                            if (z) {
                                tvnVar.N(strI);
                                java.lang.String str = adjgVarM.d;
                                if (str == null || str.isEmpty()) {
                                    defpackage.aiof aiofVar3 = defpackage.adhn.a;
                                    ajcqVarA = new defpackage.ajcm(new defpackage.adio(adjgVarM.g().isEmpty() ? null : (java.lang.String) adjgVarM.g().get(0)));
                                } else {
                                    defpackage.aiof aiofVar4 = defpackage.adhn.a;
                                    ajcqVarA = new defpackage.ajdd(new admo(str));
                                }
                            } else {
                                if ((adjgVar.b() & 1) == 0) {
                                    long j = adjgVar.e;
                                    long j2 = adjgVarM.e;
                                    if (j < j2) {
                                        adjgVar.j(j2);
                                        adjgVar.f = adjgVarM.f;
                                    }
                                }
                                tvnVar.O(adjgVar);
                            }
                        } else {
                            defpackage.aiof aiofVar5 = defpackage.adhn.a;
                            try {
                                ?? r3 = tvnVar.a;
                                if (r3.getWritableDatabase().insertOrThrow("pending_downloads", null, adjgVar.c()) < 0) {
                                    java.io.IOException iOException = new java.io.IOException("SqlitePendingDownloadQueue#insert, SQL insert failed, download: " + adjgVar.i());
                                    r3.a(iOException);
                                    throw iOException;
                                }
                            } catch (android.database.sqlite.SQLiteException e) {
                                ?? r2 = tvnVar.a;
                                java.io.IOException iOException2 = new java.io.IOException("SqlitePendingDownloadQueue#insert, SQL insert failed, download: ".concat(adjgVar.i()), e);
                                r2.a(iOException2);
                                throw iOException2;
                            }
                        }
                        java.util.Map map = defpackage.adnd.b;
                        defpackage.ajdd ajddVar2 = (defpackage.ajdd) map.get(strI);
                        if (ajddVar2 == null) {
                            ajddVar2 = new defpackage.ajdd();
                            map.put(strI, ajddVar2);
                        }
                        defpackage.aogc aogcVar = defpackage.adnd.e;
                        ?? r4 = aogcVar.b;
                        defpackage.admg admgVar = (defpackage.admg) r4.get(adjgVar.i());
                        if (admgVar != null) {
                            int iA = adjgVar.a();
                            int iA2 = admgVar.a.a();
                            if (!admgVar.b.equals(defpackage.adng.a(adjgVar)) || iA < iA2) {
                                admgVar.b(5, (defpackage.tvn) aogcVar.c);
                            } else if (iA > iA2 && !admgVar.a()) {
                                admgVar.a = adjgVar;
                                admgVar.b = defpackage.adng.a(adjgVar);
                                for (defpackage.admg admgVar2 : r4.values()) {
                                    if (admgVar2 != admgVar) {
                                        admgVar2.b(6, (defpackage.tvn) aogcVar.c);
                                    }
                                }
                            }
                        }
                        defpackage.adnd.b(adniVar, tvnVar, null, jCurrentTimeMillis, "download registered");
                        ajcqVarA = defpackage.aiql.A(ajddVar2);
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            defpackage.adnd.d.P(new defpackage.admf(adjgVar, 2));
            return ajcqVarA;
        } catch (defpackage.adnh e2) {
            defpackage.adnd.d.P(new adgt(4));
            ajddVar = new defpackage.ajdd(e2);
            return ajddVar;
        } catch (java.io.IOException e3) {
            ajddVar = new defpackage.ajdd(e3);
            return ajddVar;
        }
    }
}

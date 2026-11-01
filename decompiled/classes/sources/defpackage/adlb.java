package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adlb implements defpackage.adip {
    public static final defpackage.aiuk a = new defpackage.adkw();
    public final java.util.concurrent.ScheduledExecutorService b;
    private final java.util.List e;
    public final defpackage.tvn d = new defpackage.tvn((char[]) null);
    public final java.util.Map c = new java.util.HashMap();

    public adlb(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.List list) {
        this.b = scheduledExecutorService;
        this.e = list;
    }

    @Override // defpackage.adhp
    public final java.lang.String a() {
        return "DownloadFetcher";
    }

    @Override // defpackage.adhi
    public final defpackage.ajcq b(defpackage.adhw adhwVar) {
        defpackage.ajcq ajcqVar;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        synchronized (this) {
            defpackage.adla adlaVar = (defpackage.adla) this.c.get(adhwVar);
            if (adlaVar != null) {
                synchronized (adlaVar) {
                    try {
                        ajcqVar = adlaVar.f;
                        if (ajcqVar == null) {
                            defpackage.aezs aezsVar = adlaVar.j;
                            java.io.File file = adlaVar.c;
                            java.lang.Object obj = aezsVar.c;
                            java.io.File parentFile = file.getParentFile();
                            if (parentFile == null) {
                                throw null;
                            }
                            ((defpackage.adth) obj).d(parentFile, file.getName());
                            adlaVar.f = new defpackage.ajdd();
                            ajcqVar = adlaVar.f;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            } else {
                ajcqVar = defpackage.ajcm.a;
            }
        }
        return ajcqVar;
    }

    @Override // defpackage.adip
    public final defpackage.adim c(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        if (packManifest.g().isEmpty()) {
            return null;
        }
        try {
            e((java.lang.String) defpackage.ahvr.bj(packManifest.g(), null));
            long jC = packManifest.c();
            java.lang.String strL = packManifest.l();
            int i = defpackage.adho.a;
            if (strL != null) {
                defpackage.adho.e(strL);
            }
            defpackage.adik.k("compressedSize", jC);
            return new defpackage.adim(jC, strL);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    @Override // defpackage.adip
    public final defpackage.ajcq d(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, defpackage.adin adinVar, java.io.File file) throws java.lang.Throwable {
        defpackage.adlb adlbVar;
        java.lang.Throwable th;
        defpackage.ajcq ajcqVar;
        defpackage.aify aifyVarG = packManifest.g();
        java.lang.String str = (java.lang.String) defpackage.ahvr.aY(aifyVarG.listIterator(0), null);
        defpackage.aiof aiofVar = defpackage.adhn.a;
        if (aifyVarG.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Manifest has no download URLs");
        }
        synchronized (this) {
            try {
                java.util.Map map = this.c;
                defpackage.adla adlaVar = (defpackage.adla) map.get(packManifest.p());
                if (adlaVar == null) {
                    if (adinVar == null) {
                        try {
                            adinVar = defpackage.adin.f;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            adlbVar = this;
                            throw th;
                        }
                    }
                    adlbVar = this;
                    try {
                        adlaVar = new defpackage.adla(adlbVar, e(str), packManifest, adinVar, file);
                        map.put(packManifest.p(), adlaVar);
                        synchronized (adlaVar) {
                            try {
                                defpackage.adfi adfiVar = new defpackage.adfi(adlaVar, 3);
                                int i = ((defpackage.aike) adlaVar.a.g()).d;
                                j$.time.Duration duration = defpackage.aiue.d;
                                defpackage.aiua aiuaVar = new defpackage.aiua(i);
                                defpackage.ahyp ahypVar = adlaVar.d;
                                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = adlaVar.h.b;
                                defpackage.aiuk aiukVar = a;
                                java.lang.Object obj = defpackage.aiul.a;
                                defpackage.ahzp ahzpVar = defpackage.ahzp.a;
                                ?? r8 = new defpackage.ahys(scheduledExecutorService).a;
                                adlaVar.g = defpackage.abrz.B(new defpackage.aiul(adfiVar, aiuaVar, ahypVar, r8, r8, ahzpVar, aiukVar), new defpackage.vcz(adlaVar, 9), scheduledExecutorService);
                            } catch (java.lang.Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                } else {
                    adlbVar = this;
                }
                synchronized (adlaVar) {
                    try {
                        ajcqVar = adlaVar.g;
                    } catch (java.lang.Throwable th5) {
                        throw th5;
                    }
                }
                return ajcqVar;
            } catch (java.lang.Throwable th6) {
                th = th6;
                adlbVar = this;
            }
        }
    }

    final defpackage.aezs e(java.lang.String str) {
        for (defpackage.aezs aezsVar : this.e) {
            if (str != null) {
                try {
                    java.lang.String scheme = android.net.Uri.parse(str).normalizeScheme().getScheme();
                    if ("http".equals(scheme) || "https".equals(scheme)) {
                        return aezsVar;
                    }
                } catch (java.lang.Exception e) {
                    ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(e)).l("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol", "canHandle", 184, "HttpDownloadProtocol.java")).y("Exception while attemption to parse URL %s", str);
                }
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("No registered download protocol could support URL %s", str));
    }
}

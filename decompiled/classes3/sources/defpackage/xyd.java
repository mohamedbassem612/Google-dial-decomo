package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyd implements defpackage.xyb {
    private final java.io.File a;
    private defpackage.xtd b;
    private final defpackage.uyg d = new defpackage.uyg((byte[]) null);
    private final defpackage.uyg c = new defpackage.uyg();

    public xyd(java.io.File file) {
        this.a = file;
    }

    private final synchronized defpackage.xtd d() {
        defpackage.xtd xtdVar;
        xtdVar = this.b;
        if (xtdVar == null) {
            java.io.File file = this.a;
            java.io.File file2 = new java.io.File(file, "journal.bkp");
            if (file2.exists()) {
                java.io.File file3 = new java.io.File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    defpackage.xtd.g(file2, file3, false);
                }
            }
            defpackage.xtd xtdVar2 = new defpackage.xtd(file);
            if (xtdVar2.b.exists()) {
                try {
                    xtdVar2.e();
                    defpackage.xtd.d(xtdVar2.c);
                    java.util.Iterator it = xtdVar2.g.values().iterator();
                    while (it.hasNext()) {
                        defpackage.xtb xtbVar = (defpackage.xtb) it.next();
                        if (xtbVar.d == null) {
                            for (int i = 0; i < xtdVar2.d; i = 1) {
                                xtdVar2.e += xtbVar.b[0];
                            }
                        } else {
                            xtbVar.d = null;
                            for (int i2 = 0; i2 < xtdVar2.d; i2 = 1) {
                                defpackage.xtd.d(xtbVar.c());
                                defpackage.xtd.d(xtbVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (java.io.IOException e) {
                    java.lang.System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    xtdVar2.c();
                    file.mkdirs();
                    xtdVar2 = new defpackage.xtd(file);
                    xtdVar2.f();
                }
                xtdVar = xtdVar2;
                this.b = xtdVar;
            }
            file.mkdirs();
            xtdVar2 = new defpackage.xtd(file);
            xtdVar2.f();
            xtdVar = xtdVar2;
            this.b = xtdVar;
        }
        return xtdVar;
    }

    private final synchronized void e() {
        this.b = null;
    }

    @Override // defpackage.xyb
    public final java.io.File a(defpackage.xuo xuoVar) {
        java.lang.String strR = this.c.r(xuoVar);
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 2)) {
            android.util.Log.v("DiskLruCacheWrapper", hgb.l(xuoVar, strR, "Get: Obtained: ", " for for Key: "));
        }
        try {
            defpackage.xtc xtcVarA = d().a(strR);
            if (xtcVarA == null) {
                return null;
            }
            return new java.io.File(((defpackage.xtd) xtcVarA.b).a, ((java.lang.String) xtcVarA.a) + ".0");
        } catch (java.io.IOException e) {
            if (!android.util.Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            android.util.Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.xyb
    public final synchronized void b() {
        try {
            try {
                d().c();
            } catch (java.io.IOException e) {
                if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    android.util.Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
            e();
        } catch (java.lang.Throwable th) {
            e();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, xue] */
    @Override // defpackage.xyb
    public final void c(defpackage.xuo xuoVar, defpackage.rju rjuVar) {
        defpackage.aogy aogyVar;
        java.io.File fileD;
        defpackage.aogy aogyVar2;
        java.lang.String strR = this.c.r(xuoVar);
        defpackage.uyg uygVar = this.d;
        synchronized (uygVar) {
            aogyVar = (defpackage.aogy) uygVar.a.get(strR);
            if (aogyVar == null) {
                ?? r2 = ((defpackage.vqu) uygVar.b).a;
                synchronized (r2) {
                    try {
                        aogyVar2 = (defpackage.aogy) r2.poll();
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                aogyVar = aogyVar2 == null ? new defpackage.aogy((byte[]) null) : aogyVar2;
                uygVar.a.put(strR, aogyVar);
            }
            aogyVar.a++;
        }
        aogyVar.b.lock();
        try {
            if (android.util.Log.isLoggable("DiskLruCacheWrapper", 2)) {
                android.util.Log.v("DiskLruCacheWrapper", hgb.l(xuoVar, strR, "Put: Obtained: ", " for for Key: "));
            }
            try {
                defpackage.xtd xtdVarD = d();
                if (xtdVarD.a(strR) == null) {
                    defpackage.xta xtaVarJ = xtdVarD.j(strR);
                    if (xtaVarJ == null) {
                        throw new java.lang.IllegalStateException(a.bx(strR, "Had two simultaneous puts for: "));
                    }
                    try {
                        defpackage.xtd xtdVar = xtaVarJ.d;
                        synchronized (xtdVar) {
                            defpackage.xtb xtbVar = xtaVarJ.a;
                            if (xtbVar.d != xtaVarJ) {
                                throw new java.lang.IllegalStateException();
                            }
                            if (!xtbVar.c) {
                                xtaVarJ.b[0] = true;
                            }
                            fileD = xtbVar.d();
                            xtdVar.a.mkdirs();
                        }
                        if (rjuVar.a.a(rjuVar.c, fileD, (defpackage.xus) rjuVar.b)) {
                            xtdVar.b(xtaVarJ, true);
                            xtaVarJ.c = true;
                        }
                        xtaVarJ.b();
                    } catch (java.lang.Throwable th2) {
                        xtaVarJ.b();
                        throw th2;
                    }
                }
            } catch (java.io.IOException e) {
                if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    android.util.Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            this.d.s(strR);
        } catch (java.lang.Throwable th3) {
            this.d.s(strR);
            throw th3;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgx implements defpackage.afhg {
    public final java.lang.String a;
    public final defpackage.ajcq b;
    public final java.util.concurrent.Executor c;
    public final defpackage.ahyn d;
    public final defpackage.ahny f;
    public java.lang.Object h;
    public boolean i;
    public final defpackage.afgk j;
    public final defpackage.afhk k;
    public final defpackage.aogc m;
    public final defpackage.afge e = new defpackage.afgw(this);
    public final java.lang.Object g = new java.lang.Object();
    public final defpackage.ajwr l = new defpackage.ajwr();
    private final defpackage.ajwr n = new defpackage.ajwr();

    public afgx(java.lang.String str, defpackage.ajcq ajcqVar, defpackage.afhk afhkVar, java.util.concurrent.Executor executor, defpackage.aogc aogcVar, defpackage.afgk afgkVar, defpackage.ahyn ahynVar, defpackage.ahny ahnyVar) {
        new defpackage.ajwr();
        this.h = null;
        this.a = str;
        this.b = defpackage.aiql.A(ajcqVar);
        this.k = afhkVar;
        this.c = executor;
        this.m = aogcVar;
        this.j = afgkVar;
        this.d = ahynVar;
        this.f = ahnyVar;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            java.util.UUID.randomUUID().toString();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static defpackage.ajcq b(defpackage.ajcq ajcqVar, java.io.Closeable closeable, java.util.concurrent.Executor executor) {
        return defpackage.aiql.Z(ajcqVar).b(new afgu(closeable, ajcqVar, 0), executor);
    }

    public static boolean e(java.io.IOException iOException) {
        return (iOException instanceof afeo) || (iOException.getCause() instanceof afeo);
    }

    private final java.io.Closeable j(android.net.Uri uri) {
        try {
            defpackage.aogc aogcVar = this.m;
            defpackage.affo affoVar = new defpackage.affo(true, true);
            affoVar.a = true;
            return (java.io.Closeable) aogcVar.M(uri, affoVar);
        } catch (defpackage.affa unused) {
            return null;
        }
    }

    @Override // defpackage.afhg
    public final defpackage.ajas a() {
        return new defpackage.nya(this, 10);
    }

    public final java.lang.Object c(android.net.Uri uri) throws java.io.IOException {
        try {
            try {
                defpackage.ahoq ahoqVarB = this.f.b("Read " + this.a);
                try {
                    java.io.InputStream inputStream = (java.io.InputStream) this.m.M(uri, new defpackage.affr());
                    try {
                        defpackage.albh albhVarA = this.k.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        ahoqVarB.close();
                        return albhVarA;
                    } catch (java.lang.Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        ahoqVarB.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.io.FileNotFoundException unused) {
                defpackage.aogc aogcVar = this.m;
                if (!aogcVar.R(uri)) {
                    return this.k.a;
                }
                java.io.InputStream inputStream2 = (java.io.InputStream) aogcVar.M(uri, new defpackage.affr());
                try {
                    defpackage.albh albhVarA2 = this.k.a(inputStream2);
                    if (inputStream2 == null) {
                        return albhVarA2;
                    }
                    inputStream2.close();
                    return albhVarA2;
                } catch (java.lang.Throwable th5) {
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            }
        } catch (java.io.IOException e) {
            throw defpackage.aehj.cx(this.m, uri, e, this.a);
        }
    }

    @Override // defpackage.afhg
    public final java.lang.String d() {
        return this.a;
    }

    public final defpackage.ajcq f(defpackage.ajcq ajcqVar) {
        defpackage.ajcq ajcqVarC;
        defpackage.afgk afgkVar = this.j;
        java.lang.Integer num = (java.lang.Integer) ((defpackage.ahzm) afgkVar.f).a;
        if (num.intValue() < 0) {
            ajcqVarC = defpackage.ajcm.a;
        } else {
            defpackage.ajcq ajcqVar2 = this.b;
            defpackage.ajat ajatVar = afgkVar.c;
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            defpackage.ajcq ajcqVarG = defpackage.ajan.g(ajcqVar2, ajatVar, ajbmVar);
            ajcqVarC = defpackage.aiql.ab(ajcqVar2, ajcqVarG).c(new afgf(afgkVar, ajcqVar2, ajcqVarG, num, 0), ajbmVar);
        }
        return defpackage.ajan.g(ajcqVarC, defpackage.ahqx.c(new adot(this, ajcqVar, 8)), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.afhg
    public final defpackage.ajcq g(defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        return this.l.e(defpackage.ahqx.b(new defpackage.vto(this, ajatVar, executor, 11)), this.c);
    }

    @Override // defpackage.afhg
    public final defpackage.ajcq h() {
        synchronized (this.g) {
            java.lang.Object obj = this.h;
            if (obj == null) {
                return defpackage.aiql.A(this.n.e(defpackage.ahqx.b(new defpackage.nya(this, 11)), this.c));
            }
            return defpackage.aiql.z(obj);
        }
    }

    public final java.lang.Object i(android.net.Uri uri) throws java.io.IOException {
        java.lang.Object objC;
        java.io.Closeable closeableJ;
        synchronized (this.g) {
            objC = this.h;
            if (objC == null) {
                try {
                    closeableJ = j(uri);
                } catch (java.io.FileNotFoundException unused) {
                    java.lang.Object objC2 = c(uri);
                    synchronized (this.g) {
                        if (this.i) {
                            objC2 = null;
                        } else {
                            this.h = objC2;
                        }
                        objC = objC2;
                        if (objC == null) {
                            closeableJ = j(uri);
                        }
                        return objC;
                    }
                }
                try {
                    objC = c(uri);
                    synchronized (this.g) {
                        try {
                            if (closeableJ != null) {
                                this.h = objC;
                                closeableJ.close();
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    if (closeableJ != null) {
                        try {
                            closeableJ.close();
                        } catch (java.lang.Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
        return objC;
    }
}

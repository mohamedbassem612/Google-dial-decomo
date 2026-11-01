package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afhc implements defpackage.afhg {
    public final defpackage.ajcq a;
    public final java.util.concurrent.Executor b;
    public final defpackage.ahyn c;
    public final defpackage.aogc f;
    private final java.lang.String g;
    private final defpackage.ahny h;
    private final defpackage.afhk i;
    public final java.lang.Object d = new java.lang.Object();
    private final defpackage.ajwr j = new defpackage.ajwr();
    public defpackage.ajcq e = null;

    public afhc(java.lang.String str, defpackage.ajcq ajcqVar, defpackage.afhk afhkVar, java.util.concurrent.Executor executor, defpackage.aogc aogcVar, defpackage.ahyn ahynVar, defpackage.ahny ahnyVar) {
        this.g = str;
        this.a = defpackage.aiql.A(ajcqVar);
        this.i = afhkVar;
        this.b = new defpackage.ajdc(executor);
        this.f = aogcVar;
        this.c = ahynVar;
        this.h = ahnyVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x001d, B:12:0x001f, B:14:0x0023, B:15:0x0044), top: B:21:0x0003, inners: #1 }] */
    private final defpackage.ajcq e() {
        defpackage.ajcq ajcqVarA;
        synchronized (this.d) {
            defpackage.ajcq ajcqVar = this.e;
            if (ajcqVar == null || !ajcqVar.isDone()) {
                ajcqVarA = this.e;
                if (ajcqVarA == null) {
                    defpackage.ajwr ajwrVar = this.j;
                    defpackage.nya nyaVar = new defpackage.nya(this, 13);
                    long j = defpackage.ahqx.a;
                    ajcqVarA = defpackage.aiql.A(ajwrVar.e(new defpackage.ahqt(defpackage.ahns.c(false), nyaVar, 0), this.b));
                    this.e = ajcqVarA;
                }
            } else {
                try {
                    defpackage.ajcq ajcqVar2 = this.e;
                    defpackage.ahvr.cc(ajcqVar2.isDone(), "Future was expected to be done: %s", ajcqVar2);
                    defpackage.a.h(ajcqVar2);
                } catch (java.util.concurrent.ExecutionException unused) {
                    this.e = null;
                }
                ajcqVarA = this.e;
                if (ajcqVarA == null) {
                    defpackage.ajwr ajwrVar2 = this.j;
                    defpackage.nya nyaVar2 = new defpackage.nya(this, 13);
                    long j2 = defpackage.ahqx.a;
                    ajcqVarA = defpackage.aiql.A(ajwrVar2.e(new defpackage.ahqt(defpackage.ahns.c(false), nyaVar2, 0), this.b));
                    this.e = ajcqVarA;
                }
            }
            throw th;
        }
        return ajcqVarA;
    }

    @Override // defpackage.afhg
    public final defpackage.ajas a() {
        return new defpackage.nya(this, 12);
    }

    public final java.lang.Object b(android.net.Uri uri) {
        try {
            try {
                defpackage.ahoq ahoqVarB = this.h.b("Read " + this.g);
                try {
                    java.io.InputStream inputStream = (java.io.InputStream) this.f.M(uri, new defpackage.affr());
                    try {
                        defpackage.albh albhVarA = this.i.a(inputStream);
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
            } catch (java.io.IOException e) {
                throw defpackage.aehj.cx(this.f, uri, e, this.g);
            }
        } catch (java.io.FileNotFoundException e2) {
            if (this.f.R(uri)) {
                throw e2;
            }
            return this.i.a;
        }
    }

    public final void c(android.net.Uri uri, java.lang.Object obj) {
        android.net.Uri uriAf = defpackage.agab.af(uri, ".tmp");
        try {
            defpackage.ahoq ahoqVarB = this.h.b("Write " + this.g);
            try {
                defpackage.ajiu ajiuVar = new defpackage.ajiu((char[]) null);
                try {
                    defpackage.aogc aogcVar = this.f;
                    defpackage.afft afftVar = new defpackage.afft();
                    afftVar.a = new defpackage.ajiu[]{ajiuVar};
                    java.io.OutputStream outputStream = (java.io.OutputStream) aogcVar.M(uriAf, afftVar);
                    try {
                        ((defpackage.albh) obj).h(outputStream);
                        ajiuVar.e();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        ahoqVarB.close();
                        this.f.Q(uriAf, uri);
                    } catch (java.lang.Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    throw defpackage.aehj.cx(this.f, uri, e, this.g);
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahoqVarB.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.io.IOException e2) {
            defpackage.aogc aogcVar2 = this.f;
            if (aogcVar2.R(uriAf)) {
                try {
                    aogcVar2.P(uriAf);
                } catch (java.io.IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.afhg
    public final java.lang.String d() {
        return this.g;
    }

    @Override // defpackage.afhg
    public final defpackage.ajcq g(defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        defpackage.adlp adlpVar = new defpackage.adlp(this, e(), ajatVar, executor, 2);
        long j = defpackage.ahqx.a;
        return this.j.e(new defpackage.ahqt(defpackage.ahns.c(false), adlpVar, 0), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.afhg
    public final defpackage.ajcq h() {
        return e();
    }
}

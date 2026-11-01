package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apqk implements defpackage.apqb {
    final /* synthetic */ defpackage.apqm a;
    private final java.io.OutputStream b;
    private final defpackage.apqq c;

    public apqk(defpackage.apqm apqmVar) {
        this.a = apqmVar;
        this.b = apqmVar.a.getOutputStream();
        this.c = new defpackage.apqq(apqmVar.a);
    }

    @Override // defpackage.apqb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        defpackage.apqq apqqVar = this.c;
        apqqVar.d();
        defpackage.apqm apqmVar = this.a;
        try {
            try {
                int iZ = defpackage.aodc.z(apqmVar.b, 1);
                if (iZ != 0) {
                    if (iZ != 3) {
                        java.net.Socket socket = apqmVar.a;
                        if (!socket.isClosed() && !socket.isOutputShutdown()) {
                            this.b.flush();
                            try {
                                socket.shutdownOutput();
                            } catch (java.lang.UnsupportedOperationException unused) {
                                this.b.close();
                            }
                        }
                    } else {
                        apqmVar.a.close();
                    }
                    if (apqqVar.e()) {
                        throw apqqVar.c(null);
                    }
                    return;
                }
                apqqVar.e();
            } catch (java.io.IOException e) {
                if (!apqqVar.e()) {
                    throw e;
                }
                throw apqqVar.c(e);
            }
        } catch (java.lang.Throwable th) {
            apqqVar.e();
            throw th;
        }
    }

    @Override // defpackage.apqb
    public final /* synthetic */ defpackage.apqf fP() {
        return this.c;
    }

    @Override // defpackage.apqb
    public final void fQ(defpackage.apoy apoyVar, long j) throws java.io.IOException {
        defpackage.aoov.aV(apoyVar.b, 0L, j);
        while (j > 0) {
            defpackage.apqq apqqVar = this.c;
            apqqVar.g();
            defpackage.appy appyVar = apoyVar.a;
            if (appyVar == null) {
                defpackage.aooh.g();
            }
            int iMin = (int) java.lang.Math.min(j, appyVar.c - appyVar.b);
            apqqVar.d();
            try {
                try {
                    this.b.write(appyVar.a, appyVar.b, iMin);
                    if (apqqVar.e()) {
                        throw apqqVar.c(null);
                    }
                    int i = appyVar.b + iMin;
                    appyVar.b = i;
                    long j2 = iMin;
                    j -= j2;
                    apoyVar.b -= j2;
                    if (i == appyVar.c) {
                        apoyVar.a = appyVar.a();
                        defpackage.appz.b(appyVar);
                    }
                } catch (java.io.IOException e) {
                    if (!apqqVar.e()) {
                        throw e;
                    }
                    throw apqqVar.c(e);
                }
            } catch (java.lang.Throwable th) {
                apqqVar.e();
                throw th;
            }
        }
    }

    @Override // defpackage.apqb, java.io.Flushable
    public final void flush() throws java.io.IOException {
        defpackage.apqq apqqVar = this.c;
        apqqVar.d();
        try {
            try {
                this.b.flush();
                if (apqqVar.e()) {
                    throw apqqVar.c(null);
                }
            } catch (java.io.IOException e) {
                if (!apqqVar.e()) {
                    throw e;
                }
                throw apqqVar.c(e);
            }
        } catch (java.lang.Throwable th) {
            apqqVar.e();
            throw th;
        }
    }

    public final java.lang.String toString() {
        return "sink(" + this.a.a + ')';
    }
}

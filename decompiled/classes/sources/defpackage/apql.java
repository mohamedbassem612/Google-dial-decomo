package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apql implements defpackage.apqd {
    final /* synthetic */ defpackage.apqm a;
    private final java.io.InputStream b;
    private final defpackage.apqq c;

    public apql(defpackage.apqm apqmVar) {
        this.a = apqmVar;
        this.b = apqmVar.a.getInputStream();
        this.c = new defpackage.apqq(apqmVar.a);
    }

    @Override // defpackage.apqd
    public final long b(defpackage.apoy apoyVar, long j) throws java.io.IOException {
        defpackage.apqq apqqVar = this.c;
        apqqVar.g();
        defpackage.appy appyVarV = apoyVar.v(1);
        int iMin = (int) java.lang.Math.min(8192L, 8192 - appyVarV.c);
        try {
            apqqVar.d();
            try {
                try {
                    int i = this.b.read(appyVarV.a, appyVarV.c, iMin);
                    if (apqqVar.e()) {
                        throw apqqVar.c(null);
                    }
                    if (i == -1) {
                        if (appyVarV.b == appyVarV.c) {
                            apoyVar.a = appyVarV.a();
                            defpackage.appz.b(appyVarV);
                        }
                        return -1L;
                    }
                    appyVarV.c += i;
                    long j2 = i;
                    apoyVar.b += j2;
                    return j2;
                } catch (java.io.IOException e) {
                    if (apqqVar.e()) {
                        throw apqqVar.c(e);
                    }
                    throw e;
                }
            } catch (java.lang.Throwable th) {
                apqqVar.e();
                throw th;
            }
        } catch (java.lang.AssertionError e2) {
            if (apqt.a(e2)) {
                throw new java.io.IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.apqd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        defpackage.apqq apqqVar = this.c;
        apqqVar.d();
        defpackage.apqm apqmVar = this.a;
        try {
            try {
                int iZ = defpackage.aodc.z(apqmVar.b, 2);
                if (iZ != 0) {
                    if (iZ != 3) {
                        java.net.Socket socket = apqmVar.a;
                        if (!socket.isClosed() && !socket.isInputShutdown()) {
                            try {
                                socket.shutdownInput();
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

    @Override // defpackage.apqd
    public final /* synthetic */ defpackage.apqf fP() {
        return this.c;
    }

    public final java.lang.String toString() {
        return "source(" + this.a.a + ')';
    }
}

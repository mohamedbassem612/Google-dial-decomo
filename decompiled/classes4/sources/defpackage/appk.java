package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appk implements apqd {
    private final java.io.InputStream a;
    private final apqf b;

    public appk(java.io.InputStream inputStream, apqf apqfVar) {
        aooh.f(inputStream, "input");
        this.a = inputStream;
        this.b = apqfVar;
    }

    public final long b(apoy apoyVar, long j) throws java.io.IOException {
        try {
            this.b.g();
            appy appyVarV = apoyVar.v(1);
            int i = this.a.read(appyVarV.a, appyVarV.c, (int) java.lang.Math.min(j, 8192 - appyVarV.c));
            if (i == -1) {
                if (appyVarV.b == appyVarV.c) {
                    apoyVar.a = appyVarV.a();
                    appz.b(appyVarV);
                }
                return -1L;
            }
            appyVarV.c += i;
            long j2 = i;
            apoyVar.b += j2;
            return j2;
        } catch (java.lang.AssertionError e) {
            if (defpackage.apqt.a(e)) {
                throw new java.io.IOException(e);
            }
            throw e;
        }
    }

    public final void close() throws java.io.IOException {
        this.a.close();
    }

    public final apqf fP() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "source(" + this.a + ')';
    }
}

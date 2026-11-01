package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appo implements apqb {
    private final java.io.OutputStream a;
    private final apqf b;

    public appo(java.io.OutputStream outputStream, apqf apqfVar) {
        aooh.f(outputStream, "out");
        this.a = outputStream;
        this.b = apqfVar;
    }

    public final void close() throws java.io.IOException {
        this.a.close();
    }

    public final apqf fP() {
        return this.b;
    }

    public final void fQ(apoy apoyVar, long j) throws java.io.IOException {
        aoov.aV(apoyVar.b, 0L, j);
        while (j > 0) {
            this.b.g();
            appy appyVar = apoyVar.a;
            aooh.c(appyVar);
            int iMin = (int) java.lang.Math.min(j, appyVar.c - appyVar.b);
            this.a.write(appyVar.a, appyVar.b, iMin);
            int i = appyVar.b + iMin;
            appyVar.b = i;
            long j2 = iMin;
            apoyVar.b -= j2;
            j -= j2;
            if (i == appyVar.c) {
                apoyVar.a = appyVar.a();
                appz.b(appyVar);
            }
        }
    }

    public final void flush() throws java.io.IOException {
        this.a.flush();
    }

    public final java.lang.String toString() {
        return "sink(" + this.a + ')';
    }
}

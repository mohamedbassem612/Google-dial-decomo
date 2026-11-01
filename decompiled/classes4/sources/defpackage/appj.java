package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appj implements apqd {
    private final appa a;
    private final java.util.zip.Inflater b;
    private int c;
    private boolean d;

    public appj(appa appaVar, java.util.zip.Inflater inflater) {
        this.a = appaVar;
        this.b = inflater;
    }

    public final long b(apoy apoyVar, long j) throws java.io.IOException {
        do {
            long jC = c(apoyVar);
            if (jC > 0) {
                return jC;
            }
            java.util.zip.Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.B());
        throw new java.io.EOFException("source exhausted prematurely");
    }

    public final long c(apoy apoyVar) throws java.io.IOException {
        if (this.d) {
            throw new java.lang.IllegalStateException("closed");
        }
        try {
            appy appyVarV = apoyVar.v(1);
            int iMin = (int) java.lang.Math.min(8192L, 8192 - appyVarV.c);
            java.util.zip.Inflater inflater = this.b;
            if (inflater.needsInput()) {
                appx appxVar = this.a;
                if (!appxVar.B()) {
                    appy appyVar = appxVar.b.a;
                    aooh.c(appyVar);
                    int i = appyVar.c;
                    int i2 = appyVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(appyVar.a, i2, i3);
                }
            }
            int iInflate = inflater.inflate(appyVarV.a, appyVarV.c, iMin);
            int i4 = this.c;
            if (i4 != 0) {
                int remaining = i4 - inflater.getRemaining();
                this.c -= remaining;
                this.a.A(remaining);
            }
            if (iInflate > 0) {
                appyVarV.c += iInflate;
                long j = iInflate;
                apoyVar.b += j;
                return j;
            }
            if (appyVarV.b == appyVarV.c) {
                apoyVar.a = appyVarV.a();
                appz.b(appyVarV);
            }
            return 0L;
        } catch (java.util.zip.DataFormatException e) {
            throw new java.io.IOException(e);
        }
    }

    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    public final apqf fP() {
        return this.a.fP();
    }
}

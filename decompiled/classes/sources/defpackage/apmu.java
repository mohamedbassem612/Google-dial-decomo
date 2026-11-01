package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmu implements defpackage.apqd {
    public int a;
    public int b;
    public int c;
    public int d;
    private final defpackage.appa e;

    public apmu(defpackage.appa appaVar) {
        this.e = appaVar;
    }

    @Override // defpackage.apqd
    public final long b(defpackage.apoy apoyVar, long j) throws java.io.IOException {
        int i;
        int iF;
        do {
            int i2 = this.c;
            defpackage.appa appaVar = this.e;
            if (i2 != 0) {
                long jB = appaVar.b(apoyVar, java.lang.Math.min(8192L, i2));
                if (jB == -1) {
                    return -1L;
                }
                this.c -= (int) jB;
                return jB;
            }
            appaVar.A(this.d);
            this.d = 0;
            if ((this.a & 4) != 0) {
                return -1L;
            }
            i = this.b;
            int iG = defpackage.apjv.g(appaVar);
            this.c = iG;
            int iD = appaVar.d() & 255;
            this.a = appaVar.d() & 255;
            java.util.logging.Logger logger = defpackage.apmv.a;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                defpackage.appb appbVar = defpackage.apmk.a;
                logger.fine(defpackage.apmk.b(true, this.b, iG, iD, this.a));
            }
            iF = appaVar.f() & Integer.MAX_VALUE;
            this.b = iF;
            if (iD != 9) {
                throw new java.io.IOException(iD + " != TYPE_CONTINUATION");
            }
        } while (iF == i);
        throw new java.io.IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.apqd
    public final defpackage.apqf fP() {
        return this.e.fP();
    }

    @Override // defpackage.apqd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkj extends defpackage.appg {
    final /* synthetic */ defpackage.apkl a;
    private final long c;
    private final boolean d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apkj(defpackage.apkl apklVar, defpackage.apqd apqdVar, long j, boolean z) {
        super(apqdVar);
        if (apqdVar == null) {
            defpackage.aooh.i("delegate");
        }
        this.a = apklVar;
        this.c = j;
        this.d = z;
        this.f = true;
        if (j == 0) {
            c(null);
        }
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [aplp, java.lang.Object] */
    @Override // defpackage.appg, defpackage.apqd
    public final long b(defpackage.apoy apoyVar, long j) throws java.io.IOException {
        if (this.h) {
            throw new java.lang.IllegalStateException("closed");
        }
        try {
            long jB = this.b.b(apoyVar, 8192L);
            if (this.f) {
                this.f = false;
                defpackage.apis apisVar = ((defpackage.apks) this.a.b).c;
            }
            if (jB == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.e + jB;
            long j3 = this.c;
            if (j3 == -1 || j2 <= j3) {
                this.e = j2;
                if (!this.a.c.k()) {
                    return jB;
                }
                c(null);
                return jB;
            }
            throw new java.net.ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (java.io.IOException e) {
            java.io.IOException iOExceptionC = c(e);
            defpackage.aooh.c(iOExceptionC);
            throw iOExceptionC;
        }
    }

    public final java.io.IOException c(java.io.IOException iOException) {
        if (this.g) {
            return iOException;
        }
        this.g = true;
        if (iOException == null && this.f) {
            this.f = false;
            defpackage.apis apisVar = ((defpackage.apks) this.a.b).c;
        }
        return this.a.g(this.d, true, false, iOException);
    }

    @Override // defpackage.appg, defpackage.apqd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.h) {
            return;
        }
        this.h = true;
        try {
            super.close();
            c(null);
        } catch (java.io.IOException e) {
            java.io.IOException iOExceptionC = c(e);
            defpackage.aooh.c(iOExceptionC);
            throw iOExceptionC;
        }
    }
}

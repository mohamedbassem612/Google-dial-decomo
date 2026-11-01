package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apki extends defpackage.appf {
    final /* synthetic */ apkl a;
    private final long c;
    private final boolean d;
    private boolean e;
    private long f;
    private boolean g;
    private boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apki(apkl apklVar, apqb apqbVar, long j, boolean z) {
        super(apqbVar);
        aooh.f(apqbVar, "delegate");
        this.a = apklVar;
        this.c = j;
        this.d = z;
        this.g = z;
    }

    private final java.io.IOException c(java.io.IOException iOException) {
        if (this.e) {
            return iOException;
        }
        this.e = true;
        return this.a.g(this.d, false, true, iOException);
    }

    @Override // defpackage.appf
    public final void close() throws java.io.IOException {
        if (this.h) {
            return;
        }
        this.h = true;
        long j = this.c;
        if (j != -1 && this.f != j) {
            throw new java.net.ProtocolException("unexpected end of stream");
        }
        try {
            this.b.close();
            c(null);
        } catch (java.io.IOException e) {
            java.io.IOException iOExceptionC = c(e);
            aooh.c(iOExceptionC);
            throw iOExceptionC;
        }
    }

    @Override // defpackage.appf
    public final void fQ(apoy apoyVar, long j) throws java.io.IOException {
        if (this.h) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j2 = this.c;
        if (j2 != -1 && this.f + j > j2) {
            throw new java.net.ProtocolException("expected " + j2 + " bytes but received " + (this.f + j));
        }
        try {
            if (this.g) {
                this.g = false;
                apis apisVar = ((apks) this.a.b).c;
            }
            super.fQ(apoyVar, j);
            this.f += j;
        } catch (java.io.IOException e) {
            java.io.IOException iOExceptionC = c(e);
            aooh.c(iOExceptionC);
            throw iOExceptionC;
        }
    }

    @Override // defpackage.appf
    public final void flush() throws java.io.IOException {
        try {
            super.flush();
        } catch (java.io.IOException e) {
            java.io.IOException iOExceptionC = c(e);
            aooh.c(iOExceptionC);
            throw iOExceptionC;
        }
    }
}

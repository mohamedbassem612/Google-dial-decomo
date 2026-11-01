package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aofo extends defpackage.anuq {
    private final apoy a;

    public aofo(apoy apoyVar) {
        this.a = apoyVar;
    }

    @Override // defpackage.anuq, defpackage.aoaw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.y();
    }

    @Override // defpackage.aoaw
    public final int e() {
        try {
            return this.a.d() & 255;
        } catch (java.io.EOFException e) {
            throw new java.lang.IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.aoaw
    public final int f() {
        return (int) this.a.b;
    }

    @Override // defpackage.aoaw
    public final defpackage.aoaw g(int i) {
        apoy apoyVar = new apoy();
        apoyVar.fQ(this.a, i);
        return new defpackage.aofo(apoyVar);
    }

    @Override // defpackage.aoaw
    public final void i(java.io.OutputStream outputStream, int i) {
        this.a.S(outputStream, i);
    }

    @Override // defpackage.aoaw
    public final void j(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iE = this.a.e(bArr, i, i2);
            if (iE == -1) {
                throw new java.lang.IndexOutOfBoundsException(a.bs(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= iE;
            i += iE;
        }
    }

    @Override // defpackage.aoaw
    public final void k(int i) {
        try {
            this.a.A(i);
        } catch (java.io.EOFException e) {
            throw new java.lang.IndexOutOfBoundsException(e.getMessage());
        }
    }
}

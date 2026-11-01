package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoaa extends java.io.OutputStream {
    public final java.util.List a;
    final /* synthetic */ defpackage.aoad b;
    private defpackage.aodu c;

    public aoaa(defpackage.aoad aoadVar) {
        j$.util.Objects.requireNonNull(aoadVar);
        this.b = aoadVar;
        this.a = new java.util.ArrayList();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            defpackage.aoad aoadVar = this.b;
            defpackage.aodu aoduVarA = aoadVar.g.a(java.lang.Math.max(4096, i2));
            this.c = aoduVarA;
            this.a.add(aoduVarA);
        }
        while (i2 > 0) {
            int iMin = java.lang.Math.min(i2, this.c.b());
            defpackage.aodu aoduVar = this.c;
            if (iMin == 0) {
                defpackage.aodu aoduVarA2 = this.b.g.a(java.lang.Math.max(i2, aoduVar.a() << 1));
                this.c = aoduVarA2;
                this.a.add(aoduVarA2);
            } else {
                aoduVar.d(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        defpackage.aodu aoduVar = this.c;
        if (aoduVar != null && aoduVar.b() > 0) {
            this.c.c(b);
        } else {
            write(new byte[]{b}, 0, 1);
        }
    }
}

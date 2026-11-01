package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoay extends defpackage.anuq {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public aoay(byte[] bArr, int i, int i2) {
        ahvr.bN((boolean) ((i ^ (-1)) >>> 31), "offset must be >= 0");
        ahvr.bN((boolean) ((i2 ^ (-1)) >>> 31), "length must be >= 0");
        int i3 = i2 + i;
        ahvr.bN(i3 <= 0, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new java.nio.InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final boolean d() {
        return true;
    }

    @Override // defpackage.aoaw
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.aoaw
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.aoaw
    public final /* bridge */ /* synthetic */ defpackage.aoaw g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new defpackage.aoay(this.c, i2, i);
    }

    @Override // defpackage.aoaw
    public final void i(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.aoaw
    public final void j(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.aoaw
    public final void k(int i) {
        a(i);
        this.a += i;
    }
}

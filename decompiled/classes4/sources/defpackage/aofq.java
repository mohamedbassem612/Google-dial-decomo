package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aofq implements defpackage.aodu {
    public final apoy a;
    private int b;
    private int c;

    public aofq(apoy apoyVar, int i) {
        this.a = apoyVar;
        this.b = i;
    }

    @Override // defpackage.aodu
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aodu
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aodu
    public final void c(byte b) {
        this.a.N(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.aodu
    public final void d(byte[] bArr, int i, int i2) {
        this.a.K(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}

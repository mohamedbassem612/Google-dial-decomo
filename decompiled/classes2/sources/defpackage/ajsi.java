package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class ajsi implements defpackage.ajfl {
    @Override // defpackage.ajfl
    public final java.io.InputStream a(java.io.InputStream inputStream, byte[] bArr) {
        return new defpackage.ajsq(this, inputStream, bArr);
    }

    @Override // defpackage.ajfl
    public final java.io.OutputStream b(java.io.OutputStream outputStream, byte[] bArr) {
        return new defpackage.ajsr(this, outputStream, bArr);
    }

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract defpackage.ajso g();

    public abstract defpackage.ajsp h(byte[] bArr);
}

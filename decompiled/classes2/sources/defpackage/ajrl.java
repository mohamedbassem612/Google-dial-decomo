package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajrl implements defpackage.ajfl {
    private final java.util.List a;
    private final defpackage.ajfl b;

    public ajrl(java.util.List list, defpackage.ajfl ajflVar) {
        this.a = list;
        this.b = ajflVar;
    }

    @Override // defpackage.ajfl
    public final java.io.InputStream a(java.io.InputStream inputStream, byte[] bArr) {
        return new defpackage.ajrk(this.a, inputStream, bArr);
    }

    @Override // defpackage.ajfl
    public final java.io.OutputStream b(java.io.OutputStream outputStream, byte[] bArr) {
        return this.b.b(outputStream, bArr);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhp implements defpackage.vha {
    private final byte[] a;

    public vhp(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.vha
    public final java.io.InputStream a() {
        return new java.io.ByteArrayInputStream(this.a);
    }

    @Override // defpackage.vha
    public final void b(android.content.Context context, java.io.OutputStream outputStream) throws java.io.IOException {
        outputStream.write(android.util.Base64.encode(this.a, 4));
        outputStream.close();
    }
}

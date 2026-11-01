package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aexo extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ akzf a;

    public aexo(aexp aexpVar, akzf akzfVar) {
        this.a = akzfVar;
        j$.util.Objects.requireNonNull(aexpVar);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0];
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
        this.a.C(i);
        return i;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.p(bArr, i, i2);
    }
}

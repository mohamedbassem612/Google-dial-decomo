package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aisi extends java.io.OutputStream {
    public final java.lang.String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        defpackage.ahvr.ci(bArr);
        defpackage.ahvr.bX(i, i2 + i, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        defpackage.ahvr.ci(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }
}

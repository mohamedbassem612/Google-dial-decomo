package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rih extends java.io.PipedOutputStream {
    private final defpackage.rig a;

    public rih(defpackage.rig rigVar) {
        super(rigVar);
        this.a = rigVar;
    }

    @Override // java.io.PipedOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || bArr.length - i < i2) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        this.a.a(bArr, i, i2);
    }
}

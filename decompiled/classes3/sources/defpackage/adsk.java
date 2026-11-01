package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adsk extends android.media.MediaDataSource {
    private final byte[] a;

    public adsk(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.a.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.a;
        long length = bArr2.length;
        if (j >= length) {
            return -1;
        }
        if (((long) i2) + j > length) {
            i2 = (int) (length - j);
        }
        java.lang.System.arraycopy(bArr2, (int) j, bArr, i, i2);
        return i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

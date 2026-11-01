package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ekl extends android.media.MediaDataSource {
    long a;
    final /* synthetic */ defpackage.ekm b;

    public ekl(defpackage.ekm ekmVar) {
        this.b = ekmVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) this.b.available())) {
                        this.b.c(j);
                        this.a = j;
                    }
                }
                defpackage.ekm ekmVar = this.b;
                if (i2 > ekmVar.available()) {
                    i2 = ekmVar.available();
                }
                int i3 = ekmVar.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.a += (long) i3;
                    return i3;
                }
            } catch (java.io.IOException unused) {
            }
            this.a = -1L;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

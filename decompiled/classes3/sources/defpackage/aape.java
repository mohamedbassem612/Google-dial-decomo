package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aape extends java.io.FileOutputStream implements afez, afem {
    private final android.os.ParcelFileDescriptor a;

    public aape(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    public final java.nio.channels.FileChannel a() {
        return getChannel();
    }

    public final void b() throws java.io.SyncFailedException {
        getFD().sync();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}

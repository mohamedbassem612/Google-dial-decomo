package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajrk extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private boolean a = false;
    private java.io.InputStream b = null;
    private final java.io.InputStream c;
    private final java.util.List d;
    private final byte[] e;

    public ajrk(java.util.List list, java.io.InputStream inputStream, byte[] bArr) {
        this.d = list;
        if (inputStream.markSupported()) {
            this.c = inputStream;
        } else {
            this.c = new java.io.BufferedInputStream(inputStream);
        }
        this.c.mark(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        this.e = (byte[]) bArr.clone();
    }

    @Override // java.io.InputStream
    public final synchronized int available() {
        java.io.InputStream inputStream = this.b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (i2 != 0) {
            java.io.InputStream inputStream = this.b;
            if (inputStream == null) {
                if (this.a) {
                    throw new java.io.IOException("No matching key found for the ciphertext in the stream.");
                }
                this.a = true;
                for (defpackage.ajfl ajflVar : this.d) {
                    try {
                        java.io.InputStream inputStream2 = this.c;
                        java.io.InputStream inputStreamA = ajflVar.a(inputStream2, this.e);
                        int i4 = inputStreamA.read(bArr, i, i2);
                        if (i4 == 0) {
                            throw new java.io.IOException("Could not read bytes from the ciphertext stream");
                        }
                        this.b = inputStreamA;
                        inputStream2.mark(0);
                        return i4;
                    } catch (java.io.IOException | java.security.GeneralSecurityException unused) {
                        this.c.reset();
                    }
                }
                throw new java.io.IOException("No matching key found for the ciphertext in the stream.");
            }
            i3 = inputStream.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}

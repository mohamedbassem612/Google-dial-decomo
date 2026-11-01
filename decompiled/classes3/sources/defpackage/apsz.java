package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apsz extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private java.io.PushbackInputStream a;
    private int b = 0;
    private int c;

    public apsz(java.io.InputStream inputStream) {
        this.a = null;
        this.c = 3;
        this.a = new java.io.PushbackInputStream(inputStream, 2);
        this.c = 3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.close();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        int i = this.a.read();
        if (i == -1) {
            return -1;
        }
        int i2 = this.c;
        if ((i2 & 1) == 0 || i != 13) {
            if ((i2 & 2) != 0 && i == 10 && this.b != 13) {
                this.a.unread(10);
            }
            this.b = i;
            return i;
        }
        int i3 = this.a.read();
        if (i3 != -1) {
            this.a.unread(i3);
            if (i3 != 10) {
                this.a.unread(10);
            }
        } else {
            this.a.unread(10);
        }
        i = 13;
        this.b = i;
        return i;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }
}

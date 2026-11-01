package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xtf implements java.io.Closeable {
    public final java.nio.charset.Charset a;
    public int b;
    private final java.io.InputStream c;
    private byte[] d;
    private int e;

    public xtf(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        charset.getClass();
        if (!charset.equals(defpackage.xtg.a)) {
            throw new java.lang.IllegalArgumentException("Unsupported encoding");
        }
        this.c = inputStream;
        this.a = charset;
        this.d = new byte[8192];
    }

    private final void b() throws java.io.IOException {
        byte[] bArr = this.d;
        int length = bArr.length;
        int i = this.c.read(bArr, 0, 8192);
        if (i == -1) {
            throw new java.io.EOFException();
        }
        this.e = 0;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    final java.lang.String a() {
        int i;
        byte[] bArr;
        java.lang.String string;
        int i2;
        synchronized (this.c) {
            if (this.d == null) {
                throw new java.io.IOException("LineReader is closed");
            }
            if (this.e >= this.b) {
                b();
            }
            for (int i3 = this.e; i3 != this.b; i3++) {
                byte[] bArr2 = this.d;
                if (bArr2[i3] == 10) {
                    int i4 = this.e;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    string = new java.lang.String(bArr2, i4, i2 - i4, this.a.name());
                    this.e = i3 + 1;
                }
            }
            defpackage.xte xteVar = new defpackage.xte(this, (this.b - this.e) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.d;
                int i5 = this.e;
                xteVar.write(bArr3, i5, this.b - i5);
                this.b = -1;
                b();
                i = this.e;
                while (i != this.b) {
                    bArr = this.d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.e;
            if (i != i6) {
                xteVar.write(bArr, i6, i - i6);
            }
            this.e = i + 1;
            string = xteVar.toString();
        }
        return string;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.io.InputStream inputStream = this.c;
        synchronized (inputStream) {
            if (this.d != null) {
                this.d = null;
                inputStream.close();
            }
        }
    }
}

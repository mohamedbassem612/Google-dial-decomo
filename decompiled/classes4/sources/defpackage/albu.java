package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class albu extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ defpackage.albv a;
    private defpackage.albt b;
    private akyz c;
    private int d;
    private int e;
    private int f;
    private int g;

    public albu(defpackage.albv albvVar) {
        j$.util.Objects.requireNonNull(albvVar);
        this.a = albvVar;
        d();
    }

    private final int a() {
        return this.a.b - (this.f + this.e);
    }

    private final int b(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            c();
            if (this.c == null) {
                break;
            }
            int iMin = java.lang.Math.min(this.d - this.e, i3);
            if (bArr != null) {
                this.c.B(bArr, this.e, i, iMin);
                i += iMin;
            }
            this.e += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    private final void c() {
        if (this.c != null) {
            int i = this.e;
            int i2 = this.d;
            if (i == i2) {
                this.f += i2;
                int iC = 0;
                this.e = 0;
                if (this.b.hasNext()) {
                    akyz next = this.b.next();
                    this.c = next;
                    iC = next.c();
                } else {
                    this.c = null;
                }
                this.d = iC;
            }
        }
    }

    private final void d() {
        defpackage.albt albtVar = new defpackage.albt(this.a);
        this.b = albtVar;
        akyz next = albtVar.next();
        this.c = next;
        this.d = next.c();
        this.e = 0;
        this.f = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return a();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.g = this.f + this.e;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int iB = b(bArr, i, i2);
        if (iB == 0) {
            return (i2 > 0 || a() == 0) ? -1 : 0;
        }
        return iB;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        d();
        b(null, 0, this.g);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return b(null, 0, (int) j);
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        c();
        akyz akyzVar = this.c;
        if (akyzVar == null) {
            return -1;
        }
        int i = this.e;
        this.e = i + 1;
        return akyzVar.a(i) & 255;
    }
}

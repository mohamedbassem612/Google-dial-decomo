package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amms implements java.io.Closeable {
    private final byte[] a;
    private int b;
    private int c;

    public amms(java.lang.String str) {
        this.a = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public final synchronized int a(byte[] bArr, int i, int i2) {
        ahvr.bN(65536 - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        byte[] bArr2 = this.a;
        int length = bArr2.length;
        if (i3 == length) {
            return 0;
        }
        int iMin = java.lang.Math.min(i2, length - i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            int i5 = this.b;
            bArr[i + i4] = bArr2[i5];
            this.b = i5 + 1;
        }
        return iMin;
    }

    public final synchronized long b() {
        return this.c;
    }

    public final synchronized long c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    public final synchronized long d() {
        return this.a.length;
    }

    public final synchronized void e() {
        this.c = this.b;
    }

    public final synchronized void f() {
        this.b = this.c;
    }

    public final synchronized boolean g() {
        return this.b < this.a.length;
    }

    public final synchronized void h() {
    }

    public final synchronized void i(long j) {
        this.b = (int) (((long) this.b) + java.lang.Math.min(j, this.a.length - this.b));
    }

    public amms(byte[] bArr) {
        this.a = bArr;
    }
}

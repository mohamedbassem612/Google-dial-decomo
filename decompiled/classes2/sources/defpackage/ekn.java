package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ekn extends java.io.FilterOutputStream {
    final java.io.DataOutputStream a;
    public java.nio.ByteOrder b;

    public ekn(java.io.OutputStream outputStream, java.nio.ByteOrder byteOrder) {
        super(outputStream);
        this.a = new java.io.DataOutputStream(outputStream);
        this.b = byteOrder;
    }

    public final void a(int i) throws java.io.IOException {
        this.a.write(i);
    }

    public final void b(int i) throws java.io.IOException {
        if (this.b == java.nio.ByteOrder.LITTLE_ENDIAN) {
            java.io.DataOutputStream dataOutputStream = this.a;
            dataOutputStream.write(i & 255);
            dataOutputStream.write((i >>> 8) & 255);
            dataOutputStream.write((i >>> 16) & 255);
            dataOutputStream.write(i >>> 24);
            return;
        }
        if (this.b == java.nio.ByteOrder.BIG_ENDIAN) {
            java.io.DataOutputStream dataOutputStream2 = this.a;
            dataOutputStream2.write(i >>> 24);
            dataOutputStream2.write((i >>> 16) & 255);
            dataOutputStream2.write((i >>> 8) & 255);
            dataOutputStream2.write(i & 255);
        }
    }

    public final void c(short s) throws java.io.IOException {
        if (this.b == java.nio.ByteOrder.LITTLE_ENDIAN) {
            java.io.DataOutputStream dataOutputStream = this.a;
            dataOutputStream.write(s & 255);
            dataOutputStream.write((s >>> 8) & 255);
            return;
        }
        if (this.b == java.nio.ByteOrder.BIG_ENDIAN) {
            java.io.DataOutputStream dataOutputStream2 = this.a;
            dataOutputStream2.write((s >>> 8) & 255);
            dataOutputStream2.write(s & 255);
        }
    }

    public final void d(long j) throws java.io.IOException {
        b((int) j);
    }

    public final void e(int i) throws java.io.IOException {
        if (i > 65535) {
            throw new java.lang.IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        c((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.a.write(bArr, i, i2);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ekm extends java.io.InputStream implements java.io.DataInput, j$.io.InputStreamRetargetInterface {
    protected final java.io.DataInputStream a;
    protected int b;
    public java.nio.ByteOrder c;
    public int d;
    private byte[] e;

    public ekm(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        this.a = dataInputStream;
        dataInputStream.mark(0);
        this.b = 0;
        this.c = byteOrder;
        this.d = inputStream instanceof defpackage.ekm ? ((defpackage.ekm) inputStream).d : -1;
    }

    public final long a() {
        return ((long) readInt()) & 4294967295L;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    public final void b(int i) throws java.io.IOException {
        int i2 = 0;
        while (i2 < i) {
            java.io.DataInputStream dataInputStream = this.a;
            int i3 = i - i2;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.e == null) {
                    this.e = new byte[8192];
                }
                iSkip = dataInputStream.read(this.e, 0, java.lang.Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new java.io.EOFException(a.bs(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.b += i2;
    }

    public final void c(long j) throws java.io.IOException {
        long j2 = this.b;
        if (j2 > j) {
            this.b = 0;
            this.a.reset();
        } else {
            j -= j2;
        }
        b((int) j);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new java.lang.UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.b++;
        return this.a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.b++;
        return this.a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws java.io.EOFException {
        this.b++;
        int i = this.a.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.b += 2;
        return this.a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws java.io.IOException {
        this.b += bArr.length;
        this.a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws java.io.IOException {
        this.b += 4;
        java.io.DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new java.io.EOFException();
        }
        if (this.c == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (this.c == java.nio.ByteOrder.BIG_ENDIAN) {
            return i4 + (i << 24) + (i2 << 16) + (i3 << 8);
        }
        java.nio.ByteOrder byteOrder = this.c;
        java.util.Objects.toString(byteOrder);
        throw new java.io.IOException("Invalid byte order: ".concat(java.lang.String.valueOf(byteOrder)));
    }

    @Override // java.io.DataInput
    public final java.lang.String readLine() {
        android.util.Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws java.io.IOException {
        this.b += 8;
        java.io.DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new java.io.EOFException();
        }
        if (this.c == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (this.c != java.nio.ByteOrder.BIG_ENDIAN) {
            java.nio.ByteOrder byteOrder = this.c;
            java.util.Objects.toString(byteOrder);
            throw new java.io.IOException("Invalid byte order: ".concat(java.lang.String.valueOf(byteOrder)));
        }
        return ((long) i8) + (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8);
    }

    @Override // java.io.DataInput
    public final short readShort() throws java.io.IOException {
        this.b += 2;
        java.io.DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new java.io.EOFException();
        }
        if (this.c == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (this.c == java.nio.ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        java.nio.ByteOrder byteOrder = this.c;
        java.util.Objects.toString(byteOrder);
        throw new java.io.IOException("Invalid byte order: ".concat(java.lang.String.valueOf(byteOrder)));
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() {
        this.b += 2;
        return this.a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.b++;
        return this.a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws java.io.IOException {
        this.b += 2;
        java.io.DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new java.io.EOFException();
        }
        if (this.c == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (this.c == java.nio.ByteOrder.BIG_ENDIAN) {
            return i2 + (i << 8);
        }
        java.nio.ByteOrder byteOrder = this.c;
        java.util.Objects.toString(byteOrder);
        throw new java.io.IOException("Invalid byte order: ".concat(java.lang.String.valueOf(byteOrder)));
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new java.lang.UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new java.lang.UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.b += i2;
        this.a.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.a.read(bArr, i, i2);
        this.b += i3;
        return i3;
    }

    public ekm(java.io.InputStream inputStream) {
        this(inputStream, java.nio.ByteOrder.BIG_ENDIAN);
    }

    public ekm(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr), java.nio.ByteOrder.BIG_ENDIAN);
        this.d = bArr.length;
    }

    public ekm(java.io.InputStream inputStream, byte[] bArr) {
        this(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }

    public ekm(byte[] bArr, byte[] bArr2) {
        this(bArr);
        this.a.mark(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    }
}

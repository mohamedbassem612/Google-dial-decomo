package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ansl extends java.io.InputStream implements j$.io.InputStreamRetargetInterface, defpackage.annz, defpackage.anmz {
    private byte[][] a;
    private byte[] b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public ansl(byte[] bArr) {
        this.a = null;
        int length = bArr.length;
        this.b = length <= 0 ? null : bArr;
        this.e = length;
    }

    private final void b() {
        int i;
        this.c++;
        this.d = 0;
        while (true) {
            byte[][] bArr = this.a;
            if (bArr == null || (i = this.c) >= bArr.length || this.e <= 0) {
                break;
            }
            byte[] bArr2 = bArr[i];
            if (bArr2.length > 0) {
                this.b = bArr2;
                return;
            }
            this.c = i + 1;
        }
        this.b = null;
    }

    @Override // defpackage.anmz
    public final int a(java.io.OutputStream outputStream) {
        throw null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        byte[][] bArr = this.a;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                defpackage.ansm.a(bArr2);
            }
        } else {
            byte[] bArr3 = this.b;
            if (bArr3 != null) {
                defpackage.ansm.a(bArr3);
            }
        }
        this.b = null;
        this.a = null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ahvr.bX(i, i + i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        int i3 = i2;
        while (true) {
            byte[] bArr2 = this.b;
            if (bArr2 == null) {
                break;
            }
            int[] iArr = {i3, bArr2.length - this.d, this.e};
            int i4 = iArr[0];
            for (int i5 = 1; i5 < 3; i5++) {
                int i6 = iArr[i5];
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            java.lang.System.arraycopy(this.b, this.d, bArr, i, i4);
            i += i4;
            i3 -= i4;
            int i7 = this.e - i4;
            this.e = i7;
            if (i3 == 0) {
                int i8 = this.d + i4;
                this.d = i8;
                if (i8 != this.b.length && i7 != 0) {
                    break;
                }
                b();
                break;
            }
            b();
        }
        int i9 = i2 - i3;
        if (i9 <= 0) {
            return -1;
        }
        return i9;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    public ansl(byte[][] bArr, int i) {
        this.a = bArr;
        this.e = i;
        this.c = -1;
        b();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return -1;
        }
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        int i3 = bArr[i] & 255;
        int i4 = this.e - 1;
        this.e = i4;
        if (i2 == bArr.length || i4 == 0) {
            b();
        }
        return i3;
    }
}

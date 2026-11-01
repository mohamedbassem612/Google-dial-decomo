package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtk {
    public int a;
    public final java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public xtk(byte[] bArr) {
        this.b = new java.lang.Object();
        this.c = null;
        this.d = null;
        this.a = 0;
    }

    public final int a() {
        try {
            return ((java.nio.ByteBuffer) this.c).get() & 255;
        } catch (java.lang.Exception unused) {
            ((defpackage.xtj) this.d).b = 1;
            return 0;
        }
    }

    public final int b() {
        return ((java.nio.ByteBuffer) this.c).getShort();
    }

    public final void c() {
        int iA = a();
        this.a = iA;
        if (iA <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.a;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                ((java.nio.ByteBuffer) this.c).get((byte[]) this.b, i, i2);
                i += i2;
            } catch (java.lang.Exception e) {
                if (android.util.Log.isLoggable("GifHeaderParser", 3)) {
                    android.util.Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.a, e);
                }
                ((defpackage.xtj) this.d).b = 1;
                return;
            }
        }
    }

    public final void d() {
        int iA;
        do {
            iA = a();
            ((java.nio.ByteBuffer) this.c).position(java.lang.Math.min(((java.nio.ByteBuffer) this.c).position() + iA, ((java.nio.ByteBuffer) this.c).limit()));
        } while (iA > 0);
    }

    public final boolean e() {
        return ((defpackage.xtj) this.d).b != 0;
    }

    public final int[] f(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            ((java.nio.ByteBuffer) this.c).get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = bArr[i3] & 255;
                    int i6 = i3 + 2;
                    i3 += 3;
                    int i7 = i2 + 1;
                    iArr[i2] = (i5 << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i6] & 255);
                    i2 = i7;
                } catch (java.nio.BufferUnderflowException e) {
                    e = e;
                    if (android.util.Log.isLoggable("GifHeaderParser", 3)) {
                        android.util.Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
                    }
                    ((defpackage.xtj) this.d).b = 1;
                    return iArr;
                }
            }
            return iArr;
        } catch (java.nio.BufferUnderflowException e2) {
            e = e2;
            iArr = null;
        }
    }

    public final void g() {
        java.lang.Object obj;
        synchronized (this.b) {
            ahvr.bY(this.a > 0);
            int i = this.a - 1;
            this.a = i;
            if (i == 0 && (obj = this.d) != null) {
                ((android.os.HandlerThread) obj).quit();
                this.d = null;
                this.c = null;
            }
        }
    }

    public xtk() {
        this.b = new byte[256];
        this.a = 0;
    }
}

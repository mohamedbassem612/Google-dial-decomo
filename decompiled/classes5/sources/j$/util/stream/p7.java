package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class p7 extends j$.util.stream.c implements java.lang.Iterable, j$.lang.a {
    public java.lang.Object e;
    public java.lang.Object[] f;

    public p7(int i) {
        super(i);
        this.e = newArray(1 << this.a);
    }

    public final void A() {
        long jU;
        if (this.b == u(this.e)) {
            java.lang.Object[] objArrY = this.f;
            if (objArrY == null) {
                objArrY = y();
                this.f = objArrY;
                this.d = new long[8];
                objArrY[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            if (i2 >= objArrY.length || objArrY[i2] == null) {
                if (i == 0) {
                    jU = u(this.e);
                } else {
                    jU = ((long) u(objArrY[i])) + this.d[i];
                }
                x(jU + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    public java.lang.Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        java.lang.Object objNewArray = newArray((int) jCount);
        c(0, objNewArray);
        return objNewArray;
    }

    public void c(int i, java.lang.Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > u(obj) || jCount < j) {
            throw new java.lang.IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            java.lang.System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            java.lang.Object obj2 = this.f[i2];
            java.lang.System.arraycopy(obj2, 0, obj, i, u(obj2));
            i += u(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            java.lang.System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        java.lang.Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void d(java.lang.Object obj) {
        for (int i = 0; i < this.c; i++) {
            java.lang.Object obj2 = this.f[i];
            s(obj2, 0, u(obj2), obj);
        }
        s(this.e, 0, this.b, obj);
    }

    public java.lang.Object newArray(int i) {
        return new double[i];
    }

    public abstract void s(java.lang.Object obj, int i, int i2, java.lang.Object obj2);

    public int u(java.lang.Object obj) {
        return ((double[]) obj).length;
    }

    public final int w(long j) {
        int i = 0;
        if (this.c != 0) {
            if (j >= count()) {
                throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
            }
            while (i <= this.c) {
                if (j >= this.d[i] + ((long) u(this.f[i]))) {
                    i++;
                }
            }
            throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
        }
        if (j >= this.b) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j));
        }
        return i;
    }

    public final void x(long j) {
        long jU;
        int i = this.c;
        if (i == 0) {
            jU = u(this.e);
        } else {
            jU = ((long) u(this.f[i])) + this.d[i];
        }
        if (j > jU) {
            if (this.f == null) {
                java.lang.Object[] objArrY = y();
                this.f = objArrY;
                this.d = new long[8];
                objArrY[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > jU) {
                java.lang.Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length << 1;
                    this.f = java.util.Arrays.copyOf(objArr, length);
                    this.d = java.util.Arrays.copyOf(this.d, length);
                }
                int iMin = this.a;
                if (i2 != 0 && i2 != 1) {
                    iMin = java.lang.Math.min((iMin + i2) - 1, 30);
                }
                int i3 = 1 << iMin;
                this.f[i2] = newArray(i3);
                long[] jArr = this.d;
                int i4 = i2 - 1;
                jArr[i2] = jArr[i4] + ((long) u(this.f[i4]));
                jU += (long) i3;
                i2++;
            }
        }
    }

    public java.lang.Object[] y() {
        return new double[8][];
    }

    public p7() {
        this.e = newArray(16);
    }
}

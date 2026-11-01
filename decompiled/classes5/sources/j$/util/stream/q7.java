package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class q7 extends j$.util.stream.c implements java.util.function.Consumer, java.lang.Iterable, j$.lang.a {
    public java.lang.Object[] e = new java.lang.Object[1 << 4];
    public java.lang.Object[][] f;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        long length;
        int i = this.b;
        java.lang.Object[] objArr = this.e;
        if (i == objArr.length) {
            java.lang.Object[][] objArr2 = this.f;
            if (objArr2 == null) {
                java.lang.Object[][] objArr3 = new java.lang.Object[8][];
                this.f = objArr3;
                this.d = new long[8];
                objArr3[0] = objArr;
                objArr2 = objArr3;
            }
            int i2 = this.c;
            int i3 = i2 + 1;
            if (i3 >= objArr2.length || objArr2[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = ((long) objArr2[i2].length) + this.d[i2];
                }
                s(length + 1);
            }
            this.b = 0;
            int i4 = this.c + 1;
            this.c = i4;
            objArr = this.f[i4];
            this.e = objArr;
            i = 0;
        }
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c
    public final void clear() {
        java.lang.Object[][] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            int i = 0;
            while (true) {
                java.lang.Object[] objArr2 = this.e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f = null;
            this.d = null;
        } else {
            for (int i2 = 0; i2 < this.b; i2++) {
                this.e[i2] = null;
            }
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        for (int i = 0; i < this.c; i++) {
            for (java.lang.Object obj : this.f[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            consumer.accept(this.e[i2]);
        }
    }

    public final void h(java.lang.Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new java.lang.IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            java.lang.System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            java.lang.Object[] objArr2 = this.f[i2];
            java.lang.System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            java.lang.System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        j$.util.Spliterator spliterator = spliterator();
        j$.util.Objects.requireNonNull(spliterator);
        return new j$.util.z0(spliterator);
    }

    public final java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) jCount);
        h(objArr, 0);
        return objArr;
    }

    public final void s(long j) {
        int i = this.c;
        long length = i == 0 ? this.e.length : this.d[i] + ((long) this.f[i].length);
        if (j > length) {
            if (this.f == null) {
                java.lang.Object[][] objArr = new java.lang.Object[8][];
                this.f = objArr;
                this.d = new long[8];
                objArr[0] = this.e;
            }
            int i2 = i + 1;
            while (j > length) {
                java.lang.Object[][] objArr2 = this.f;
                if (i2 >= objArr2.length) {
                    int length2 = objArr2.length << 1;
                    this.f = (java.lang.Object[][]) java.util.Arrays.copyOf(objArr2, length2);
                    this.d = java.util.Arrays.copyOf(this.d, length2);
                }
                int iMin = this.a;
                if (i2 != 0 && i2 != 1) {
                    iMin = java.lang.Math.min((iMin + i2) - 1, 30);
                }
                int i3 = 1 << iMin;
                java.lang.Object[][] objArr3 = this.f;
                objArr3[i2] = new java.lang.Object[i3];
                long[] jArr = this.d;
                int i4 = i2 - 1;
                jArr[i2] = jArr[i4] + ((long) objArr3[i4].length);
                length += (long) i3;
                i2++;
            }
        }
    }

    public j$.util.Spliterator spliterator() {
        return new j$.util.stream.h7(this, 0, this.c, 0, this.b);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        j$.util.Objects.requireNonNull(arrayList);
        forEach(new j$.desugar.sun.nio.fs.g((byte) 12, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}

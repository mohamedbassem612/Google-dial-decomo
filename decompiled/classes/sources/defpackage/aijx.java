package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aijx {
    transient java.lang.Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;

    public aijx(defpackage.aijx aijxVar) {
        o(aijxVar.c);
        int iA = aijxVar.a();
        while (iA != -1) {
            f(aijxVar.i(iA), aijxVar.c(iA));
            iA = aijxVar.e(iA);
        }
    }

    private static int q(long j) {
        return (int) (j >>> 32);
    }

    private final int r() {
        return this.e.length - 1;
    }

    private final int s(java.lang.Object obj, int i) {
        int iR = r() & i;
        int i2 = this.e[iR];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (q(this.f[i2]) == i && j$.util.Objects.equals(obj, this.a[i2])) {
                    int i4 = this.b[i2];
                    if (i3 == -1) {
                        this.e[iR] = (int) this.f[i2];
                    } else {
                        long[] jArr = this.f;
                        jArr[i3] = t(jArr[i3], (int) jArr[i2]);
                    }
                    l(i2);
                    this.c--;
                    this.d++;
                    return i4;
                }
                int i5 = (int) this.f[i2];
                if (i5 != -1) {
                    i3 = i2;
                    i2 = i5;
                }
            }
        }
        return 0;
    }

    private static long t(long j, int i) {
        return (j & (-4294967296L)) | (((long) i) & 4294967295L);
    }

    private final void u(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        float f = i * this.g;
        int[] iArr = new int[i];
        java.util.Arrays.fill(iArr, -1);
        long[] jArr = this.f;
        for (int i2 = 0; i2 < this.c; i2++) {
            int iQ = q(jArr[i2]);
            int i3 = (i - 1) & iQ;
            int i4 = iArr[i3];
            iArr[i3] = i2;
            jArr[i2] = (((long) iQ) << 32) | (((long) i4) & 4294967295L);
        }
        this.h = ((int) f) + 1;
        this.e = iArr;
    }

    public int a() {
        return this.c == 0 ? -1 : 0;
    }

    public final int b(java.lang.Object obj) {
        int iD = d(obj);
        if (iD == -1) {
            return 0;
        }
        return this.b[iD];
    }

    final int c(int i) {
        defpackage.ahvr.ch(i, this.c);
        return this.b[i];
    }

    final int d(java.lang.Object obj) {
        int iBz = defpackage.ahvr.bz(obj);
        int i = this.e[r() & iBz];
        while (i != -1) {
            long j = this.f[i];
            if (q(j) == iBz && j$.util.Objects.equals(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public int e(int i) {
        int i2 = i + 1;
        if (i2 >= this.c) {
            return -1;
        }
        return i2;
    }

    public final int f(java.lang.Object obj, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "count must be positive but was: "));
        }
        long[] jArr = this.f;
        java.lang.Object[] objArr = this.a;
        int[] iArr = this.b;
        int iBz = defpackage.ahvr.bz(obj);
        int iR = r() & iBz;
        int i2 = this.c;
        int[] iArr2 = this.e;
        int i3 = iArr2[iR];
        if (i3 == -1) {
            iArr2[iR] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (q(j) == iBz && j$.util.Objects.equals(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int i5 = (int) j;
                if (i5 == -1) {
                    jArr[i3] = t(j, i2);
                    break;
                }
                i3 = i5;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i2 + 1;
        int length = this.f.length;
        if (i6 > length) {
            int iMax = java.lang.Math.max(1, length >>> 1) + length;
            int i7 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i7 != length) {
                m(i7);
            }
        }
        k(i2, obj, i, iBz);
        this.c = i6;
        if (i2 >= this.h) {
            u(this.e.length << 1);
        }
        this.d++;
        return 0;
    }

    public final int g(java.lang.Object obj) {
        return s(obj, defpackage.ahvr.bz(obj));
    }

    final int h(int i) {
        return s(this.a[i], q(this.f[i]));
    }

    final java.lang.Object i(int i) {
        defpackage.ahvr.ch(i, this.c);
        return this.a[i];
    }

    final void j(int i) {
        if (i > this.f.length) {
            m(i);
        }
        if (i >= this.h) {
            u(java.lang.Math.max(2, java.lang.Integer.highestOneBit(i - 1) << 1));
        }
    }

    public void k(int i, java.lang.Object obj, int i2, int i3) {
        this.f[i] = (((long) i3) << 32) | 4294967295L;
        this.a[i] = obj;
        this.b[i] = i2;
    }

    public void l(int i) {
        int i2 = this.c - 1;
        java.lang.Object[] objArr = this.a;
        if (i >= i2) {
            objArr[i] = null;
            this.b[i] = 0;
            this.f[i] = -1;
            return;
        }
        objArr[i] = objArr[i2];
        int[] iArr = this.b;
        iArr[i] = iArr[i2];
        objArr[i2] = null;
        iArr[i2] = 0;
        long[] jArr = this.f;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int iQ = q(j) & r();
        int[] iArr2 = this.e;
        int i3 = iArr2[iQ];
        if (i3 == i2) {
            iArr2[iQ] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = t(j2, i);
                return;
            }
            i3 = i4;
        }
    }

    public void m(int i) {
        this.a = java.util.Arrays.copyOf(this.a, i);
        this.b = java.util.Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i);
        if (i > length) {
            java.util.Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f = jArrCopyOf;
    }

    final void n(int i, int i2) {
        defpackage.ahvr.ch(i, this.c);
        this.b[i] = i2;
    }

    public void o(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Initial capacity must be non-negative");
        }
        int iBA = defpackage.ahvr.bA(i);
        int[] iArr = new int[iBA];
        java.util.Arrays.fill(iArr, -1);
        this.e = iArr;
        this.g = 1.0f;
        this.a = new java.lang.Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        java.util.Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = java.lang.Math.max(1, iBA);
    }

    final aijp p(int i) {
        defpackage.ahvr.ch(i, this.c);
        return new aijp(this, i);
    }

    public aijx(int i) {
        o(i);
    }

    public aijx() {
        o(3);
    }
}

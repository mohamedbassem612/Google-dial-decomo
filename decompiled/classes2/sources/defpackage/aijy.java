package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aijy extends aijx {
    transient long[] g;
    private transient int h;
    private transient int i;

    public aijy(aijx aijxVar) {
        o(aijxVar.c);
        int iA = aijxVar.a();
        while (iA != -1) {
            f(aijxVar.i(iA), aijxVar.c(iA));
            iA = aijxVar.e(iA);
        }
    }

    private final int q(int i) {
        return (int) (this.g[i] >>> 32);
    }

    private final int r(int i) {
        return (int) this.g[i];
    }

    private final void s(int i, int i2) {
        if (i == -2) {
            this.h = i2;
            i = -2;
        } else {
            long[] jArr = this.g;
            jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.i = i;
        } else {
            long[] jArr2 = this.g;
            jArr2[i2] = (jArr2[i2] & 4294967295L) | (((long) i) << 32);
        }
    }

    public final int a() {
        int i = this.h;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    public final int e(int i) {
        int iR = r(i);
        if (iR == -2) {
            return -1;
        }
        return iR;
    }

    public final void k(int i, java.lang.Object obj, int i2, int i3) {
        super.k(i, obj, i2, i3);
        s(this.i, i);
        s(i, -2);
    }

    public final void l(int i) {
        int i2 = ((aijx) this).c - 1;
        s(q(i), r(i));
        if (i < i2) {
            s(q(i2), i);
            s(i, r(i2));
        }
        super.l(i);
    }

    public final void m(int i) {
        super.m(i);
        long[] jArr = this.g;
        int length = jArr.length;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i);
        this.g = jArrCopyOf;
        java.util.Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public final void o(int i) {
        super.o(i);
        this.h = -2;
        this.i = -2;
        long[] jArr = new long[i];
        this.g = jArr;
        java.util.Arrays.fill(jArr, -1L);
    }
}

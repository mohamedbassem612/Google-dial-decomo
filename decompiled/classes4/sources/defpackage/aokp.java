package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aokp extends aojo implements java.util.RandomAccess {
    public final java.lang.Object[] a;
    public final int b;
    public int c;
    public int d;

    public aokp(java.lang.Object[] objArr, int i) {
        aooh.f(objArr, "buffer");
        this.a = objArr;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "ring buffer filled size should not be negative but it is "));
        }
        int length = objArr.length;
        if (i > length) {
            throw new java.lang.IllegalArgumentException(a.bf(length, i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
        }
        this.b = length;
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public final void b(int i) {
        int i2 = this.d;
        if (i > i2) {
            throw new java.lang.IllegalArgumentException(a.bf(i2, i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
        }
        int i3 = this.c;
        int i4 = this.b;
        int i5 = (i3 + i) % i4;
        java.lang.Object[] objArr = this.a;
        if (i3 > i5) {
            ajsz.dm(objArr, i3, i4);
            ajsz.dm(objArr, 0, i5);
        } else {
            ajsz.dm(objArr, i3, i5);
        }
        this.c = i5;
        this.d -= i;
    }

    public final boolean c() {
        return this.d == this.b;
    }

    public final java.lang.Object get(int i) {
        a.aj(i, this.d);
        return this.a[(this.c + i) % this.b];
    }

    public final java.util.Iterator iterator() {
        return new defpackage.aoko(this);
    }

    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        aooh.f(objArr, "array");
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = java.util.Arrays.copyOf(objArr, i);
            aooh.e(objArr, "copyOf(...)");
        }
        int i2 = this.d;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.c; i4 < i2 && i5 < this.b; i5++) {
            objArr[i4] = this.a[i5];
            i4++;
        }
        while (i4 < i2) {
            objArr[i4] = this.a[i3];
            i4++;
            i3++;
        }
        ajsz.bk(i2, objArr);
        return objArr;
    }

    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[this.d]);
    }
}

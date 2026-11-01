package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apxv extends defpackage.apxg implements java.util.RandomAccess, defpackage.apyi {
    private static final double[] b;
    public int a;
    private double[] c;

    static {
        double[] dArr = new double[0];
        b = dArr;
        new defpackage.apxv(dArr, 0, false);
    }

    apxv() {
        this(b, 0, true);
    }

    private final java.lang.String g(int i) {
        return "Index:" + i + ", Size:" + this.a;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.a) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.apxg, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        double[] dArr = this.c;
        int length = dArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.c, i, dArr2, i3, this.a - i);
            this.c = dArr2;
        }
        this.c[i] = dDoubleValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.apxg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        a();
        defpackage.apyj.a(collection);
        if (!(collection instanceof defpackage.apxv)) {
            return super.addAll(collection);
        }
        defpackage.apxv apxvVar = (defpackage.apxv) collection;
        int i = apxvVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArrCopyOf = this.c;
        if (i3 > dArrCopyOf.length) {
            dArrCopyOf = java.util.Arrays.copyOf(dArrCopyOf, i3);
            this.c = dArrCopyOf;
        }
        java.lang.System.arraycopy(apxvVar.c, 0, dArrCopyOf, this.a, apxvVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.apyi
    public final /* bridge */ /* synthetic */ defpackage.apyi d(int i) {
        if (i >= this.a) {
            return new defpackage.apxv(i == 0 ? b : java.util.Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final double e(int i) {
        h(i);
        return this.c[i];
    }

    @Override // defpackage.apxg, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.apxv)) {
            return super.equals(obj);
        }
        defpackage.apxv apxvVar = (defpackage.apxv) obj;
        if (this.a == apxvVar.a) {
            double[] dArr = apxvVar.c;
            for (int i = 0; i < this.a; i++) {
                if (java.lang.Double.doubleToLongBits(this.c[i]) == java.lang.Double.doubleToLongBits(dArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(double d) {
        a();
        int i = this.a;
        double[] dArr = this.c;
        int length = dArr.length;
        if (i == length) {
            dArr = new double[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, dArr, 0, this.a);
            this.c = dArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        dArr[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Double.valueOf(e(i));
    }

    @Override // defpackage.apxg, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM = 1;
        for (int i = 0; i < this.a; i++) {
            long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.c[i]);
            byte[] bArr = defpackage.apyj.a;
            iM = (iM * 31) + anty.M(jDoubleToLongBits);
        }
        return iM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.apxg, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        a();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.c;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.apxg, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        a();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private apxv(double[] dArr, int i, boolean z) {
        super(z);
        this.c = dArr;
        this.a = i;
    }

    @Override // defpackage.apxg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        f(((java.lang.Double) obj).doubleValue());
        return true;
    }
}

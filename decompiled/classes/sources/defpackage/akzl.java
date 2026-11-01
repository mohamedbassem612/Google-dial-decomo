package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akzl extends defpackage.akyo implements java.util.RandomAccess, defpackage.alag, defpackage.albo {
    public static final defpackage.akzl a;
    private static final double[] d;
    public double[] b;
    public int c;

    static {
        double[] dArr = new double[0];
        d = dArr;
        a = new defpackage.akzl(dArr, 0, false);
    }

    akzl() {
        this(d, 0, true);
    }

    private final java.lang.String h(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new java.lang.IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        ft();
        if (i < 0 || i > (i2 = this.c)) {
            throw new java.lang.IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        double[] dArr = this.b;
        int length = dArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, dArr2, i3, this.c - i);
            this.b = dArr2;
        }
        this.b[i] = dDoubleValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        ft();
        collection.getClass();
        if (!(collection instanceof defpackage.akzl)) {
            return super.addAll(collection);
        }
        defpackage.akzl akzlVar = (defpackage.akzl) collection;
        int i = akzlVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i + i2;
        double[] dArrCopyOf = this.b;
        int length = dArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                dArrCopyOf = new double[i3];
                this.b = dArrCopyOf;
            } else {
                dArrCopyOf = java.util.Arrays.copyOf(dArrCopyOf, java.lang.Math.max(i3, java.lang.Math.max(((length * 3) / 2) + 1, 10)));
                this.b = dArrCopyOf;
            }
        }
        java.lang.System.arraycopy(akzlVar.b, 0, dArrCopyOf, this.c, akzlVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.alag
    public final double e(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.akzl)) {
            return super.equals(obj);
        }
        defpackage.akzl akzlVar = (defpackage.akzl) obj;
        if (this.c == akzlVar.c) {
            double[] dArr = akzlVar.b;
            for (int i = 0; i < this.c; i++) {
                if (java.lang.Double.doubleToLongBits(this.b[i]) == java.lang.Double.doubleToLongBits(dArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.alat
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.alag d(int i) {
        if (i >= this.c) {
            return new defpackage.akzl(i == 0 ? d : java.util.Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void g(double d2) {
        ft();
        int i = this.c;
        double[] dArr = this.b;
        int length = dArr.length;
        if (i == length) {
            dArr = new double[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, dArr, 0, this.c);
            this.b = dArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        dArr[i2] = d2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Double.valueOf(e(i));
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM = 1;
        for (int i = 0; i < this.c; i++) {
            long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.b[i]);
            byte[] bArr = defpackage.alau.a;
            iM = (iM * 31) + defpackage.anty.M(jDoubleToLongBits);
        }
        return iM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        ft();
        i(i);
        double[] dArr = this.b;
        double d2 = dArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return java.lang.Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ft();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.b;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        ft();
        i(i);
        double[] dArr = this.b;
        double d2 = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private akzl(double[] dArr, int i, boolean z) {
        super(z);
        this.b = dArr;
        this.c = i;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        g(((java.lang.Double) obj).doubleValue());
        return true;
    }
}

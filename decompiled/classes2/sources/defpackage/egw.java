package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class egw extends egc implements java.util.RandomAccess, ehk, eic {
    private static final double[] b;
    public int a;
    private double[] c;

    static {
        double[] dArr = new double[0];
        b = dArr;
        new defpackage.egw(dArr, 0, false);
    }

    egw() {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addAll(java.util.Collection collection) {
        a();
        ehl.a(collection);
        if (!(collection instanceof defpackage.egw)) {
            return super.addAll(collection);
        }
        defpackage.egw egwVar = (defpackage.egw) collection;
        int i = egwVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArrCopyOf = this.c;
        if (i3 > dArrCopyOf.length) {
            dArrCopyOf = java.util.Arrays.copyOf(dArrCopyOf, i3);
            this.c = dArrCopyOf;
        }
        java.lang.System.arraycopy(egwVar.c, 0, dArrCopyOf, this.a, egwVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final /* bridge */ /* synthetic */ ehk d(int i) {
        if (i >= this.a) {
            return new defpackage.egw(i == 0 ? b : java.util.Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final double e(int i) {
        h(i);
        return this.c[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.egw)) {
            return super.equals(obj);
        }
        defpackage.egw egwVar = (defpackage.egw) obj;
        if (this.a == egwVar.a) {
            double[] dArr = egwVar.c;
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

    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Double.valueOf(e(i));
    }

    public final int hashCode() {
        int iM = 1;
        for (int i = 0; i < this.a; i++) {
            long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.c[i]);
            byte[] bArr = ehl.a;
            iM = (iM * 31) + anty.M(jDoubleToLongBits);
        }
        return iM;
    }

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

    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double dDoubleValue = ((java.lang.Double) obj).doubleValue();
        a();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return java.lang.Double.valueOf(d);
    }

    public final int size() {
        return this.a;
    }

    private egw(double[] dArr, int i, boolean z) {
        super(z);
        this.c = dArr;
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        f(((java.lang.Double) obj).doubleValue());
        return true;
    }
}

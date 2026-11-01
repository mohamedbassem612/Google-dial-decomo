package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ege extends egc implements java.util.RandomAccess, ehk, eic {
    private static final boolean[] b;
    public int a;
    private boolean[] c;

    static {
        boolean[] zArr = new boolean[0];
        b = zArr;
        new defpackage.ege(zArr, 0, false);
    }

    ege() {
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
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.c;
        int length = zArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.c, i, zArr2, i3, this.a - i);
            this.c = zArr2;
        }
        this.c[i] = zBooleanValue;
        this.a++;
        this.modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addAll(java.util.Collection collection) {
        a();
        ehl.a(collection);
        if (!(collection instanceof defpackage.ege)) {
            return super.addAll(collection);
        }
        defpackage.ege egeVar = (defpackage.ege) collection;
        int i = egeVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArrCopyOf = this.c;
        if (i3 > zArrCopyOf.length) {
            zArrCopyOf = java.util.Arrays.copyOf(zArrCopyOf, i3);
            this.c = zArrCopyOf;
        }
        java.lang.System.arraycopy(egeVar.c, 0, zArrCopyOf, this.a, egeVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final /* bridge */ /* synthetic */ ehk d(int i) {
        if (i >= this.a) {
            return new defpackage.ege(i == 0 ? b : java.util.Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void e(boolean z) {
        a();
        int i = this.a;
        boolean[] zArr = this.c;
        int length = zArr.length;
        if (i == length) {
            zArr = new boolean[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, zArr, 0, this.a);
            this.c = zArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        zArr[i2] = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ege)) {
            return super.equals(obj);
        }
        defpackage.ege egeVar = (defpackage.ege) obj;
        if (this.a == egeVar.a) {
            boolean[] zArr = egeVar.c;
            for (int i = 0; i < this.a; i++) {
                if (this.c[i] == zArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f(int i) {
        h(i);
        return this.c[i];
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Boolean.valueOf(f(i));
    }

    public final int hashCode() {
        int iL = 1;
        for (int i = 0; i < this.a; i++) {
            boolean z = this.c[i];
            byte[] bArr = ehl.a;
            iL = (iL * 31) + anty.L(z);
        }
        return iL;
    }

    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        a();
        h(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.c;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        a();
        h(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    public final int size() {
        return this.a;
    }

    private ege(boolean[] zArr, int i, boolean z) {
        super(z);
        this.c = zArr;
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        e(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}

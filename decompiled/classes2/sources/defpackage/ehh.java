package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ehh extends egc implements java.util.RandomAccess, ehk, eic {
    private static final int[] b;
    public int a;
    private int[] c;

    static {
        int[] iArr = new int[0];
        b = iArr;
        new defpackage.ehh(iArr, 0, false);
    }

    ehh() {
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
        int iIntValue = ((java.lang.Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.c, i, iArr2, i3, this.a - i);
            this.c = iArr2;
        }
        this.c[i] = iIntValue;
        this.a++;
        this.modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addAll(java.util.Collection collection) {
        a();
        ehl.a(collection);
        if (!(collection instanceof defpackage.ehh)) {
            return super.addAll(collection);
        }
        defpackage.ehh ehhVar = (defpackage.ehh) collection;
        int i = ehhVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArrCopyOf = this.c;
        if (i3 > iArrCopyOf.length) {
            iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i3);
            this.c = iArrCopyOf;
        }
        java.lang.System.arraycopy(ehhVar.c, 0, iArrCopyOf, this.a, ehhVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final /* bridge */ /* synthetic */ ehk d(int i) {
        if (i >= this.a) {
            return new defpackage.ehh(i == 0 ? b : java.util.Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final int e(int i) {
        h(i);
        return this.c[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ehh)) {
            return super.equals(obj);
        }
        defpackage.ehh ehhVar = (defpackage.ehh) obj;
        if (this.a == ehhVar.a) {
            int[] iArr = ehhVar.c;
            for (int i = 0; i < this.a; i++) {
                if (this.c[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i) {
        a();
        int i2 = this.a;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, iArr, 0, this.a);
            this.c = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        iArr[i3] = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(e(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        a();
        h(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        int i3 = this.a;
        if (i < i3 - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.c;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        a();
        h(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    public final int size() {
        return this.a;
    }

    private ehh(int[] iArr, int i, boolean z) {
        super(z);
        this.c = iArr;
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        f(((java.lang.Integer) obj).intValue());
        return true;
    }
}

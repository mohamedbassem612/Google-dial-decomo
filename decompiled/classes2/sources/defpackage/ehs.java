package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ehs extends egc implements java.util.RandomAccess, ehk, eic {
    private static final long[] b;
    public int a;
    private long[] c;

    static {
        long[] jArr = new long[0];
        b = jArr;
        new defpackage.ehs(jArr, 0, false);
    }

    ehs() {
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
        long jLongValue = ((java.lang.Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        long[] jArr = this.c;
        int length = jArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.c, i, jArr2, i3, this.a - i);
            this.c = jArr2;
        }
        this.c[i] = jLongValue;
        this.a++;
        this.modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean addAll(java.util.Collection collection) {
        a();
        ehl.a(collection);
        if (!(collection instanceof defpackage.ehs)) {
            return super.addAll(collection);
        }
        defpackage.ehs ehsVar = (defpackage.ehs) collection;
        int i = ehsVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArrCopyOf = this.c;
        if (i3 > jArrCopyOf.length) {
            jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i3);
            this.c = jArrCopyOf;
        }
        java.lang.System.arraycopy(ehsVar.c, 0, jArrCopyOf, this.a, ehsVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final /* bridge */ /* synthetic */ ehk d(int i) {
        if (i >= this.a) {
            return new defpackage.ehs(i == 0 ? b : java.util.Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final long e(int i) {
        h(i);
        return this.c[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ehs)) {
            return super.equals(obj);
        }
        defpackage.ehs ehsVar = (defpackage.ehs) obj;
        if (this.a == ehsVar.a) {
            long[] jArr = ehsVar.c;
            for (int i = 0; i < this.a; i++) {
                if (this.c[i] == jArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(long j) {
        a();
        int i = this.a;
        long[] jArr = this.c;
        int length = jArr.length;
        if (i == length) {
            jArr = new long[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, jArr, 0, this.a);
            this.c = jArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        jArr[i2] = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(e(i));
    }

    public final int hashCode() {
        int iM = 1;
        for (int i = 0; i < this.a; i++) {
            long j = this.c[i];
            byte[] bArr = ehl.a;
            iM = (iM * 31) + anty.M(j);
        }
        return iM;
    }

    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        a();
        h(i);
        long[] jArr = this.c;
        long j = jArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.c;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        a();
        h(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    public final int size() {
        return this.a;
    }

    private ehs(long[] jArr, int i, boolean z) {
        super(z);
        this.c = jArr;
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        f(((java.lang.Long) obj).longValue());
        return true;
    }
}

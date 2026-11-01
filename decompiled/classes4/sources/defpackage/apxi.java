package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apxi extends defpackage.apxg implements java.util.RandomAccess, defpackage.apyi {
    private static final boolean[] b;
    public int a;
    private boolean[] c;

    static {
        boolean[] zArr = new boolean[0];
        b = zArr;
        new defpackage.apxi(zArr, 0, false);
    }

    apxi() {
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

    @Override // defpackage.apxg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        a();
        defpackage.apyj.a(collection);
        if (!(collection instanceof defpackage.apxi)) {
            return super.addAll(collection);
        }
        defpackage.apxi apxiVar = (defpackage.apxi) collection;
        int i = apxiVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArrCopyOf = this.c;
        if (i3 > zArrCopyOf.length) {
            zArrCopyOf = java.util.Arrays.copyOf(zArrCopyOf, i3);
            this.c = zArrCopyOf;
        }
        java.lang.System.arraycopy(apxiVar.c, 0, zArrCopyOf, this.a, apxiVar.a);
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
            return new defpackage.apxi(i == 0 ? b : java.util.Arrays.copyOf(this.c, i), this.a, true);
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

    @Override // defpackage.apxg, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.apxi)) {
            return super.equals(obj);
        }
        defpackage.apxi apxiVar = (defpackage.apxi) obj;
        if (this.a == apxiVar.a) {
            boolean[] zArr = apxiVar.c;
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

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Boolean.valueOf(f(i));
    }

    @Override // defpackage.apxg, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iL = 1;
        for (int i = 0; i < this.a; i++) {
            boolean z = this.c[i];
            byte[] bArr = defpackage.apyj.a;
            iL = (iL * 31) + anty.L(z);
        }
        return iL;
    }

    @Override // java.util.AbstractList, java.util.List
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

    @Override // defpackage.apxg, java.util.AbstractList, java.util.List
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

    @Override // java.util.AbstractList
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

    @Override // defpackage.apxg, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        a();
        h(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private apxi(boolean[] zArr, int i, boolean z) {
        super(z);
        this.c = zArr;
        this.a = i;
    }

    @Override // defpackage.apxg, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        e(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akyt extends defpackage.akyo implements java.util.RandomAccess, defpackage.alaf, defpackage.albo {
    public static final defpackage.akyt a;
    private static final boolean[] c;
    public int b;
    private boolean[] d;

    static {
        boolean[] zArr = new boolean[0];
        c = zArr;
        a = new defpackage.akyt(zArr, 0, false);
    }

    akyt() {
        this(c, 0, true);
    }

    private final java.lang.String g(int i) {
        return "Index:" + i + ", Size:" + this.b;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.b) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        ft();
        if (i < 0 || i > (i2 = this.b)) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.d;
        int length = zArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.d, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.d, i, zArr2, i3, this.b - i);
            this.d = zArr2;
        }
        this.d[i] = zBooleanValue;
        this.b++;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        ft();
        collection.getClass();
        if (!(collection instanceof defpackage.akyt)) {
            return super.addAll(collection);
        }
        defpackage.akyt akytVar = (defpackage.akyt) collection;
        int i = akytVar.b;
        if (i == 0) {
            return false;
        }
        int i2 = this.b;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i + i2;
        boolean[] zArrCopyOf = this.d;
        int length = zArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                zArrCopyOf = new boolean[i3];
                this.d = zArrCopyOf;
            } else {
                zArrCopyOf = java.util.Arrays.copyOf(zArrCopyOf, java.lang.Math.max(i3, java.lang.Math.max(((length * 3) / 2) + 1, 10)));
                this.d = zArrCopyOf;
            }
        }
        java.lang.System.arraycopy(akytVar.d, 0, zArrCopyOf, this.b, akytVar.b);
        this.b = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.alat
    public final /* bridge */ /* synthetic */ defpackage.alat d(int i) {
        if (i >= this.b) {
            return new defpackage.akyt(i == 0 ? c : java.util.Arrays.copyOf(this.d, i), this.b, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void e(boolean z) {
        ft();
        int i = this.b;
        boolean[] zArr = this.d;
        int length = zArr.length;
        if (i == length) {
            zArr = new boolean[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.d, 0, zArr, 0, this.b);
            this.d = zArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.akyt)) {
            return super.equals(obj);
        }
        defpackage.akyt akytVar = (defpackage.akyt) obj;
        if (this.b == akytVar.b) {
            boolean[] zArr = akytVar.d;
            for (int i = 0; i < this.b; i++) {
                if (this.d[i] == zArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.alaf
    public final boolean f(int i) {
        h(i);
        return this.d[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Boolean.valueOf(f(i));
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iL = 1;
        for (int i = 0; i < this.b; i++) {
            boolean z = this.d[i];
            byte[] bArr = defpackage.alau.a;
            iL = (iL * 31) + defpackage.anty.L(z);
        }
        return iL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        ft();
        h(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        int i2 = this.b;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.b--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ft();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.d;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.b - i2);
        this.b -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        ft();
        h(i);
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    private akyt(boolean[] zArr, int i, boolean z) {
        super(z);
        this.d = zArr;
        this.b = i;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        e(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}

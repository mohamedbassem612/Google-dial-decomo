package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alae extends defpackage.akyo implements java.util.RandomAccess, defpackage.alak, defpackage.albo {
    public static final defpackage.alae a;
    private static final int[] d;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        d = iArr;
        a = new defpackage.alae(iArr, 0, false);
    }

    alae() {
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
        int iIntValue = ((java.lang.Integer) obj).intValue();
        ft();
        if (i < 0 || i > (i2 = this.c)) {
            throw new java.lang.IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, iArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, iArr2, i3, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = iIntValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        ft();
        collection.getClass();
        if (!(collection instanceof defpackage.alae)) {
            return super.addAll(collection);
        }
        defpackage.alae alaeVar = (defpackage.alae) collection;
        int i = alaeVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i + i2;
        int[] iArrCopyOf = this.b;
        int length = iArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                iArrCopyOf = new int[i3];
                this.b = iArrCopyOf;
            } else {
                iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, java.lang.Math.max(i3, java.lang.Math.max(((length * 3) / 2) + 1, 10)));
                this.b = iArrCopyOf;
            }
        }
        java.lang.System.arraycopy(alaeVar.b, 0, iArrCopyOf, this.c, alaeVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.alak
    public final int e(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.alae)) {
            return super.equals(obj);
        }
        defpackage.alae alaeVar = (defpackage.alae) obj;
        if (this.c == alaeVar.c) {
            int[] iArr = alaeVar.b;
            for (int i = 0; i < this.c; i++) {
                if (this.b[i] == iArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.alat
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.alak d(int i) {
        if (i >= this.c) {
            return new defpackage.alae(i == 0 ? d : java.util.Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // defpackage.alak
    public final void g(int i) {
        ft();
        int i2 = this.c;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, iArr, 0, this.c);
            this.b = iArr;
        }
        int i3 = this.c;
        this.c = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(e(i));
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        ft();
        i(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        int i3 = this.c;
        if (i < i3 - 1) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ft();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        ft();
        i(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return java.lang.Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private alae(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        g(((java.lang.Integer) obj).intValue());
        return true;
    }
}

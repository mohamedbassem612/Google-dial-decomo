package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class albd extends defpackage.akyo implements java.util.RandomAccess, defpackage.alan, defpackage.albo {
    public static final defpackage.albd a;
    private static final long[] d;
    public long[] b;
    public int c;

    static {
        long[] jArr = new long[0];
        d = jArr;
        a = new defpackage.albd(jArr, 0, false);
    }

    albd() {
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

    @Override // defpackage.alan
    public final long a(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        long jLongValue = ((java.lang.Long) obj).longValue();
        ft();
        if (i < 0 || i > (i2 = this.c)) {
            throw new java.lang.IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, jArr2, i3, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = jLongValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        ft();
        collection.getClass();
        if (!(collection instanceof defpackage.albd)) {
            return super.addAll(collection);
        }
        defpackage.albd albdVar = (defpackage.albd) collection;
        int i = albdVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i + i2;
        long[] jArrCopyOf = this.b;
        int length = jArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                jArrCopyOf = new long[i3];
                this.b = jArrCopyOf;
            } else {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, java.lang.Math.max(i3, java.lang.Math.max(((length * 3) / 2) + 1, 10)));
                this.b = jArrCopyOf;
            }
        }
        java.lang.System.arraycopy(albdVar.b, 0, jArrCopyOf, this.c, albdVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.alan
    public final long e(int i, long j) {
        ft();
        i(i);
        long[] jArr = this.b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.albd)) {
            return super.equals(obj);
        }
        defpackage.albd albdVar = (defpackage.albd) obj;
        if (this.c == albdVar.c) {
            long[] jArr = albdVar.b;
            for (int i = 0; i < this.c; i++) {
                if (this.b[i] == jArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.alat
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.alan d(int i) {
        if (i >= this.c) {
            return new defpackage.albd(i == 0 ? d : java.util.Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // defpackage.alan
    public final void g(long j) {
        ft();
        int i = this.c;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i == length) {
            jArr = new long[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, jArr, 0, this.c);
            this.b = jArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        jArr[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(a(i));
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM = 1;
        for (int i = 0; i < this.c; i++) {
            long j = this.b[i];
            byte[] bArr = defpackage.alau.a;
            iM = (iM * 31) + defpackage.anty.M(j);
        }
        return iM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        ft();
        i(i);
        long[] jArr = this.b;
        long j = jArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ft();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return java.lang.Long.valueOf(e(i, ((java.lang.Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    private albd(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.c = i;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        g(((java.lang.Long) obj).longValue());
        return true;
    }
}

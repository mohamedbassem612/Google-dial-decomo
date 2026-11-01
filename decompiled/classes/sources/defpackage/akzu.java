package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akzu extends defpackage.akyo implements java.util.RandomAccess, defpackage.alaj, defpackage.albo {
    public static final defpackage.akzu a;
    private static final float[] d;
    public float[] b;
    public int c;

    static {
        float[] fArr = new float[0];
        d = fArr;
        a = new defpackage.akzu(fArr, 0, false);
    }

    akzu() {
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
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        ft();
        if (i < 0 || i > (i2 = this.c)) {
            throw new java.lang.IndexOutOfBoundsException(h(i));
        }
        int i3 = i + 1;
        float[] fArr = this.b;
        int length = fArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, fArr2, i3, this.c - i);
            this.b = fArr2;
        }
        this.b[i] = fFloatValue;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        ft();
        collection.getClass();
        if (!(collection instanceof defpackage.akzu)) {
            return super.addAll(collection);
        }
        defpackage.akzu akzuVar = (defpackage.akzu) collection;
        int i = akzuVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i + i2;
        float[] fArrCopyOf = this.b;
        int length = fArrCopyOf.length;
        if (i3 > length) {
            if (i2 == 0) {
                fArrCopyOf = new float[i3];
                this.b = fArrCopyOf;
            } else {
                fArrCopyOf = java.util.Arrays.copyOf(fArrCopyOf, java.lang.Math.max(i3, java.lang.Math.max(((length * 3) / 2) + 1, 10)));
                this.b = fArrCopyOf;
            }
        }
        java.lang.System.arraycopy(akzuVar.b, 0, fArrCopyOf, this.c, akzuVar.c);
        this.c = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.alaj
    public final float e(int i) {
        i(i);
        return this.b[i];
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.akzu)) {
            return super.equals(obj);
        }
        defpackage.akzu akzuVar = (defpackage.akzu) obj;
        if (this.c == akzuVar.c) {
            float[] fArr = akzuVar.b;
            for (int i = 0; i < this.c; i++) {
                if (java.lang.Float.floatToIntBits(this.b[i]) == java.lang.Float.floatToIntBits(fArr[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.alat
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.alaj d(int i) {
        if (i >= this.c) {
            return new defpackage.akzu(i == 0 ? d : java.util.Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // defpackage.alaj
    public final void g(float f) {
        ft();
        int i = this.c;
        float[] fArr = this.b;
        int length = fArr.length;
        if (i == length) {
            fArr = new float[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, fArr, 0, this.c);
            this.b = fArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        fArr[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Float.valueOf(e(i));
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        ft();
        i(i);
        float[] fArr = this.b;
        float f = fArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ft();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.b;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        ft();
        i(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public akzu(float[] fArr, int i, boolean z) {
        super(z);
        this.b = fArr;
        this.c = i;
    }

    @Override // defpackage.akyo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        g(((java.lang.Float) obj).floatValue());
        return true;
    }
}

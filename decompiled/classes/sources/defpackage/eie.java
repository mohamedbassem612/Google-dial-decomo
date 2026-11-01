package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eie extends defpackage.egc implements java.util.RandomAccess {
    public static final defpackage.eie a;
    private static final java.lang.Object[] c;
    public java.lang.Object[] b;
    private int d;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        c = objArr;
        a = new defpackage.eie(objArr, 0, false);
    }

    eie() {
        this(c, 0, true);
    }

    private final java.lang.String e(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new java.lang.IndexOutOfBoundsException(e(i));
        }
    }

    @Override // defpackage.egc, java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new java.lang.IndexOutOfBoundsException(e(i));
        }
        int i3 = i + 1;
        java.lang.Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, objArr2, i3, this.d - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.ehk
    public final /* bridge */ /* synthetic */ defpackage.ehk d(int i) {
        if (i >= this.d) {
            return new defpackage.eie(i == 0 ? c : java.util.Arrays.copyOf(this.b, i), this.d, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // defpackage.egc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            if (!(obj instanceof java.util.RandomAccess)) {
                return super.equals(obj);
            }
            java.util.List list = (java.util.List) obj;
            int i = this.d;
            if (i == list.size()) {
                if (!(obj instanceof defpackage.eie)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.b[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                defpackage.eie eieVar = (defpackage.eie) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.b[i3].equals(eieVar.b[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        f(i);
        return this.b[i];
    }

    @Override // defpackage.egc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.d;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.b[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.egc, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        a();
        f(i);
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return obj;
    }

    @Override // defpackage.egc, java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        a();
        f(i);
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private eie(java.lang.Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.d = i;
    }

    @Override // defpackage.egc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        a();
        int i = this.d;
        java.lang.Object[] objArrCopyOf = this.b;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = java.util.Arrays.copyOf(this.b, java.lang.Math.max(((length * 3) / 2) + 1, 10));
            this.b = objArrCopyOf;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        objArrCopyOf[i2] = obj;
        this.modCount++;
        return true;
    }
}

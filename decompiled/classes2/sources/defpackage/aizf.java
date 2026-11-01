package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizf extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {
    private static final long serialVersionUID = 0;
    final float[] a;
    final int b;
    final int c;

    public aizf(float[] fArr, int i, int i2) {
        this.a = fArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return (obj instanceof java.lang.Float) && defpackage.ajee.j(this.a, ((java.lang.Float) obj).floatValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aizf)) {
            return super.equals(obj);
        }
        defpackage.aizf aizfVar = (defpackage.aizf) obj;
        int size = size();
        if (aizfVar.size() == size) {
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] == aizfVar.a[aizfVar.b + i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        ahvr.ch(i, size());
        return java.lang.Float.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = this.b; i < this.c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.a[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Float) {
            float[] fArr = this.a;
            float fFloatValue = ((java.lang.Float) obj).floatValue();
            int i = this.b;
            int iJ = defpackage.ajee.j(fArr, fFloatValue, i, this.c);
            if (iJ >= 0) {
                return iJ - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float[] fArr = this.a;
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        int i = this.b;
        int i2 = this.c - 1;
        while (i2 >= i) {
            if (fArr[i2] == fFloatValue) {
                if (i2 >= 0) {
                    return i2 - i;
                }
                return -1;
            }
            i2--;
        }
        i2 = -1;
        if (i2 >= 0) {
            return i2 - i;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        java.lang.Float f = (java.lang.Float) obj;
        ahvr.ch(i, size());
        float[] fArr = this.a;
        int i2 = this.b + i;
        float f2 = fArr[i2];
        ahvr.ci(f);
        fArr[i2] = f.floatValue();
        return java.lang.Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        ahvr.bX(i, i2, size());
        if (i == i2) {
            return java.util.Collections.EMPTY_LIST;
        }
        float[] fArr = this.a;
        int i3 = this.b;
        return new defpackage.aizf(fArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 12);
        sb.append('[');
        float[] fArr = this.a;
        int i = this.b;
        sb.append(fArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(fArr[i]);
        }
    }
}

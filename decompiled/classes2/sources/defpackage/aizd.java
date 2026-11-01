package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizd extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;
    final int b;
    final int c;

    public aizd(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return (obj instanceof java.lang.Byte) && defpackage.ajee.l(this.a, ((java.lang.Byte) obj).byteValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aizd)) {
            return super.equals(obj);
        }
        defpackage.aizd aizdVar = (defpackage.aizd) obj;
        int size = size();
        if (aizdVar.size() == size) {
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] == aizdVar.a[aizdVar.b + i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        ahvr.ch(i, size());
        return java.lang.Byte.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Byte) {
            byte[] bArr = this.a;
            byte bByteValue = ((java.lang.Byte) obj).byteValue();
            int i = this.b;
            int iL = defpackage.ajee.l(bArr, bByteValue, i, this.c);
            if (iL >= 0) {
                return iL - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Byte)) {
            return -1;
        }
        byte[] bArr = this.a;
        byte bByteValue = ((java.lang.Byte) obj).byteValue();
        int i = this.b;
        int i2 = this.c - 1;
        while (i2 >= i) {
            if (bArr[i2] == bByteValue) {
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
        java.lang.Byte b = (java.lang.Byte) obj;
        ahvr.ch(i, size());
        byte[] bArr = this.a;
        int i2 = this.b + i;
        byte b2 = bArr[i2];
        ahvr.ci(b);
        bArr[i2] = b.byteValue();
        return java.lang.Byte.valueOf(b2);
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
        byte[] bArr = this.a;
        int i3 = this.b;
        return new defpackage.aizd(bArr, i3 + i, i2 + i3);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 5);
        sb.append('[');
        byte[] bArr = this.a;
        int i = this.b;
        sb.append((int) bArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append((int) bArr[i]);
        }
    }
}

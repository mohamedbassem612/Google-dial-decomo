package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizl extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable, j$.util.List {
    private static final long serialVersionUID = 0;
    final long[] a;
    final int b;
    final int c;

    public aizl(long[] jArr, int i, int i2) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return (obj instanceof java.lang.Long) && defpackage.ajee.h(this.a, ((java.lang.Long) obj).longValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aizl)) {
            return super.equals(obj);
        }
        defpackage.aizl aizlVar = (defpackage.aizl) obj;
        int size = size();
        if (aizlVar.size() == size) {
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] == aizlVar.a[aizlVar.b + i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable.-CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        ahvr.ch(i, size());
        return java.lang.Long.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM = 1;
        for (int i = this.b; i < this.c; i++) {
            iM = (iM * 31) + anty.M(this.a[i]);
        }
        return iM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            long[] jArr = this.a;
            long jLongValue = ((java.lang.Long) obj).longValue();
            int i = this.b;
            int iH = defpackage.ajee.h(jArr, jLongValue, i, this.c);
            if (iH >= 0) {
                return iH - i;
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
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long[] jArr = this.a;
        long jLongValue = ((java.lang.Long) obj).longValue();
        int i = this.b;
        int i2 = this.c - 1;
        while (i2 >= i) {
            if (jArr[i2] == jLongValue) {
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

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.-CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.-CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        j$.util.List.-CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        java.lang.Long l = (java.lang.Long) obj;
        ahvr.ch(i, size());
        long[] jArr = this.a;
        int i2 = this.b + i;
        long j = jArr[i2];
        ahvr.ci(l);
        jArr[i2] = l.longValue();
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.List
    public final /* synthetic */ void sort(java.util.Comparator comparator) {
        j$.util.List.-CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.spliterator(this.a, this.b, this.c, 0);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.-CC.$default$stream(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        ahvr.bX(i, i2, size());
        if (i == i2) {
            return java.util.Collections.EMPTY_LIST;
        }
        long[] jArr = this.a;
        int i3 = this.b;
        return new defpackage.aizl(jArr, i3 + i, i2 + i3);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.Collection.-CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 10);
        sb.append('[');
        long[] jArr = this.a;
        int i = this.b;
        sb.append(jArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(jArr[i]);
        }
    }
}

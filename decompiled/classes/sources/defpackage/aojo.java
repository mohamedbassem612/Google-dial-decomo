package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aojo extends defpackage.aojj implements java.util.List, j$.util.List, defpackage.aoow {
    protected aojo() {
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        defpackage.a.am();
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        return defpackage.anty.an();
    }

    public final void addFirst(java.lang.Object obj) {
        defpackage.a.am();
    }

    public final void addLast(java.lang.Object obj) {
        defpackage.a.am();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.Collection collection = (java.util.Collection) obj;
            if (collection == null) {
                defpackage.aooh.i("other");
            }
            if (size() == collection.size()) {
                java.util.Iterator it = collection.iterator();
                java.util.Iterator<E> it2 = iterator();
                while (it2.hasNext()) {
                    if (!defpackage.aooh.n(it2.next(), it.next())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public abstract java.lang.Object get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        java.util.Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        java.util.Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (defpackage.aooh.n(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new defpackage.aojl(this);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        java.util.ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (defpackage.aooh.n(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new aojm(this, 0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        return defpackage.a.an();
    }

    public final java.lang.Object removeFirst() {
        return defpackage.a.an();
    }

    public final java.lang.Object removeLast() {
        return defpackage.a.an();
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        defpackage.a.am();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        return defpackage.a.an();
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        defpackage.a.am();
    }

    @Override // defpackage.aojj, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.-CC.$default$spliterator(this);
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i2) {
        return new aojn(this, i, i2);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i) {
        return new aojm(this, i);
    }
}

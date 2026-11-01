package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aokc implements java.util.List, java.io.Serializable, java.util.RandomAccess, j$.util.List, defpackage.aoow {
    public static final defpackage.aokc a = new defpackage.aokc();
    private static final long serialVersionUID = -7390468764508069838L;

    private aokc() {
    }

    private final java.lang.Object readResolve() {
        return a;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        return defpackage.anty.al();
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        return defpackage.anty.an();
    }

    public final /* synthetic */ void addFirst(java.lang.Object obj) {
        defpackage.a.am();
    }

    public final /* synthetic */ void addLast(java.lang.Object obj) {
        defpackage.a.am();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        defpackage.a.am();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void) || ((java.lang.Void) obj) != null) {
            return false;
        }
        defpackage.aooh.i("element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.List) && ((java.util.List) obj).isEmpty();
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable.-CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        throw new java.lang.IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            defpackage.aooh.f((java.lang.Void) obj, "element");
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return defpackage.aokb.a;
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            defpackage.aooh.f((java.lang.Void) obj, "element");
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        if (i == 0) {
            return defpackage.aokb.a;
        }
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bj(i, "Index: "));
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.-CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        return defpackage.a.an();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    public final /* synthetic */ java.lang.Object removeFirst() {
        return defpackage.a.an();
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.-CC.$default$removeIf(this, predicate);
    }

    public final /* synthetic */ java.lang.Object removeLast() {
        return defpackage.a.an();
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        defpackage.a.am();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        return defpackage.a.an();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        defpackage.a.am();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.-CC.$default$spliterator(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.-CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return this;
            }
            i = 0;
        }
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bf(i2, i, "fromIndex: ", ", toIndex: "));
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "array");
        return defpackage.aoob.b(this, objArr);
    }

    public final java.lang.String toString() {
        return "[]";
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        defpackage.a.am();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return defpackage.anty.al();
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.Collection.-CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.aoob.a(this);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return defpackage.aokb.a;
    }
}

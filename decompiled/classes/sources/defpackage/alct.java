package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alct implements java.util.List, j$.util.List, defpackage.aoow {
    private final defpackage.aomy a;
    private java.util.List b;

    public alct(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("delegate");
        }
        defpackage.aomy aomyVar = defpackage.alcu.a;
        defpackage.aoov.f(aomyVar, 0);
        this.a = aomyVar;
        this.b = list;
    }

    private final java.util.List a() {
        java.util.List list = this.b;
        if (list != null) {
            return list;
        }
        java.util.List list2 = (java.util.List) this.a.a();
        this.b = list2;
        return list2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return defpackage.anty.al();
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        return defpackage.anty.an();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        defpackage.a.am();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return a().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        return a().containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return defpackage.aooh.n(a(), obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable.-CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        return a().get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return a().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.alcx(a().iterator());
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return a().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new alcy(a().listIterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.-CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        return defpackage.a.an();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.-CC.$default$removeIf(this, predicate);
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
    public final java.lang.Object set(int i, java.lang.Object obj) {
        return defpackage.a.an();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a().size();
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
        return a().subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "array");
        return defpackage.aoob.b(this, objArr);
    }

    public final java.lang.String toString() {
        return a().toString();
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
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
    public final java.util.ListIterator listIterator(int i) {
        return new alcy(a().listIterator(i));
    }
}

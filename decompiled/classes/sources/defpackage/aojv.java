package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aojv implements java.util.Collection, j$.util.Collection, defpackage.aoow {
    private final java.lang.Object[] a;
    private final boolean b;

    public aojv(java.lang.Object[] objArr, boolean z) {
        this.a = objArr;
        this.b = z;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return defpackage.anty.al();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.Collection
    public final void clear() {
        defpackage.a.am();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return defpackage.ajsz.cY(this.a, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable.-CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return defpackage.aooc.H(this.a);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.-CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return defpackage.anty.al();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.a.length;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Collection.-CC.$default$spliterator(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.-CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        boolean z = this.b;
        java.lang.Object[] objArr = this.a;
        if (z && defpackage.aooh.n(objArr.getClass(), java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "array");
        return defpackage.aoob.b(this, objArr);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.Collection.-CC.$default$toArray(this, intFunction);
    }
}

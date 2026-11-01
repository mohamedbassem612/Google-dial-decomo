package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aojj implements java.util.Collection, j$.util.Collection, defpackage.aoow {
    protected aojj() {
    }

    public abstract int a();

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
    public boolean contains(java.lang.Object obj) {
        if (isEmpty()) {
            return false;
        }
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (defpackage.aooh.n(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
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
    public boolean isEmpty() {
        return a() == 0;
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
        return a();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Collection.-CC.$default$spliterator(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.-CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "array");
        return defpackage.aoob.b(this, objArr);
    }

    public final java.lang.String toString() {
        return defpackage.ajsz.cr(this, ", ", "[", "]", new agkc(this, 14), 24);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return defpackage.aoob.a(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.Collection.-CC.$default$toArray(this, intFunction);
    }
}

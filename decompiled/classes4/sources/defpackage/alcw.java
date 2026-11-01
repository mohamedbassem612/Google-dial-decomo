package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class alcw implements java.util.Collection, j$.util.Collection, aoow {
    private final java.util.Collection a;

    public alcw(java.util.Collection collection) {
        aooh.f(collection, "delegate");
        this.a = collection;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return anty.al();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return anty.am();
    }

    @Override // java.util.Collection
    public final void clear() {
        a.am();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        return this.a.containsAll(collection);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable.-CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new alcx(this.a.iterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.-CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return anty.al();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return anty.am();
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return anty.am();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.a.size();
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
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        aooh.f(objArr, "array");
        return aoob.b(this, objArr);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.Collection.-CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return aoob.a(this);
    }
}

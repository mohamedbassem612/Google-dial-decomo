package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolg extends defpackage.aojt implements java.util.Set, java.io.Serializable, defpackage.aopb {
    private static final defpackage.aolg a = new defpackage.aolg(defpackage.aola.a);
    private final defpackage.aola b;

    public aolg(defpackage.aola aolaVar) {
        if (aolaVar == null) {
            defpackage.aooh.i("backing");
        }
        this.b = aolaVar;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() throws java.io.NotSerializableException {
        if (this.b.h) {
            return new aole(this, 1);
        }
        throw new java.io.NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // defpackage.aojt
    public final int a() {
        return this.b.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        return this.b.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        this.b.f();
        return super.addAll(collection);
    }

    public final java.util.Set b() {
        this.b.e();
        return a() <= 0 ? a : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.aokz(this.b, 1, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        return this.b.j(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        this.b.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        this.b.f();
        return super.retainAll(collection);
    }

    public aolg(int i) {
        this(new defpackage.aola(i));
    }

    public aolg() {
        this(new defpackage.aola(8));
    }
}

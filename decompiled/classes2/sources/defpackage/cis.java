package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cis implements java.util.Iterator, aoow {
    public int a;
    private java.lang.Object b;
    private final java.util.Map c;

    public cis(java.lang.Object obj, java.util.Map map) {
        this.b = obj;
        this.c = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.c.size();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.b;
        this.a++;
        java.lang.Object obj2 = this.c.get(obj);
        if (obj2 == null) {
            throw new java.util.ConcurrentModificationException(a.bg(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.b = ((nf) obj2).b;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}

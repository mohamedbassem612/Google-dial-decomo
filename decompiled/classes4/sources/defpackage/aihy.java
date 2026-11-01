package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aihy implements java.util.Iterator {
    java.util.Iterator a = aiif.a;
    final /* synthetic */ java.lang.Iterable b;

    public aihy(java.lang.Iterable iterable) {
        this.b = iterable;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.b.iterator().hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.a.hasNext()) {
            java.util.Iterator it = this.b.iterator();
            this.a = it;
            if (!it.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
        }
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}

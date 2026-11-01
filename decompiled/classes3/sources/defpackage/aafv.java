package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aafv implements java.util.Iterator {
    protected final defpackage.aafu a;
    protected int b = -1;

    public aafv(defpackage.aafu aafuVar) {
        this.a = aafuVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c() + (-1);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (hasNext()) {
            defpackage.aafu aafuVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return aafuVar.d(i);
        }
        throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alcy implements java.util.ListIterator, aoow {
    private final /* synthetic */ java.util.ListIterator a;

    public alcy(java.util.ListIterator listIterator) {
        aooh.f(listIterator, "delegate");
        this.a = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        a.am();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        return this.a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a.am();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        a.am();
    }
}

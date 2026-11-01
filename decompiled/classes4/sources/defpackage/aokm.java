package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aokm implements java.util.ListIterator, aoow {
    final /* synthetic */ defpackage.aokn a;
    private final java.util.ListIterator b;

    public aokm(defpackage.aokn aoknVar, int i) {
        this.a = aoknVar;
        java.util.List list = aoknVar.a;
        if (i >= 0 && i <= aoknVar.a()) {
            this.b = list.listIterator(aoknVar.a() - i);
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("Position index " + i + " must be in range [" + new aopq(0, aoknVar.a()) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        a.am();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        aojo aojoVar = this.a;
        return ajsz.aZ(aojoVar) - this.b.previousIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        aojo aojoVar = this.a;
        return ajsz.aZ(aojoVar) - this.b.nextIndex();
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiim implements java.util.ListIterator {
    boolean a;
    final /* synthetic */ java.util.ListIterator b;
    final /* synthetic */ defpackage.aiin c;

    public aiim(defpackage.aiin aiinVar, java.util.ListIterator listIterator) {
        this.b = listIterator;
        j$.util.Objects.requireNonNull(aiinVar);
        this.c = aiinVar;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        java.util.ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
        this.a = false;
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
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = true;
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = true;
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ahvr.bZ(this.a, "no calls to next() since the last call to remove()");
        this.b.remove();
        this.a = false;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        ahvr.bY(this.a);
        this.b.set(obj);
    }
}

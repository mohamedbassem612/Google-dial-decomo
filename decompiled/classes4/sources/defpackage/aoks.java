package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoks implements java.util.ListIterator, aoow {
    private final defpackage.aokt a;
    private int b;
    private int c = -1;
    private int d;

    public aoks(defpackage.aokt aoktVar, int i) {
        this.a = aoktVar;
        this.b = i;
        this.d = aoktVar.modCount;
    }

    private final void a() {
        if (aokv.a(this.a.d) != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        a();
        int i = this.b;
        this.b = i + 1;
        defpackage.aokt aoktVar = this.a;
        aoktVar.add(i, obj);
        this.c = -1;
        this.d = aoktVar.modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        a();
        int i = this.b;
        defpackage.aokt aoktVar = this.a;
        if (i >= aoktVar.c) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        return aoktVar.a[aoktVar.b + i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        a();
        int i = this.b;
        if (i <= 0) {
            throw new java.util.NoSuchElementException();
        }
        int i2 = i - 1;
        this.b = i2;
        this.c = i2;
        defpackage.aokt aoktVar = this.a;
        return aoktVar.a[aoktVar.b + i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.c;
        if (i == -1) {
            throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        defpackage.aokt aoktVar = this.a;
        aoktVar.d(i);
        this.b = this.c;
        this.c = -1;
        this.d = aoktVar.modCount;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.a.set(i, obj);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoku implements java.util.ListIterator, defpackage.aoow {
    private final defpackage.aokv a;
    private int b;
    private int c = -1;
    private int d;

    public aoku(defpackage.aokv aokvVar, int i) {
        this.a = aokvVar;
        this.b = i;
        this.d = aokvVar.modCount;
    }

    private final void a() {
        if (this.a.modCount != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        a();
        int i = this.b;
        this.b = i + 1;
        defpackage.aokv aokvVar = this.a;
        aokvVar.add(i, obj);
        this.c = -1;
        this.d = aokvVar.modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        a();
        int i = this.b;
        defpackage.aokv aokvVar = this.a;
        if (i >= aokvVar.b) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        return aokvVar.a[i];
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
        return this.a.a[i2];
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
        defpackage.aokv aokvVar = this.a;
        aokvVar.d(i);
        this.b = this.c;
        this.c = -1;
        this.d = aokvVar.modCount;
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

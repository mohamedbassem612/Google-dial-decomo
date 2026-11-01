package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class chp implements java.util.ListIterator, aoow {
    public int a;
    public int b;

    public chp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        a.am();
    }

    public final void b() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        return a.an();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        a.am();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        a.am();
    }
}

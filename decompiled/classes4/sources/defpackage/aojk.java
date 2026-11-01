package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class aojk implements java.util.Iterator, aoow {
    private int a;
    private java.lang.Object b;

    private final boolean d() {
        this.a = 3;
        a();
        return this.a == 1;
    }

    protected abstract void a();

    protected final void b() {
        this.a = 2;
    }

    protected final void c(java.lang.Object obj) {
        this.b = obj;
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i == 0) {
            return d();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.a;
        if (i != 1 && (i == 2 || !d())) {
            throw new java.util.NoSuchElementException();
        }
        this.a = 0;
        return this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}

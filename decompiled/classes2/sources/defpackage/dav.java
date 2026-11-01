package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dav implements java.util.ListIterator, aoow {
    final /* synthetic */ dax a;
    private int b;
    private final int c;
    private final int d;

    public /* synthetic */ dav(dax daxVar, int i, int i2) {
        this(daxVar, 1 == (i2 & 1) ? 0 : i, 0, daxVar.a());
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        java.lang.Object objC = this.a.b.c(i);
        if (objC == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        }
        return (cmv) objC;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b - this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.Object previous() {
        int i = this.b - 1;
        this.b = i;
        java.lang.Object objC = this.a.b.c(i);
        if (objC == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        }
        return (cmv) objC;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.b - this.c) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public dav(dax daxVar, int i, int i2, int i3) {
        this.a = daxVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}

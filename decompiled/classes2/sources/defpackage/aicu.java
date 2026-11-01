package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class aicu implements java.util.Iterator {
    int b;
    int c;
    int d;
    final /* synthetic */ aicv e;

    public aicu(aicv aicvVar) {
        j$.util.Objects.requireNonNull(aicvVar);
        this.e = aicvVar;
        this.b = aicvVar.a.a();
        this.c = -1;
        this.d = aicvVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public abstract java.lang.Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object objA = a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.e(i);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        ahvr.bZ(this.c != -1, "no calls to next() since the last call to remove()");
        aicv aicvVar = this.e;
        aicvVar.b -= (long) aicvVar.a.h(this.c);
        this.b--;
        this.c = -1;
        this.d = aicvVar.a.d;
    }
}

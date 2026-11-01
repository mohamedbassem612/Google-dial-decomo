package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aife implements java.util.Iterator {
    final /* synthetic */ defpackage.aiff a;
    private int b;
    private int c;
    private int d;
    private int e;

    public aife(defpackage.aiff aiffVar) {
        j$.util.Objects.requireNonNull(aiffVar);
        this.a = aiffVar;
        defpackage.aifg aifgVar = aiffVar.b;
        this.b = aifgVar.e;
        this.c = -1;
        this.d = aifgVar.d;
        this.e = aifgVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        defpackage.aiff aiffVar = this.a;
        java.lang.Object objA = aiffVar.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = aiffVar.b.f[i];
        this.e--;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        ahvr.bZ(this.c != -1, "no calls to next() since the last call to remove()");
        int i = this.c;
        defpackage.aifg aifgVar = this.a.b;
        aifgVar.e(i, ahvr.bz(aifgVar.a[i]));
        if (this.b == aifgVar.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = aifgVar.d;
    }
}

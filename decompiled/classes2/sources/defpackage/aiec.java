package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiec implements java.util.Iterator {
    int a;
    int b;
    int c;
    final /* synthetic */ defpackage.aied d;

    public aiec(defpackage.aied aiedVar) {
        j$.util.Objects.requireNonNull(aiedVar);
        this.d = aiedVar;
        this.a = aiedVar.b;
        this.b = aiedVar.a();
        this.c = -1;
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        a();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        defpackage.aied aiedVar = this.d;
        java.lang.Object objC = aiedVar.c(i);
        this.b = aiedVar.b(this.b);
        return objC;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    @Override // java.util.Iterator
    public final void remove() {
        a();
        ahvr.bZ((boolean) ((this.c ^ (-1)) >>> 31), "no calls to next() since the last call to remove()");
        this.a += 32;
        int i = this.c;
        defpackage.aied aiedVar = this.d;
        aiedVar.remove(aiedVar.c(i));
        this.b--;
        this.c = -1;
    }
}

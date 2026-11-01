package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class aidx implements java.util.Iterator {
    int b;
    int c;
    int d;
    final /* synthetic */ defpackage.aieb e;

    public aidx(defpackage.aieb aiebVar) {
        j$.util.Objects.requireNonNull(aiebVar);
        this.e = aiebVar;
        this.b = aiebVar.e;
        this.c = aiebVar.a();
        this.d = -1;
    }

    private final void b() {
        if (this.e.e != this.b) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public abstract java.lang.Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        b();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        java.lang.Object objA = a(i);
        this.c = this.e.b(this.c);
        return objA;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    @Override // java.util.Iterator
    public final void remove() {
        b();
        defpackage.ahvr.bZ((this.d ^ (-1)) >>> 31, "no calls to next() since the last call to remove()");
        this.b += 32;
        int i = this.d;
        defpackage.aieb aiebVar = this.e;
        aiebVar.remove(aiebVar.e(i));
        this.c--;
        this.d = -1;
    }
}

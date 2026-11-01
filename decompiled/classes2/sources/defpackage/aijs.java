package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aijs implements java.util.Iterator {
    private final aijo a;
    private final java.util.Iterator b;
    private int c;
    private int d;
    private boolean e;
    private defpackage.aijp f;

    public aijs(aijo aijoVar, java.util.Iterator it) {
        this.a = aijoVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int iA = this.c;
        if (iA == 0) {
            defpackage.aijp aijpVar = (defpackage.aijp) this.b.next();
            this.f = aijpVar;
            iA = aijpVar.a();
            this.d = iA;
        }
        this.c = iA - 1;
        this.e = true;
        return ((defpackage.aijp) j$.util.Objects.requireNonNull(this.f)).a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ahvr.bZ(this.e, "no calls to next() since the last call to remove()");
        if (this.d == 1) {
            this.b.remove();
        } else {
            this.a.remove(((defpackage.aijp) j$.util.Objects.requireNonNull(this.f)).a);
        }
        this.d--;
        this.e = false;
    }
}

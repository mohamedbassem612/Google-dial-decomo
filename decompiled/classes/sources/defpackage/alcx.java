package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alcx implements java.util.Iterator, defpackage.aoow {
    private final /* synthetic */ java.util.Iterator a;

    public alcx(java.util.Iterator it) {
        defpackage.aooh.f(it, "delegate");
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.a.am();
    }
}

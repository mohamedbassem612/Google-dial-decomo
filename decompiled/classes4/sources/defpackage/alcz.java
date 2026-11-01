package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alcz implements java.util.Iterator, aoow {
    final /* synthetic */ java.util.Iterator a;
    private final /* synthetic */ java.util.Iterator b;

    public alcz(java.util.Iterator it) {
        this.a = it;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return new defpackage.aldb((java.util.Map.Entry) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
